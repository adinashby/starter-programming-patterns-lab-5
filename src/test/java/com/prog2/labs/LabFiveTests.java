package com.prog2.labs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class LabFiveTests {

	@Test
	void insertionSortListTest1()  {
		ListNode list1 = new ListNode(4);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(1);
		list1.next.next.next = new ListNode(3);
		
		int[] result = { 1, 2, 3, 4 };

		ListNode actual = LabFive.insertionSortList(list1);
		
		int[] actualArray = new int[4];
		int i = 0;
		
		while(actual != null) {
			actualArray[i] = actual.val;
			++i;
			actual = actual.next;
		}

		assertArrayEquals(result, actualArray);
	}
	
	@Test
	void insertionSortListTest2() {
		ListNode list1 = new ListNode(-1);
		list1.next = new ListNode(5);
		list1.next.next = new ListNode(3);
		list1.next.next.next = new ListNode(4);
		list1.next.next.next.next = new ListNode(0);
		
		int[] result = { -1, 0, 3, 4, 5 };

		ListNode actual = LabFive.insertionSortList(list1);
		
		int[] actualArray = new int[5];
		int i = 0;
		
		while(actual != null) {
			actualArray[i] = actual.val;
			++i;
			actual = actual.next;
		}

		assertArrayEquals(result, actualArray);
	}
	
	@Test
	void insertionSortListTest3() {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(5);
		list1.next.next = new ListNode(3);
		list1.next.next.next = new ListNode(2);
		
		int[] result = { 1, 2, 3, 5 };

		ListNode actual = LabFive.insertionSortList(list1);
		
		int[] actualArray = new int[4];
		int i = 0;
		
		while(actual != null) {
			actualArray[i] = actual.val;
			++i;
			actual = actual.next;
		}

		assertArrayEquals(result, actualArray);
	}
	
	@Test
	void insertionSortListTest4() {
		ListNode list1 = new ListNode(9);
		list1.next = new ListNode(4);
		list1.next.next = new ListNode(6);
		
		int[] result = { 4, 6, 9 };

		ListNode actual = LabFive.insertionSortList(list1);
		
		int[] actualArray = new int[3];
		int i = 0;
		
		while(actual != null) {
			actualArray[i] = actual.val;
			++i;
			actual = actual.next;
		}

		assertArrayEquals(result, actualArray);
	}
	
}