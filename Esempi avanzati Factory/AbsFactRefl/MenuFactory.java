package AbsFactRefl;

import java.lang.reflect.InvocationTargetException;

import Products.Menu;

public class MenuFactory  {
    private Class<? extends Menu> M; 

    public MenuFactory(Class<? extends Menu> m){ 
        M = m;
    }

    public Menu getMenu() {
        try {
            return M.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
            return null;
        }
    };

}
