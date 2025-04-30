package ex2;

import java.util.Date;
import java.util.concurrent.SubmissionPublisher;

import ex1.News;

public class ReactiveNewsApp {
	public static void main(String[] args) throws InterruptedException {
		SubmissionPublisher<News> publisher = new SubmissionPublisher<>();
		NewsSubscriber mahesh = new NewsSubscriber("Mahesh");
		NewsSubscriber krishna = new NewsSubscriber("Krishna");
		publisher.subscribe(mahesh);
		publisher.subscribe(krishna);
	    final int NEWS_COUNT = 2;	
		for(int i=1; i <= NEWS_COUNT; i++) {
			publisher.submit(new News("News-"+ i, new Date()));
		}
		//Wait to complete subscription
		while (mahesh.getNewsCount() != NEWS_COUNT || krishna.getNewsCount() != NEWS_COUNT) {
			Thread.sleep(50);
		}
		publisher.close();
	}
}
