package com.karan.factorial;

import java.util.Iterator;

public class SinglyLinkedListTest {
	public static void main(String[] args) {
		SingleyLinkedImplmentation<String> singleyLinkedImplmentation = new SingleyLinkedImplmentation<String>();
		singleyLinkedImplmentation.addElement("One");
		singleyLinkedImplmentation.addElement("Two");
		singleyLinkedImplmentation.addElement("Three");
		singleyLinkedImplmentation.addElement("Four");
		singleyLinkedImplmentation.addElement("Five");
		Iterator<String> iterator = singleyLinkedImplmentation.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
