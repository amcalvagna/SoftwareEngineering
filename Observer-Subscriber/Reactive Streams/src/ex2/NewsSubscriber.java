package ex2;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

import ex1.News;

public class NewsSubscriber implements Subscriber<News> {
	private Subscription subscription;
	int count = 0;
	private String personName;
	public NewsSubscriber(String personName) {
		this.personName = personName;
	}
	@Override
	public void onSubscribe(Subscription subscription) {
       this.subscription = subscription;
       subscription.request(1);
       System.out.println(personName + " subscribed for news.");
	}

	@Override
	public void onNext(News item) {
		System.out.println(personName + " received: "+item.getContent());
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
        System.out.println("Subscription completed for "+ personName +". Total Number of Subscription is "+ count);		
	}
	
	private void readNews(String newsContent) {
		System.out.println(personName + " reading: "+ newsContent);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public int getNewsCount() {
		return count;
	}	
}