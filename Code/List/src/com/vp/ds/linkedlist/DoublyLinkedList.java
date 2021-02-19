package com.vp.ds.linkedlist;

public class DoublyLinkedList {
	Node head;
	Node tail;

	public void append(int val) {
		if (head == null) {
			head = new Node(val);
			tail = head;
		} else {
			Node newNode = new Node(val);
			newNode.setPrev(tail);
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public void preppend(int val) {
		if (head == null) {
			head = new Node(val);
			tail = head;
		} else {

			Node newNode = new Node(val);
			head.setPrev(newNode);
			newNode.setNext(head);
			head = newNode;

		}
	}


	public void deleteAllData(Object val) {
		Node current = head;

		while (current != null) {
			// 1, 2, 3, 4, 5, 6, 7, 8 9
			if (current.getData() == val) {
				if (current.getNext() != null) {
					if (current.getPrev() != null) {
						current.getPrev().setNext(current.getNext());
					} else {
						// This means head has matching record
						head = current.getNext();
					}
					current.getNext().setPrev(current.getPrev());
				} else {
					// Last Node with matching data
					if (current.getPrev() != null) {
						current.getPrev().setNext(null);
					} else {
						// first node with matching data in case node =1
						head = null;
						tail = null;
					}
				}

			}
			current = current.getNext();
		}

	}

	public void deleteFirst(Integer data) {
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
		if (current == null) {
			System.out.print("List is empty");
		} else {
			while (current != null) {
				System.out.print(current.getData() + "|");
				current = current.getNext();
			}
		}

		System.out.print("\n");
	}

	public void displayFromFront() {
		Node current = head;
		if (current == null) {
			System.out.print("List is empty");
		} else {
			while (current != null) {
				System.out.print("Current:" + current.getData());
				if ((current.getNext() != null))
					System.out.print(" Next:" + current.getNext().getData());
				if ((current.getPrev() != null))
					System.out.print(" Prev:" + current.getPrev().getData());
				System.out.print("|");
				current = current.getNext();
			}
		}
		System.out.print("\n");
	}

	public void displayFromBack() {
		Node current = tail;
		while (current != null) {
			System.out.print(current.getData() + "|");
			current = current.getPrev();
		}
		System.out.print("\n");
	}
}
