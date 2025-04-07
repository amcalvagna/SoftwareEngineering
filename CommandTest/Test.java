import java.util.*;
import java.lang.reflect.*;

public class Test {
    public static void main(String[] args) throws Exception {
        //set-up del (pluggable) command object
        Vector sample = new Vector();
        
        Class[] argumentTypes = { Object.class };
        Method add = Vector.class.getMethod("addElement", argumentTypes);
        Object[] arguments = { "cat" };
        
        Command test = new Command(sample, add, arguments);

        Class[] argumentTypes2 = { int.class };
        Method get = Vector.class.getMethod("remove", argumentTypes2);
        Object[] arguments2 = { 0 };
        
        Command test2 = new Command(sample, get, arguments2);

        

        //uso del command object
        test.execute();
        test2.execute();
        System.out.println(sample.elementAt(0));
    }
}