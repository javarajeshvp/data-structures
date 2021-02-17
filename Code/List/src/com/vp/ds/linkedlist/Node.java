package com.vp.ds.linkedlist;

import java.io.Serializable;

public class Node implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Object data;
	Node next;
	Node prev;

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node(int data)
	{
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + ", prev=" + prev + "]";
	}

	public Object getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
