package AbsFact2;
import java.lang.reflect.InvocationTargetException;
import Products.Button;

public class ButtonFactory  {
    private Class<? extends Button > B; 

    public ButtonFactory(Class<? extends Button> b){ 
        B = b;
    }

    public Button getButton() {
         try {
            return B.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }
}

