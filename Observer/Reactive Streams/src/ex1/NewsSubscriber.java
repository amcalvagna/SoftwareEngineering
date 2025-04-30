package ex1;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsSubscriber implements Subscriber<News> {
	private Subscription subscription;
	int count = 0;
	
	@Override
	public void onSubscribe(Subscription subscription) {
       this.subscription = subscription;
       subscription.request(1);
       System.out.println("Subscriber subscribed.");
	}

	@Override
	public void onNext(News item) {
		System.out.println("Received: "+item.getContent());
		readNews(item.getContent());
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
	
	private void readNews(String newsContent) {
		System.out.println("Reading:"+ newsContent);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("---Done---");
	}
	public int getNewsCount() {
		return count;
	}	
}