package com.vp.ds.stack;

public class StackByArrayV1 {

	String data[];
	int capacity = 0;
	int top = -1;

	
	public StackByArrayV1(int capacity) {
		this.capacity=capacity;
		data = new String[capacity];
	}
	
	public void push(String str) {
		if(top < capacity-1) {
			data[++top] = str;
			System.out.print(" Added " + str);
		}else {
			System.err.println(" Stack is full " + str + " not added ");
		}
	}
	
	public String pop() {
		String valtoPop = null;
		if(top > -1) {
			valtoPop = data[top];
			data[top]=null;
			top--;
			System.out.print("Popping... " + valtoPop);
		}else {
			System.err.println(" Stack is empty ");
		}
		return valtoPop;
	}

	public void display() {
		System.out.print(" [");
		for (String d : data) {
			System.out.print(d);

			System.out.print(",");
		}
		System.out.println("] " + "Current top Index " + top); 
	}

} 
