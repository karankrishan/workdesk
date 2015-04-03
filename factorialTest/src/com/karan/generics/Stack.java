package com.karan.generics;

/**
 * @author KARAN KRISHAN
 * This is sample class written to draw the structure of generics
 * @param <E>
 */
public interface Stack<E> {
	boolean isEmpty();

	void push(E elem);

	E pop();
}
