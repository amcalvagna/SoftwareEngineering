package AbsFactReflb;
import Products.*;

public class WinStyleFactory extends AbsFact {

    Class<? extends Window> windowClass() {return WinWindow.class;}
    Class<? extends Menu> menuClass() {return WinMenu.class;}
    Class<? extends Button> buttonClass() {return WinButton.class;}
    
} 