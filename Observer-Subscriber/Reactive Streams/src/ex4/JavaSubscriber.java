package ex4;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

import ex3.JavaArticle;

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
		count++;
		readArticle(item.getTitle());
		if (count == 1) {
		   subscription.cancel();	
		} else {
		   subscription.request(1);
		}
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
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("---Done---");
	}
	public int getArticleCount() {
		return count;
	}	
}
