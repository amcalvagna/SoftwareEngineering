import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class IteratorTest {

    Vector<String> listOfStrings = new Vector<String>();
    //List<String> listOfStrings = new ArrayList<String>();

    public  IteratorTest (){
            for(int i=0; i<10; i++) listOfStrings.add(new String("String#"+i));
    }
    
    public void myTest(){

        System.out.println("con for loop tradizionale...");
        for (int i=0; i<listOfStrings.size();i++)  System.out.println(listOfStrings.get(i));

        System.out.println("con Enumeration interface...");
        Enumeration<String> enList = listOfStrings.elements();
        for (; enList.hasMoreElements();)  System.out.println(enList.nextElement());

        System.out.println("con Iterator hasNext()...");
        Iterator<String> list = listOfStrings.iterator();
        while (list.hasNext()) {
            String x = list.next();
            System.out.println(x);
        }
        
        System.out.println("con ListIterator hasNext()...");
        ListIterator<String> lIt = listOfStrings.listIterator();
        while(lIt.hasNext()) { System.out.println(lIt.next());}  // per arrivare alla fine
        while(lIt.hasPrevious()) System.out.println(lIt.previous()); // scorro alla rovescia

        System.out.println("con Iterable interface...");
        Iterable<String> sameList = listOfStrings;
        for(String s: sameList)  System.out.println(s);

        System.out.println("con Iterable implicito...");
        for(String s: listOfStrings)  System.out.println(s);
        
        System.out.println(" con metodo forEach dell'interfaccia Iterable");
        listOfStrings.forEach(System.out::println);

        System.out.println("con metodo forEach() degli streams ...");
        listOfStrings.stream().forEach((c) -> System.out.println(c));

    }

    public static void main(String args[]) {
        
        //scorro sempre lo stesso aggregato 
        new IteratorTest().myTest();
        
    }


    
}
