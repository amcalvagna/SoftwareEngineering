package ex3;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class JavaSubscriber implements Subscriber<JavaArticle> {
	private Subscription subscription;
	int count = 0;
	
	@Override
	public void onSubscribe(Subscription subscription) {
		System.out.println("---Subscriber subscribed---");
		this.subscription = subscription;
		subscription.request(1);
	}
	@Override
	public void onNext(JavaArticle item) {
		System.out.println("Received Java Artcile with id: "+item.getId());
		readArticle(item.getTitle());
		subscription.request(1);
		count++;
	}
	@Override
	public void onError(Throwable throwable) {
		System.out.println("Error encountered by Publisher or Subscription: "
	              + throwable.getMessage());
	}
	@Override
	public void onComplete() {
        System.out.println("Subscription completed. Total Number of Subscription is "+ count);		
	}
	
	private void readArticle(String tile) {
		System.out.println("Reading: "+ tile);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("---Done---");
	}
	public int getArticleCount() {
		return count;
	}	
}
