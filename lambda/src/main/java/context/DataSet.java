package context;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class DataSet extends ArrayList<Data>{


    public DataSet(int initialCapacity) {
        super(initialCapacity);
    }

    public DataSet getDataSet(int n) {
        IntStream.range(0, n).forEach(i -> this.add(new Data()));
        return this;    
    }
}
