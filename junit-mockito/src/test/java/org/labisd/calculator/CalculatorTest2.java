package org.labisd.calculator;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class CalculatorTest2 { // classe di test
   private Calculator calc; 
   static int val = 5;
    //int val = 5;

    @Before public void setUp() {
      calc = new Calculator(); // crea istanza
    }

   @Test
   public void testAdd() { // l'annotazione indica il test
      double result = calc.add(10, 50); // chiama metodo da testare
      // controlla il risultato e genera eccezione se result != 60      
      assertEquals(60, result,0);  
      val++; System.out.println("testAdd val="+val); 
   }
   @Test
   public void testAdd2() { // l'annotazione indica il test
   double result = calc.add(10, 50); // chiama metodo da testare
   // controlla il risultato e genera eccezione se result != 60
   assertEquals(60, result,0);
   System.out.println("testAdd2 val="+val);   
}

   
}                                 