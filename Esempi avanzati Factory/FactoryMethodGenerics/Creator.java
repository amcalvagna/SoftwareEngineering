package FactoryMethodGenerics;

import Products.Product;

//modo corretto di usare i generics: a sinistra
abstract class Creator <P extends Product>{ // extends, also for interfaces, to specify upper bound

    abstract public P getProduct();  
        // return new P();  NOT ALLOWED!!!

    public void AnOperation(){ 
          P p = this.getProduct();
          p.request(); 
    }
 
} 