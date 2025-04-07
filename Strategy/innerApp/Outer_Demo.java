class Outer_Demo {  //only public or default access for outer classes
    // private variable of the outer class
    private int num = 175;  
    
   private interface InnerStrategy {
       int doComputation();
   }
    // inner class
    class Inner_Demo implements InnerStrategy{      
       public int getNum() {
          System.out.println("This is the getnum method of the inner class:");
          return num;
       }

        public int doComputation(){ 
         System.out.println("applying the choosen inner strategy...");
         return ++num; 
       }
    }
    class otherInnerStrategy implements InnerStrategy{
      public int doComputation(){ 
         return --num;
       }
    }

    // context applies the strategy in its computation
    int compute(Inner_Demo ic){ 
         return 2*ic.doComputation()+1; 
    }
 }
    
 