package com.karan.generics;

/**
 * @author KARAN KRISHAN
 * This is sample class written to draw the structure of generics.
 */
public class StackUtil {

	public <T> Stack<T> reverse(Stack<T> in) {
		Stack<T> out = new ArrayStack<T>();
		while(!in.isEmpty()){
			out.push(in.pop());
		}
		return out;
	}
	
}
