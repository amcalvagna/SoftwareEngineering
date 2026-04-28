package ex3;

import java.util.concurrent.Flow.Processor;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;
import java.util.function.Function;

public class ArticleTransformProcessor extends SubmissionPublisher<JavaArticle> implements Processor<Article, JavaArticle> {
    private Subscription subscription;
    final Function<Article, JavaArticle> function;
    
    public ArticleTransformProcessor(Function<Article, JavaArticle> function) {
    	super();
    	this.function = function;
    }
	@Override
	public void onSubscribe(Subscription subscription) {
		System.out.println("---Processor subscribed---");
		this.subscription = subscription;
		subscription.request(1);
	}
	@Override
	public void onNext(Article item) {
		subscription.request(1);
        submit(function.apply(item));
	}
	@Override
	public void onError(Throwable throwable) {
		System.out.println("Error encountered by Publisher or Subscription: "
	              + throwable.getMessage());
	}
	@Override
	public void onComplete() {
	    System.out.println("Processor Completed.");
	}
}