package FactoryMethodReflection;
import java.lang.reflect.InvocationTargetException;

import Products.Product;

// one single parametic Creator example, based on reflection API
// non più abstract
class Creator { //  reflection based example - tested by client.java

    Class<?> cp; //default product

    public Creator(){}

    public Creator(Class<?> cp){
        this.cp = cp;
    }
    
    public Product getProduct(Class<?> cp){
        try {
            return (Product) cp.getConstructor().newInstance();

        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Product getProduct(){
        if (this.cp!=null) try {
            return (Product) this.cp.getConstructor().newInstance();

        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
    public void AnOperation(String cn) throws ClassNotFoundException{
            Class<?> c = Class.forName(cn);
            Product p = this.getProduct(c);
            p.request(); 
         
    }
    
    // altra versione, in overload
    public void AnOperation(Class<?> cp){ 
        Product p = this.getProduct(cp);
        p.request(); 
    }
    
    // altra versione, in overload
    public void AnOperation(){ 
        Product p = this.getProduct();
        p.request(); 
    }


 
}    