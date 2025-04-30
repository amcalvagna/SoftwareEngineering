package ex3;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.SubmissionPublisher;
import java.util.function.Function;

public class ReactiveArticleApp {
  public static void main(String[] args) {
     List<Article> list = Arrays.asList(
         new Article(1, "Java Functional Interface", "Java"),
         new Article(2, "Java Distinct Example", "Java"),
         new Article(3, "Java flatMap Example", "Java")
     );
		
	 Function<Article, JavaArticle> function = article ->
	     new JavaArticle(article.getId(), article.getTitle());

	 ArticleTransformProcessor processor = new ArticleTransformProcessor(function);
	 SubmissionPublisher<Article> publisher = new SubmissionPublisher<>();
	 JavaSubscriber javaSubscriber = new JavaSubscriber();
	 publisher.subscribe(processor);
	 processor.subscribe(javaSubscriber);
	 list.stream().forEach(article -> publisher.submit(article));
	 
	 //Wait to complete subscription
	 while (javaSubscriber.getArticleCount() != 3) {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 processor.close();
	 publisher.close();	 
  }
}
