// classe con il metodo main
public class MainEditor {
	public static void main(String args[]) {
		TextEditor ed1 = CreatorText.getEng();
		System.out.println("Inserisce hello su Editor con spelling check inglese");
		ed1.put("hello");

		TextEditor ed2 = CreatorText.getIta();
		System.out.println("Inserisce ciao su Editor con spelling check italiano");
		ed2.put("ciao");

		System.out.println("Inserisce hello su Editor con spelling check italiano");
		ed2.put("hello");

		CreatorText.poolSetUp(3);
		System.out.println("Inserisce hello su Editor con spelling check Inglese");
		TextEditor ed3 = CreatorText.getFromPool();
		ed3.put("hello");
		CreatorText.release(ed3);
	}
}