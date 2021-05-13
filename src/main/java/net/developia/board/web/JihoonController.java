package net.developia.board.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller

@RequestMapping("rest2")
public class JihoonController {
	@GetMapping(produces="plain/text;charset=utf8")
	@ResponseBody
	public String getAction() {
		log.info("Get Action 수행 중...");
		return "Get Action 수행 중...";
	}
	
	@PostMapping(produces="plain/text;charset=utf8")
	@ResponseBody
	public String postAction() {
		log.info("POST Action 수행 중...");
		return "POST Action 수행 중...";
	}
	
	@PutMapping(produces="plain/text;charset=utf8")
	@ResponseBody
	public String putAction() {
		log.info("PUT Action 수행 중...");
		return "PUT Action 수행 중...";
	}
	
	@DeleteMapping(produces="plain/text;charset=utf8")
	@ResponseBody
	public String deleteAction() {
		log.info("DELETE Action 수행 중...");
		return "DELETE Action 수행 중...";
	}
}
