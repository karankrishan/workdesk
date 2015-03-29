package com.karan.factorial;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SingleyLinkedImplmentation<E>{

	private Node first = new Node(null);
	private Node last = first;
	private int size;

	private class Node {
		private E element;
		private Node next;

		Node(E e) {
			element = e;
		}
	}

	public void addElement(E element) {
		last.next = new Node(element);
		last = last.next;
		size++;
	}

	
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			private Node current = first;

			@Override
			public boolean hasNext() {
				return current.next != null;
			}

			@Override
			public E next() {
				if (current.next != null) {
					current = current.next;
				} else {
					new NoSuchElementException("No such element found.");
				}

				return current.element;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	
	public int size() {
		return size;
	}

}
