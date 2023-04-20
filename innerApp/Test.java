
class Test {
	public static void main(String args[]) { 
		Context c = new Context(); 

		//passo come inner class una istanza anonima sottoclasse di Strategy
		c.executeTask( new Strategy()  { 
					       public String appliedStrategy(int x) { 
						        return x+" squared"; 
                    	    } 
					    }
		); 
        
	}
} 