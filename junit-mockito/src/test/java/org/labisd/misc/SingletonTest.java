package org.labisd.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SingletonTest {
	
	private int counter = 0;
	
	static Singleton mySingleton; 
	//@Before
	@BeforeClass static
	public void setUp(){
		mySingleton = Singleton.getInstance();
	}
 	

    @Test
    public void testAdd10() {
		counter += 10;
		System.out.println("testAdd10 this object: " + this);
		System.out.println("testAdd10 Singleton object: " + Singleton.getInstance());
		System.out.println("testAdd10 Singleton count: " + Singleton.getInstance().add(counter).getCount());
		assertEquals(counter, Singleton.getInstance().getCount());
	}
	
    @Test
    public void testAdd20() {
		counter += 20;
		System.out.println("testAdd20 this object: " + this);
		System.out.println("testAdd20 Singleton object: " + Singleton.getInstance());
		System.out.println("testAdd20 Singleton count: " + Singleton.getInstance().add(counter).getCount());
		assertEquals(counter, Singleton.getInstance().getCount()); 
	}

 	@Test
    public void testAdd1() {
		counter += 1;
		System.out.println("testAdd1 this object: " + this);
		System.out.println("testAdd1 mySingleton object: " + mySingleton);
		System.out.println("testAdd1 mySingleton count: " + mySingleton.add(counter).getCount());
		assertEquals(counter, mySingleton.getCount());
	}
 
	//@After					
	@AfterClass static	//in questo caso il reset è ridondante 
    public void testReset() {
		Singleton.getInstance().reset(); 
		assertTrue(Singleton.getInstance().getCount()==0);
	}

}
