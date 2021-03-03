package com.vp.ds.binarytree;

public class BinaryTree {

	private Node root;

	public BinaryTree() {
		root = null;

	}

	public void insert(int data) {
		root = insert(root, data);
	}

	private Node insert(Node node, int data) {
		if (node == null) {
			node = new Node(data);
			node.setData(data);
		} else if (node.getData() <= data) {
			node.setRight(insert(node.getRight(), data));
		} else {
			node.setLeft(insert(node.getLeft(), data));
		}

		return node;
	}

	public Node findMin() {
		return findMinRecursive(root);
	}

	private Node findMinRecursive(Node current) {
		if (current != null && current.getLeft() != null) {
			return findMinRecursive(current.getLeft());
		}
		return current;
	}

	public Node findMax() {
		return findMaxRecursive(root);
	}

	private Node findMaxRecursive(Node current) {
		if (current != null && current.getRight() != null) {
			return findMaxRecursive(current.getRight());
		}
		return current;
	}

	public Node find(int val) {

		return findRecursive(root, val);

	}

	private Node findRecursive(Node current, int val) {
		if (current.getData() == val) {
			return current;
		} else if (current.getData() < val) {
			return findRecursive(current.getRight(), val);
		} else {
			return findRecursive(current.getLeft(), val);
		}
	}

	public String displayRight(Node node) {
		StringBuilder str = new StringBuilder();
		str = displayRightRecurssive(node, str);
		System.out.println(str.append("\n "));
		return str.toString();

	}

	public StringBuilder displayRightRecurssive(Node node, StringBuilder str) {

		if (node != null) {
			str.append("\t\\").append('\n');
			str.append("\t").append(node.getData()).append('\n');
			displayRightRecurssive(node.getRight(), str);
		}

		return str;
	}

	public String displayLeft(Node node) {
		StringBuilder str = new StringBuilder();
		str = displayLeftRecurssive(node, str);
		System.out.println(str.append("\n "));
		return str.toString();

	}

	public StringBuilder displayLeftRecurssive(Node node, StringBuilder str) {

		if (node != null) {
			str.append("\t/").append('\n');
			str.append("\t").append(node.getData()).append('\n');
			displayLeftRecurssive(node.getLeft(), str);
		}

		return str;
	}

	// DLR - Data, Left, Right

	public void preorder() {
		preorder(root);
	}

	private void preorder(Node r) {
		if (r != null) {
			System.out.print(r.getData() + " ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}

	// Left, Right, Data
	public void postorder() {
		postorder(root);
	}

	private void postorder(Node r) {
		if (r != null) {
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.print(r.getData() + " ");
		}
	}
	// Left, Data , Right
	public void inorder() {
		inorder(root);
	}

	private void inorder(Node r) {
		if (r != null) {
			inorder(r.getLeft());
			System.out.print(r.getData() + " ");
			inorder(r.getRight());
		}
	}

	/*
	 * 
	 * public String display(Node node) { StringBuilder str = new StringBuilder();
	 * str=displayRecurssive(node,str); System.out.println(str.append("\n "));
	 * return str.toString(); }
	 * 
	 * public StringBuilder displayRecurssive(Node node,StringBuilder str) {
	 * 
	 * if(node != null) { str.append(node.getData()).append('\n'); if(node.getLeft()
	 * != null && node.getRight() !=null) { str.insert(0,
	 * "\t").append("\t/").append('\\').append('\n');
	 * str.append("      ").append(node.getLeft().getData()).append(" ").append(node
	 * .getRight().getData()); }else if(node.getLeft() != null) { str.insert(0,
	 * "\t").append("\t/").append('\n');
	 * str.append("      ").append(node.getLeft().getData()); }else
	 * if(node.getRight() != null){ str.insert(0, "\t").append("\t\\").append('\n');
	 * str.append("\t").append(node.getRight().getData()); } if(node.getLeft()
	 * !=null ) displayRecurssive(node.getLeft(),str); if(node.getRight() !=null )
	 * displayRecurssive(node.getRight(),str);
	 * 
	 * }
	 * 
	 * return str; } public void inorder() { inorder(root); }
	 * 
	 * private void inorder(Node r) { if (r != null) { inorder(r.getLeft());
	 * System.out.print(r.getData() + " "); inorder(r.getRight()); } }
	 * 
	 * 
	 * 
	 * 
	 * public void add(int data) { root = addRecursive(root, data); }
	 * 
	 * private Node addRecursive(Node current, int data) { if (current == null) {
	 * return new Node(data); } else { if (current.getData() < data) {
	 * current.setRight(addRecursive(current.getRight(), data)); } else {
	 * current.setLeft(addRecursive(current.getLeft(), data)); } }
	 * 
	 * return current; }
	 * 
	 * 
	 * public void display() { StringBuilder output = displayRecursive(root, null);
	 * }
	 * 
	 * public StringBuilder displayRecursive(Node current, StringBuilder output) {
	 * if(output == null) { output=new StringBuilder(); }
	 * 
	 * if(current != null) { output.append(current.getData()).append("\n");
	 * if(current.getLeft() !=null) {
	 * 
	 * output.append(current.getLeft().getData()); } if(current.getRight() != null)
	 * { output.append(current.getRight().getData()); } }
	 * 
	 * 
	 * return output;
	 * 
	 * }
	 */
}
