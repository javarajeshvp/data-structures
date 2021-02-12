package com.vp.ds.queue;

public class Queue {
	String data[];
	int capacity = 0;
	int popIndex = 0;
	int pushIndex = 0;

	public Queue(int capacity) {
		this.capacity = capacity;
		pushIndex = capacity;
		popIndex = capacity;
		data = new String[capacity];
	}

	public void push(String str) {

		if (pushIndex > 0) {
			data[--pushIndex] = str;
			System.out.print(" Added " + str);
		} else {
			System.err.println(" Queue is full " + str + " not added ");
		}
	}

	public String pop() {
		String valtoPop = null;
		if (popIndex > 0) {
			valtoPop = data[--popIndex];
			data[popIndex] = null;
			System.out.print("Popping... " + valtoPop);
			rearrange();

		} else {
			System.err.println(" Queue is empty");

		}
		return valtoPop;

	}

	public String peek() {
		if (popIndex > 0) {
			return data[(popIndex - 1)];
		} else {
			return null;
		}
	}

	public void rearrange() {
		for (int i = capacity; i > 1; i--) {
			data[i - 1] = data[i - 2];
		}
		data[0] = null;
		pushIndex++;
		popIndex++;
	}

	public void display() {
		System.out.print(" [");
		for (String d : data) {
			System.out.print(d);

			System.out.print(",");
		}
		System.out.print("] " + "Next Push Index " + (pushIndex));
		System.out.println(" : Next Pop Index " + (popIndex - 1));
	}

}
