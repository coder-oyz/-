package com.oyz.test6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FreeLink {
	List<Process> list =new ArrayList<Process>();//存储被已分配资源得进程
	public int allSize; //内存容量
	public int lessSize;//碎片大小
	
	Node header;
	Scanner sc = new Scanner(System.in);
	public Node init() {
		System.out.print("请输入内存资源量：");
		allSize = sc.nextInt();
		System.out.print("请输入碎片时间：");
		lessSize=sc.nextInt();
		Node head = new Node(0,allSize,null); //size=-1代表为开始节点
		header=head;
		return head;
	}
	
	public void waitRelease() {
		System.out.print("是否需要释放资源(1/0)：");
		int flag=sc.nextInt();
		for(;flag==1;) {
			System.out.print("请输入释放资源的名称：");
			int index=sc.nextInt();
			list.get(index).status=true;
			Process p=list.get(index);
			release(p);
			System.out.print("是否需要释放资源(1/0)：");
			flag=sc.nextInt();
		}
	}
	
	private void release(Process p) {
		Node head=header;
		int start=p.start;
		int end=p.start+p.size;
		//选择处理
		//处理作业前有空闲区
		while(head!=null) {
			//作业前有空闲区
			//两种情况
			if(getBack(head)==start) {
				//两个空闲分区，夹着
				if(head.next!=null && head.next.start==end) {//两个空闲区间以及作业，三个合并
					head.size+=head.next.size+p.size;
					head.next=head.next.next;
				}else {//回收区后没有了，或者是另一个作业
					head.size+=p.size;
				}
				return ;
			}else if(head.start==end){//处理作业前没有空闲区，作业后有空闲区
				head.start-=p.size;
				head.size+=p.size;
				return;
			} 
			head=head.next;
		}
		//处理作业夹在两个作业中间
		insertNode(p);
		
		
	}
	public void insertNode(Process p) {
		
		Node node=header;
		Node temp=new Node(p.start,p.size);
		Node last=getLast();
		if(last.start<p.start) {
			temp.next=null;
			node.next=temp;
			return ;
		}
		
		while(node.next!=null) {
			if(node.next.start>p.start && node.start<p.start) {
				temp.next=node.next;
				node.next=temp;
				return ;
			}
			node=node.next;
		}

	}
	
	public Node getLast() {
		Node node=header;
		while(node.next!=null) {
			node=node.next;
		}
		return node;
	}
	
	public int getBack(Node node) {
		return node.start+node.size;
	}

	public void waitRequest() {
		System.out.print("是否需要请求资源(1/0)：");
		int flag=sc.nextInt();
		sc.nextLine();
		int i=1;
		for(;flag==1;i++) {
			System.out.print("请输入请求资源信息（作业提交时间/作业大小）：");
			int time=sc.nextInt();
			int size=sc.nextInt();
			Process p=new Process(i,time,size);
			if(insertAfter(p)) {
				list.add(p);
			}
			System.out.print("是否需要请求资源(1/0)：");
			flag=sc.nextInt();
			sc.nextLine();
		}
	}
	
	public boolean insertAfter(Process p) {
		Node head=header;
		int ii=0;
		int size=p.size;
		while(head.size<size) {
			if(head.next==null) {
				System.out.println("内存不足分配失败！！");
				return false;
			}
			head=head.next;
			ii++;
		}
		//找到对应的空闲Node
		p.start=head.start+head.size-p.size;
		//判断碎片时间
		if(head.size-size<lessSize) {
			deleteNode(head);
			return true;
		}
		if(ii==0) {
			header.size-=size;
			return true;
		}
		head.size-=size;
		return true;
	}
	
	public boolean insertBefore(Process p) {
		Node head=header;
		int ii=0;
		int size=p.size;
		while(head.size<size) {
			ii++;
			if(head.next==null) {
				System.out.println("内存不足分配失败！！");
				return false;
			}
			head=head.next;
		}
		if(head.size-size<lessSize) {//小于碎片时间
			deleteNode(head);
			return true;
		}
		list.add(p);
		if(ii==0) {
			header.start+=size;
			header.size-=size;
			return true;
		}
		head.start+=size;
		head.size-=size;
		return true;
	}
	
	public void printAll() {
		Node temp=header;
		//打印内存分配情况
		System.out.println("打印内存分配情况:");
		for (Process process : list) {
			System.out.println(process);
		}
		//打印空闲链表
		System.out.println("打印空闲链表:");
		while(temp!=null) {
			System.out.println(temp);
			temp=temp.next;
		}
	}
	
	public void deleteNode(Node node) {
		Node temp=header;
		while(temp.next!=null) {
			if(temp.next==node) {
				temp.next=temp.next.next;
			}
			temp=temp.next;
		}
	}
	
}
