package FactoryMethodReflection;

import Products.*;

public class Client { //reflection example - goes with Creator.java
    

//client application
    public static void main(String[] args) {       
        Product p;
        Creator myApp = new Creator(); 

        myApp.AnOperation(CProduct.class);
       
        try {
            myApp.AnOperation("Products.CProduct");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        p = myApp.getProduct(CProduct.class);
        p.request();

    }


}
