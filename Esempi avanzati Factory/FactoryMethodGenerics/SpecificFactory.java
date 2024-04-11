package FactoryMethodGenerics;

import Products.*;

public class SpecificFactory extends GenericFactory<CProductA> {
    
    @Override
    public CProductA getProduct() {
        return new CProductA();
    }  



    //client application
    public static void main(String[] args) {       
        
        SpecificFactory myOtherApp = new SpecificFactory(); //inferred from declared type
        
        GenericFactory myApp=myOtherApp; //compatible assignment

        myApp.AnOperation(); //any cient can call the service
}

     

}
