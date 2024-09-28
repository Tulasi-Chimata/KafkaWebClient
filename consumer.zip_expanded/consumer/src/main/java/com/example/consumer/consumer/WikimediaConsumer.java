package com.example.consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WikimediaConsumer {
	@KafkaListener(topics="wikimedia-stream",groupId="myGroup")
	public void consumerMessage(String msg) {
		log.info(String.format("Consuming message from wikimedia-stream:: %s", msg));
	}

}
