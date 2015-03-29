package com.karan.factorial;

public class Pair<A, B> {

	private A a;
	private B b;

	public Pair(A a, B b) {
		this.a = a;
		this.b = b;
	}

	public A getA() {
		return a;
	}

	public B getB() {
		return b;
	}

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<String, Integer>("One", 1);
		System.out.println(pair.getA().equalsIgnoreCase("One"));
		System.out.println(pair.getB() == 1);
	}
}
