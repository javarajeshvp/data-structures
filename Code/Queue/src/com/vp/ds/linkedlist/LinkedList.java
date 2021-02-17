package com.vp.ds.linkedlist;

public class LinkedList {
	Node head;

	public void append(int val) {
		if (head == null) {
			head = new Node(val);
		} else {

			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node(val);
		}

	}

	public void preppend(int val) {
		if (head == null) {
			head = new Node(val);
		} else {

			Node newHead = new Node(val);
			newHead.next = head;
			head = newHead;

		}
	}

	public void delete(int data) {
		if (head.data == data) {
			head = head.next;
		} else {
			Node current = head.next;
			while (current != null) {
				if (current.data == data) {
					current.next = current.next.next;
				} else {
					current = current.next;
				}
			}
		}
	}

	public void display() {
		Node current = head;
		if (current != null) {

			while (current != null) {
				System.out.print(current.data + ",");
				current = current.next;
			}
			System.out.print("\n");
		}
	}
}
