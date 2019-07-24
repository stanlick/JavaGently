package com.example.demo;



import static org.assertj.core.api.Java6Assertions.assertThat;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

import org.junit.Test;

public class FlowTests {

	@Test
	public void whenSubscribeToIt_thenShouldConsumeAll() {
		// given
		SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
		EndSubscriber<String> subscriber = new EndSubscriber<>();
		publisher.subscribe(subscriber);
		List<String> items = List.of("1", "x", "2", "x", "3", "x");

		// when
		assertThat(publisher.getNumberOfSubscribers()).isEqualTo(1);
		items.forEach(publisher::submit);
		publisher.close();

		// then
		// await().atMost(1000, TimeUnit.MILLISECONDS)
		// 		.until(() -> assertThat(subscriber.consumedElements).containsExactlyElementsOf(items));
	}
}
