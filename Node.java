package com.oyz.test6;

public class Node  {
	public int start;
	public int size;
	public Node next;
	
	
	public Node(int start,int size, Node next) {
		super();
		this.start=start;
		this.size = size;
		this.next = next;
		
	}
	public Node(int start,int size) {
		super();
		this.start=start;
		this.size = size;
		
	}

	public Node() {
		super();
	}

	@Override
	public String toString() {
		return "Node [start=" + start + ", size=" + size + "]";
	}
	
	

	
	
}
