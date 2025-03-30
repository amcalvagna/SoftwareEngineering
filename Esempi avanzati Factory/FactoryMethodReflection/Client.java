package FactoryMethodReflection;

import Products.*;

// one single parametic Creator example, based on reflection API
public class Client { //reflection example - goes with Creator.java
    
//client application
    public static void main(String[] args) {       
        // mode 1: parametric constructor 
        Creator myApp = new Creator(CProductA.class);
        myApp.AnOperation();
        Product p = myApp.getProduct();
        p.request();

        // mode 1: parametric method,  
        myApp = new Creator(); 

        //parametrico con una stringa: meno vincolante
        try { 
            myApp.AnOperation("Products.CProductB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // parametrico col simbolo nome di classe: più vincolante
        myApp.AnOperation(CProductC.class);
        p = myApp.getProduct(CProductA.class);

        p.request();

    }


}
