package com.vp.ds.linkedlist;

public class DoublyLinkedList {
	Node head;
	Node last;
	public void append(int val) {
		if (head == null) {
			head = new Node(val);
			last = head;
		} else {
			/*
			Node current = head;
	
			while (current.getNext()!= null) {
				current = current.getNext();
		
			}*/
			Node newNode= new Node(val);
			newNode.setPrev(last);
			last.setNext( newNode);
			last  = newNode ;
		}
	}

	public void preppend(int val) {
		if (head == null) {
			head = new Node(val);
			last = head;
		} else {

			Node newNode = new Node(val);
			head.setPrev(newNode);
			newNode.setNext(head);
			head = newNode;

		}
	}

	public void deleteFirstData(Integer data) {
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

	public void displayFromFront() {
		Node current = head;

			while (current != null) {
				System.out.print(current.getData() + ",");
				current = current.getNext();
			}
			System.out.print("\n");
	}
	public void displayFromBack() {
		Node current = last;
			while (current != null) {
				System.out.print(current.getData() + ",");
				current = current.getPrev();
			}
			System.out.print("\n");
	}
}
