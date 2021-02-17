package com.vp.ds.linkedlist;

public class LinkedListV1 {
	Node head;

	public void append(int val) {
		if (head == null) {
			head = new Node(val);
		} else {

			Node current = head;
			while (current.getNext()!= null) {
				current = current.getNext();
			}
			current.setNext( new Node(val));
		}

	}

	public void preppend(int val) {
		if (head == null) {
			head = new Node(val);
		} else {

			Node newHead = new Node(val);
			newHead.setNext(head);
			head = newHead;

		}
	}

	public void deleteByData(int data) {
		if (head.getData() == data) {
			head = head.getNext();
		} else {
			Node current = head;
			while (current.getNext() != null) {
				if (current.getNext().getData() == data) {
					current.setNext(current.getNext().getNext());
					break;
				} 
				current = current.getNext();
			}
		}
	}

	public void display() {
		Node current = head;

			while (current != null) {
				System.out.print(current.getData() + ",");
				current = current.getNext();
			}
			System.out.print("\n");
	}
}
