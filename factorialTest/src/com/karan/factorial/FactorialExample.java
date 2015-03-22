package com.karan.factorial;

public class FactorialExample {

	public static void main(String[] args) {
		System.out.println(factorail(5));
	}

	public static int factorail(int i) {
		int retVal = 1;
		if (i != 0) {
			retVal = i * factorail(i - 1);
		}
		return retVal;
	}
}
