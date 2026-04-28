package ex1;

import java.util.Date;
import java.util.concurrent.SubmissionPublisher;

public class ReactiveNewsApp {
	public static void main(String[] args) throws InterruptedException {
		SubmissionPublisher<News> publisher = new SubmissionPublisher<>();
		NewsSubscriber subscriber = new NewsSubscriber();
		publisher.subscribe(subscriber);
		final int NEWS_COUNT = 3;	
		for(int i=1; i <= NEWS_COUNT; i++) {
			publisher.submit(new News("News-"+ i, new Date()));
		}
		//Wait to complete subscription
		while (subscriber.getNewsCount() != NEWS_COUNT) {
			Thread.sleep(50);
		}
		publisher.close();
	}
}
