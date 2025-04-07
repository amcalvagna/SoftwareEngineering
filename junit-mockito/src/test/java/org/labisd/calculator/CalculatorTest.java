package org.labisd.calculator;

import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest { // classe di test
    static int val = 5;
   // int val = 5;

   @Test
   public void testAdd() { // l'annotazione indica il test
      Calculator c = new Calculator(); // crea istanza
      double result = c.add(10, 50); // chiama metodo da testare
      // controlla il risultato e genera eccezione se result != 60      
      assertEquals(60, result,0);  
      val++; System.out.println("testAdd val="+val); 
   }
   @Test
   public void testAdd2() { // l'annotazione indica il test
   Calculator c = new Calculator(); // crea istanza
   double result = c.add(10, 50); // chiama metodo da testare
   // controlla il risultato e genera eccezione se result != 60
   assertEquals(60, result,0);
   System.out.println("testAdd2 val="+val);   
}

   
}                                 