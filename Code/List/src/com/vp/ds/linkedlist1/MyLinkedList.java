package com.vp.ds.linkedlist1;

public class MyLinkedList {

	private Element topElement;
	int size = 0;

	public boolean add(DataVO data) {
		if (topElement == null) {
			topElement = new Element(data);
		} else {
			Element currentElement = topElement;
			while (currentElement.getNext() != null) {
				currentElement = currentElement.getNext();
			}
			currentElement.setNext(new Element(data));
		}
		size++;
		return true;
	}
	
	public boolean insert(DataVO data, int index) {
		
		Element newElement = new Element(data);
		Element currentElement = get(index);
		newElement.setNext(currentElement.getNext());
		currentElement.setNext(newElement);
		size++;
		return true;
	}
	
	public boolean remove(int index) {
		Element currentElement = get(index);
		
		Element nextElement = currentElement.getNext();
		
		currentElement.setNext(nextElement.getNext());
		
		return true;
	}

	public Element get(int index) {
		int counter = 0;
		Element currentElement = topElement;
		while (currentElement != null) {
			if (counter == index) {
				break;
			} else {
				counter++;
				currentElement = currentElement.getNext();
			}
		}
		return currentElement;
	}

	public void print() {
		Element currentElement = topElement;
		while (currentElement != null) {
			System.out.println(currentElement.getData());
			currentElement = currentElement.getNext();
		}
		System.out.println("**********");
	}

	public void print(Element Element) {
		System.out.println(Element.getData());
		System.out.println("**********");
	}
}
