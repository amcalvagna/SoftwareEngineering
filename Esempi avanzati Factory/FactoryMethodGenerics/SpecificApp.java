package FactoryMethodGenerics;

import Products.*;

public class SpecificApp extends GenericApp<CProduct> {
    
    @Override
    public CProduct getProduct() {
        return new CProduct();
    }  



    //client application
    public static void main(String[] args) {       
        
        SpecificApp myOtherApp = new SpecificApp(); //inferred from declared type
        
        GenericApp myApp=myOtherApp; //compatible assignment

        myApp.AnOperation(); //any cient can call the service
}

     

}
