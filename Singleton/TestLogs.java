public class TestLogs {
    private Logs lg = Logs.getInstance();

    public void testSingl() {
        initLogs();
        Logs lg2 = Logs.getInstance();
        lg2.record("uno");
        lg2.record("due");
        if (lg.dumpLast().equals("due"))
            System.out.println("OK test logs singl");
        else
            System.out.println("FAILED test logs singl");
    }

    public void testLast() {
        initLogs();
        if (lg.dumpLast().equals("three "))
            System.out.println("OK test logs last");
        else
            System.out.println("FAILED test logs last");
    }

    public void testAll() {
        initLogs();
        if (lg.dumpAll().equals("one two three "))
            System.out.println("OK test logs all");
        else
            System.out.println("FAILED test logs all");
    }

    private void initLogs() {
		lg.empty(); 
        lg.record("one"); 
        lg.record("two"); 
        lg.record("three");
	}

    public static void main(String[] args) {
        TestLogs tl = new TestLogs();
        tl.testSingl();
        tl.testAll();
        tl.testLast();
    }
}