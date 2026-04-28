package context;

public class Data {

    public Object use(int par, int n, int i, Object o) {

       par++; n++; i++;                         //no side effect
       ((DataProcessor) o).currentValue++;      //side effect
       return System.out.printf("%d\t %d\t %d\n", par, n, i);
    }

}
