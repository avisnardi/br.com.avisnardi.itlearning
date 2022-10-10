package br.com.avisnardi.itlearning.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaProducerController {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@GetMapping("/send")
	public ResponseEntity<?> send() {
		System.out.println("Sending...");
		kafkaTemplate.send("topic-1", "Envio de " + LocalDateTime.now());
		return ResponseEntity.ok().build();
	}
	
}
