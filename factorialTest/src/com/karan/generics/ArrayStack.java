package com.karan.generics;

/**
 * @author KARAN KRISHAN
 * This is sample class written to draw the structure of generics
 * @param <E>
 */
public class ArrayStack<E> implements Stack<E> {

	private E elemt;

	@Override
	public boolean isEmpty() {
		return Boolean.TRUE;
	}

	@Override
	public void push(E elem) {
		System.out.println("Pushed " + elem);
		elemt = elem;
	}

	@Override
	public E pop() {
		return elemt;
	}

}
