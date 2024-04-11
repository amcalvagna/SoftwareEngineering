package FactoryMethodReflection;
import java.lang.reflect.InvocationTargetException;

import Products.Product;

class  Creator { //  reflection based example - tested by client.java
    
    public Product getProduct(Class<?> cp){
        try {
            return (Product) cp.getConstructor().newInstance();

        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void AnOperation(String cn) throws ClassNotFoundException{
            Class<?> c = Class.forName(cn);
            Product p = this.getProduct(c);
            p.request(); 
         
    }

    public void AnOperation(Class<?> cp){ 
        Product p = this.getProduct(cp);
        p.request(); 
  }
 
}    