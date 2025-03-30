package AbsFactRefl;
import Products.Window;
import java.lang.reflect.InvocationTargetException;


// window factory con reflection  
public class WindowFactory  {
    private Class<? extends Window> W; 
    
        public WindowFactory(Class<? extends Window> w){ 
            W = w;
        }
    
        public Window getWindow() {
                    try {
                        return W.getConstructor().newInstance();
                    } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                            | InvocationTargetException | NoSuchMethodException | SecurityException e) {
                        e.printStackTrace();
                        return null;
                    }
        };
    

}
