package org.labisd.sub;

public class Sub {
	int a;
	int b;
	int result;

	public Sub(int a, int b) {
		this.a = a;
		this.b = b;
		this.result = a - b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getResult() {
		return result;
	}
}
