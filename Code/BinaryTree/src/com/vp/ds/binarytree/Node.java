package com.vp.ds.binarytree;

public class Node {

	private Node left;
	private Node right;
	private int data;
	public Node(int data)
	{
		this.data = data;
		left = null;
        right = null;
	}
	
	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [left=" + left + ", right=" + right + ", data=" + data + "]";
	}

	/*
	@Override
	public String toString() {
		//return "[" + left.getData() + "<-" + data + "->" + right.getData() + "]";
		
		StringBuilder out = new StringBuilder();
		
		if(this !=null) {
			out.append(this.data);
			
			if(this.getLeft() != null) {
				out.insert(0, this.getLeft().getData()+"<-");
			}
			if(this.getRight()!=null) {
				out.append("->"+this.getRight().getData());
			}
		}
			
		return out.toString();
		
	}
*/

}
