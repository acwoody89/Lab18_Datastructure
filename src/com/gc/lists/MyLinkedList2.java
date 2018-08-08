package com.gc.lists;

public class MyLinkedList2 implements MyList{

	// if head is null, the list is empty
	private Node head = null; // the head is the first Node in the list
	private int length = 0;
	
	@Override
	public void addAtBeginning(String data) {
		// add a new node and set it as the new head
		head = new Node(data, head);
		length++;
		
	}

	@Override
	public void removeFromBeginning() {
		// find the second node and set it as the new head node
		head = head.getNext();
		length--;
		
	}

	@Override
	public void addAtEnd(String data) {
		
		
	}

	@Override
	public void removeFromEnd() {
		if(length < 2) {
			// the beginning is the end
			removeFromBeginning(); // this will make the list empty
		} else { 
			// find the node right before the end
			Node beforeTail = getNodeAt(length - 2);
			// set its next to null. This ends the list.
			beforeTail.setNext(null);
			length--;
		}
		
	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		return getNodeAt(index).getData();
	}
	
	private Node getNodeAt(int index) {
		// start at the head
		Node node = head;
		
		// follow the links btwn nodes until it counts off the right number
		for(int i = 0; i < length; i++) {
			if(node == null) {
				// in case we run out of node before we get to the desired index, return null
				return null;
			}
			node = node.getNext();
		}
		return node;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return length;
	}

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// start at the head
		Node node = head;
		
		// follow the links btwn nodes until it reaches the end
		
		while(node != null) {
			sb.append(node.toString());
			node = node.getNext();
		}
		return sb.toString();
	}
}
