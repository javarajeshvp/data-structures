package com.vp.ds.linkedlist1;

public class Element {

	private Element next;
	private Element previous;
	private DataVO data;
	
	public Element(DataVO data)
	{
		this.data = data; 
	}
	public Element getNext() {
		return next;
	}
	public void setNext(Element next) {
		this.next = next;
	}
	public Element getPrevious() {
		return previous;
	}
	public void setPrevious(Element previous) {
		this.previous = previous;
	}
	public DataVO getData() {
		return data;
	}
	public void setData(DataVO data) {
		this.data = data;
	}

	
}
