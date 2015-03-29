package com.karan.factorial;

public class Cel<T> {

	private T field;

	public Cel(T t) {
		this.field = t;
	}

	public T getField() {
		return field;
	}
}
