package FactoryMethodGenerics;

import Products.*;

//modo corretto di usare i generics
public class ConcreteCreator extends Creator<CProductA> {
    
    @Override
    public CProductA getProduct() {  //posso specializzare il valore di ritorno 
        return new CProductA();
    }  



    //client application
    public static void main(String[] args) {       
        
        Creator<?> myApp = new ConcreteCreator(); //Concrete object used as a generic creator
        
        myApp.AnOperation(); //client can call the service, using the specific service object CProduct without knowing
        myApp.getProduct().request();
}

     

}
