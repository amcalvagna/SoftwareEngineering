package AbsFactRefl;
import Products.Button;
import Products.Menu;
import Products.Window;

// VERSIONE 3: stesso creator ma 
// le factory esterne useranno la reflection 
// e ne servira' solo una per prodotto, non anche per variante
public abstract class AbsFact {  
    MenuFactory menuFactory; 
    WindowFactory windowFactory;
    ButtonFactory buttonFactory;
    
    Menu getMenu() { return menuFactory.getMenu();}
    Window getWindow() { return windowFactory.getWindow();}
    Button getButton() { return buttonFactory.getButton();}
   
}



