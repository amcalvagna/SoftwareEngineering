package AbsFactExt;

//sottoclasso per incapsulare le factory preesistenti esterne
public class MacStyleFactory extends AbsFact {
  
    public MacStyleFactory() { 
        menuFactory = new MacMenuFactory();
        windowFactory = new MacWindowFactory();
        buttonFactory = new MacButtonFactory(); 
        
    }
}