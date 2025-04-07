package org.labisd.sum;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SommatoreParamTest {
	private int a;  // variabili usate nel test
	private int b;
	private int expected; 
	
	@Parameters
	public static Collection<Integer[]> getParam() { // fornisce i parametri 
		return Arrays.asList(new Integer[][] { 
		   // a, b, expected
			{ 1, 1, 2 }, 
			{ 3, 2, 5 }, 
			{ 4, 3, 7 }, 
		});
	}
	
	public SommatoreParamTest(int a, int b, int expected) { // inizializza parametri 
		this.a = a; 
		this.b = b;
		this.expected = expected;
	}
	
	@Test
	public void testSum() {
		Sommatore sommatore = new Sommatore();
		assertEquals(expected, sommatore.sum(a, b));
		System.out.println("sommatore("+a+","+b+") = "+expected);
	}
}
