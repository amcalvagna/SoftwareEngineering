public class Str {
	
	public String foo(boolean a, boolean b) {
    String result = "KO";
    if (a && b) {
			result = "OK";
    } 
    return result;
  }
  /**
	Bytecode
    0: ldc           #16 // String KO
    2: astore_3
    3: iload_1
    4: ifeq          14
    7: iload_2
    8: ifeq          14
    11: ldc          #18 // String OK
    13: astore_3
    14: aload_3
    15: areturn
    LineNumberTable:
    line 4: 0
    line 5: 3
    line 6: 11
    line 8: 14
  */
}
