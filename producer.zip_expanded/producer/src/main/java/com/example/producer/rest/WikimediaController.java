package com.example.producer.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.producer.stream.WikimediaStreamConsumer;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/wikimedia")
public class WikimediaController {
	
	private final WikimediaStreamConsumer streamConsumer;
	@GetMapping
	public void startPublishing() {
		streamConsumer.consumeStreamAndPublish();
		
	}

}
