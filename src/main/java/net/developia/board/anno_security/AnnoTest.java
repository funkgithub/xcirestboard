package net.developia.board.anno_security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnoTest {

	@Bean
	public String hello() {
		return "Hello Spring~~~";
	}
}
