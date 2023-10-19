package com.vp.ds.stack;

import java.util.Arrays;

public class StackByArrayV1{
	
	int capacity;
	int size=-1;
	String data[] = null;
	public StackByArrayV1(int capacity) {
		this.capacity = capacity;
		data = new String[capacity];
	}
	
	public boolean push(String val) {
		boolean isPushed = false;
		if(size < capacity)
		{
			size++;
			data[size]=val;
			isPushed =  true;
		}
		return isPushed;
	}
	
	public String pop () {
		String val=null;
		
		if(size != -1) {
			val= data[size];
			data[size] = null;
		}
		size--;
		return val;
		
	}
	
	public void display()
	{
		Arrays.asList(data).forEach(System.out::println);
	}
	
	public static void main(String arg[]) {
	
		
		StackByArrayV1 stack= new StackByArrayV1(6);
		
		stack.push("R");
		stack.push("A");
		stack.push("J");
		stack.push("E");
		stack.push("S");
		stack.push("H");
		stack.pop ();
		stack.pop ();stack.pop ();
		stack.display();
	}
}
