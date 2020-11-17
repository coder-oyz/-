package com.oyz.test6;

public class Process {
	
	public int name; //作业名
	public int size;//作业大小
	public int time;  //作业提交时间
	public int start; //起始地址
	public boolean status;//是否完成
	
	
	public Process(int name,int time,int size) {
		this.name=name;
		this.size = size;
		this.time=time;
		this.status=false;
	}

	public Process() {
		
	}

	@Override
	public String toString() {
		if(status) {
			return "time--"+time+"作业开始    P"+name+"   作业大小  "+size+"     已完成";
		}else {
			return "time--"+time+"作业开始    P"+name+"   作业大小  "+size+"     占据内存--起始地址"+start;
		}
	}

	
	
	
}
