package com.kilo;

public class TestSwap {
	private int array[];
	private int counter;
	private int minNum = 10;
	private int maxNum = 0;

	public TestSwap(int size) {
		array = new int[size];
		counter = 0;
	}

	public void push(int num) {
		array[counter] = num;
		counter = counter + 1;
		checkMin(num);
		checkMax(num);
	}

	private void checkMax(int num) {
		if (num > maxNum) {
			maxNum = num;
		}
	}

	public void display() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		TestSwap testSwap = new TestSwap(5);
		testSwap.push(5);
		testSwap.push(51);
		testSwap.push(85);
		testSwap.push(4);
		testSwap.push(45);
		
		testSwap.display();
		System.out.println("Min number is " + testSwap.getMinNum());
		System.out.println("Max number is " + testSwap.maxNum);
	}

	private void checkMin(int a) {
		if (a < minNum) {
			minNum = a;
		}
	}

	public int getMinNum() {
		return minNum;
	}
}
