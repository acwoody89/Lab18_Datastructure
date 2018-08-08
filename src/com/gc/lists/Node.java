package com.gc.lists;

public class Node {

	private String data;
	private Node next;

	public Node() {

	}

	public Node(String data, Node next) {
		this.data = data;
		this.next = next;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (next != null) {
			return data + " -> ";
		} else {
			return data;
		}
	}
}
