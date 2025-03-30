package FactoryMethodReflection;

import Products.*;

public class WrongClient { //reflection example - goes with Creator.java
    
//client application
    public static void main(String[] args) {       
        
        WrongCreator<?> myApp = new WrongCreator<CProductB>(); //this is compile time specified...

        myApp.AnOperation();
        
        Product p = myApp.getProduct();

        p.request();

    }


}
