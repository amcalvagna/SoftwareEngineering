package AbsFactExt;

//sottoclasso per incapsulare le factory preesistenti esterne
public class WinStyleFactory extends AbsFact {

    public WinStyleFactory() { 
        menuFactory = new WinMenuFactory();
        windowFactory = new WinWindowFactory();
        buttonFactory = new WinButtonFactory();  

    } 


    
}