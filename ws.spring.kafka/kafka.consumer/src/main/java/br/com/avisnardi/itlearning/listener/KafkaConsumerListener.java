package br.com.avisnardi.itlearning.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class KafkaConsumerListener {

	@KafkaListener(topics = "topic-1", groupId = "1")
	public void listen(String message) {
		log.info("Thread: {} received: {}", Thread.currentThread().getId(), message);
	}
	
}
