package net.developia.board.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import net.developia.board.dto.UserDTO;

@Slf4j
@Aspect
@Component
public class AopController {

	//@Before("execution(* net.developia.board.*.UserController.login2())")
	public void ad_before() {
		log.info("π€π€π€π€π€ before advice μνμ€~ π€π€π€π€π€");
	}
	
	//@After("execution(* net.developia.*.*.UserController.login2())")
	public void ad_after() {
		log.info("βββββββββββ");
		log.info("β   after advice   β");
		log.info("βββββββββββ");
	}

	//@Around("execution(* net.developia.*.*.UserController.login(..))")
	public Object ad_around(ProceedingJoinPoint joinPoint) {
		log.info("βββββββββββββββ");
		log.info("β   around (before) advice β");
		log.info("βββββββββββββββ");
		
		Object obj = null;
		
		try {
			log.info("μκ°μΈ‘μ μ μμν©λλ€");
			long start = System.currentTimeMillis();
			obj = joinPoint.proceed();
			long end = System.currentTimeMillis();
			log.info("μκ°μΈ‘μ μ μ’λ£ν©λλ€");
			log.info("μμμκ° : " + ((double)end - start)/1000 + "μ΄");
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		log.info("βββββββββββββββ");
		log.info("β   around (after)  advice β");
		log.info("βββββββββββββββ");
		return obj;
	}
	
	
	@Before("execution(* net.developia.*.*.UserController.login(..))")
	public void ad_login(JoinPoint joinPoint) {
		log.info("ββββββββββββ");
		log.info("β   login intercept  β");
		log.info("ββββββββββββ");
		
		Object[] args = joinPoint.getArgs();
		for(Object obj : args) {
			//log.info(obj.toString());
			if (obj instanceof UserDTO) {
				UserDTO userDTO = (UserDTO) obj; 
				log.info(userDTO.getUsr_id() + "λμ΄ λ‘κ·ΈμΈ");
			}
		}
	}


}
