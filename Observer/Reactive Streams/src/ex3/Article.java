package ex3;

public class Article {
	private int id;
	private String title;
	private String category;
	public Article(int id, String title, String category) {
		this.id = id;
		this.title = title;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
}
