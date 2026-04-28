package context;
//no side-effects are allowed in lambdas from local method instance context
//only from context class fields, since they stay visible and consistent between method executions 

class DataProcessor { 
    int currentValue=0;
    
    public void process(int par) {  
        int n = 10; // eff. Final 
        DataSet myData = (new DataSet(10)).getDataSet(n); 
        myData.forEach(d->d.use(par, n, this.currentValue++, this));
        //myData.forEach(d->d.use(par++, n++, this.currentValue++, this));  //error

    } 

    public static void main (String args[]){
        new DataProcessor().process(0);
    }
}