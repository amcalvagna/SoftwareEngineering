package FactoryMethodGenerics;

import Products.Product;

abstract class GenericFactory <P extends Product>{ // extendds, also for interfaces, to specify upper bound

    abstract public P getProduct();  
        // return new P();  NOT ALLOWED!!!

    public void AnOperation(){ 
          P p = this.getProduct();
          p.request(); 
    }
 
} 