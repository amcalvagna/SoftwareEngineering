package AbsFactReflb;
import java.lang.reflect.InvocationTargetException;
import Products.Button;
import Products.Menu;
import Products.Window;

// VERSIONE 3b: senza alcun creator per i prodotti, conoscendo solo le loro classi
public abstract class AbsFact {  
    abstract Class<? extends Window> windowClass();
    abstract Class<? extends Menu> menuClass();
    abstract Class<? extends Button> buttonClass();
    
    public Button getButton() {
        try {
           return (Button) buttonClass().getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
               | NoSuchMethodException | SecurityException e) {
           e.printStackTrace();
           return null;
       }
    }
    
    public Menu getMenu() {
        try {
           return (Menu) menuClass().getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
               | NoSuchMethodException | SecurityException e) {
           e.printStackTrace();
           return null;
        }
        
        
    }

    public Window getWindow() {
        try {
           return (Window) windowClass().getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
               | NoSuchMethodException | SecurityException e) {
           e.printStackTrace();
           return null;
        }
    } 
   
}    



