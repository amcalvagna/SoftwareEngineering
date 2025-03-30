package FactoryMethodReflection;
import java.lang.reflect.InvocationTargetException;

import Products.Product;

// Implementazione con generics e reflection: formalmente corretta ma errata, non possibile

// i generics sono simboli risolti comunque a compile-time: li puoi usare solo a sinistra di un assegnamento
// a run-time controllo solo che abbia (dynamic binding) a destra un tipo attuale compatibile con la sinistra che ERA generica 
// sono etichette come lo erano i "#define", ma elaborate in compilazione invece che pre-processate
// la reflection è una API che a run-time ispeziona oggetti reali allocati in memoria: sono due cose non direttamente combinabili  
class WrongCreator <T extends Product> { 

    T  obj; //
    Class<?> cp =  obj.getClass(); //exception: at run time obj is null...

    public Product getProduct(){
        try {
            return (Product) cp.getConstructor().newInstance();

        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void AnOperation(){ 
        Product p = this.getProduct();
        p.request(); 
  }
 
}    