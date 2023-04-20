class Outer_Demo {
    // private variable of the outer class
    private int num = 175;  
    
    // inner class
    class Inner_Demo {
       public int getNum() {
          System.out.println("This is the getnum method of the inner class:");
          return num;
       }
    }
 }
    
 