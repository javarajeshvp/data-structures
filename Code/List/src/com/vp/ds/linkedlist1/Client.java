package com.vp.ds.linkedlist1;

public class Client {

	
	public static void main(String arg[]) {
		
		MyLinkedList list = new MyLinkedList();
		list.add(new DataVO("Albert",10));
		list.add(new DataVO("Bjju",11));
		list.add(new DataVO("Charles",12));
		list.add(new DataVO("David",13));
		list.add(new DataVO("Edward",14));
		
		list.insert(new DataVO("Rajesh",122),0);
		list.print();
		list.remove(1);
		list.print();
		//list.print(list.get(2));
	}
	
}
