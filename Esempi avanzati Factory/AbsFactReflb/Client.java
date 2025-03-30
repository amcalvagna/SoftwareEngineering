package AbsFactReflb;

import Products.Menu;
import Products.Window;
import Products.Button;

public class Client {

    public static void main(String[] args) {
        AbsFact myApp = new WinStyleFactory(); 

        Menu m = myApp.getMenu();
        m.draw();
        Window w = myApp.getWindow();
        w.draw();
        Button b = myApp.getButton();
        b.draw();

        myApp = new MacStyleFactory(); 

        myApp.getMenu().draw();
        myApp.getWindow().draw();
        myApp.getButton().draw();
        
    }

}
