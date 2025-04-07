package AbsFactReflb;
import Products.*;

public class MacStyleFactory extends AbsFact {

    Class<? extends Window> windowClass() {return MacWindow.class;}
    Class<? extends Menu> menuClass() {return MacMenu.class;}
    Class<? extends Button> buttonClass() {return MacButton.class;}
    
} 