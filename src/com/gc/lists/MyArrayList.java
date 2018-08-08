/**
 * 
 */
package com.gc.lists;

import java.util.Arrays;

/**
 * @author User1
 *
 */
public class MyArrayList implements MyList {

	String[] array = new String[4];
	
	int length = 0;
	
	private boolean isFull() {
		return length == array.length;
	}
	
	private void doubleLength() {
		// make a new copy of the array that is twice as long
		array = Arrays.copyOf(array, array.length * 2);
	}
	
	@Override
	public void addAtBeginning(String data) {
		if(isFull()) {
			doubleLength();
		}
		
		// loop backwards and shift all the items over to make room for the new one
		for(int i = length; i > 0; i--) {
			array[i] = array[i - 1]; // array[i] first null value {"0", "1", "2", "3", null} becomes { null, "0", "1", "2", "3"}
			
		}
		
		// set first element and increment length
		array[0] = data;   // {null, "0", "1", "2", "3"} --- > {data, "0", "1", "2", "3"}
		length++;
	}

	
	@Override
	public void removeFromBeginning() {
		if(isFull()) {
			doubleLength();
		}
		
		// loop backwards and shift all the items over to make room for the new one
		for(int i = 0; i < length; i++) {
			array[i] = array[i + 1]; // array[i] first null value {"0", "1", "2", "3", null} becomes { null, "0", "1", "2", "3"}
			
		}
		length--;
	}

	
	@Override
	public void addAtEnd(String data) {
		
		if(isFull()) {
			doubleLength();
		}
		
		// set the next item in the array and increment the length
		array[length] = data;
		length++;

	}

	
	@Override
	public void removeFromEnd() {
		// clear the last slot and decrement
		array[length - 1] = null;
		length--;

	}

	
	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		return array[index];
	}


	@Override
	public int size() {
		
		return length;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[ ");
		
		for(int i = 0; i < length; i++) {
			sb.append(array[i]);
			if(i != length-1) { // won't add a comma after the last value
				sb.append(", ");
			}
		}
		sb.append(" ]");
		return sb.toString();
	}

}
