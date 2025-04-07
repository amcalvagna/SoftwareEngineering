package org.labisd.misc;

public class Singleton {
	private static Singleton instance = new Singleton();
	private int count=0;

	public static Singleton getInstance() {
		return instance;
	}

	Singleton add(int val) { count+=val; return this; }
	Singleton reset() { count = 0; return this; }
	int getCount() {return this.count;}
}
