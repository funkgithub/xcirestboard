package net.developia.board.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class JihoonController {
	@GetMapping()
	public String getAction() {
		log.info("Get Action 수행 중...");
		return "Get Action 수행 중...";
	}
	
	@PostMapping(produces="plain/text;charset=utf8")
	public String postAction() {
		log.info("POST Action 수행 중...");
		return "POST Action 수행 중...";
	}
	
	@PutMapping("/")
	public String putAction() {
		log.info("PUT Action 수행 중...");
		return "PUT Action 수행 중...";
	}
	
	@DeleteMapping("/")
	public String deleteAction() {
		log.info("DELETE Action 수행 중...");
		return "DELETE Action 수행 중...";
	}
}
