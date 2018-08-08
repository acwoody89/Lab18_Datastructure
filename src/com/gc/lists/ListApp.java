package com.gc.lists;

public class ListApp {
	public static void main(String[] args) {
		//MyList list = new MyArrayList();
		//test(list);
		
		MyList list = new MyLinkedList();
		test(list);
	}
	
	private static void test(MyList list) {
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.addAtBeginning("C");
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.removeFromBeginning();
		System.out.println(list);
	}
}
