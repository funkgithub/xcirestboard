package net.developia.board.security;

import static org.junit.Assert.assertTrue;

/* SecurityConfig.java 파일에서 PasswordEncode 객체를 Bean으로 등록했다.
 * 해당 Bean을 테스트하여 암호가 인코딩되는지 확인하자
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;
import test.MyPasswordEncoder;

// 스프링 빈 컨테이너가 관리하는 빈을 테스트하려면 @RunWith와 @ContextConfiguration 어노테이션을 사용
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class) // SpringRunner is an alias for the SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:**/*-context.xml"})
//@ContextConfiguration(classes = {XCISecurityConfig.class})
public class PasswordEncoderTest {
    //@Autowired
    PasswordEncoder passwordEncoder = new MyPasswordEncoder();

    /* passwordEncode의 encode메소드를 이용해 문자열 "1234"를 인코딩한 후 출력(원래는 assert 메서드로 검사하는 것이 정석)
     * 실행할 때마다 다른 결과가 나온다. 또한, 인코딩된 문자열을 원래 문자열로 바꿀수 없다.(단방향 암호화)
     */
    @Test
    public void passwordEncode() throws Exception{
        log.info(passwordEncoder.encode("1234"));
    }
    
    
    @Test
    public void passwordTest() throws Exception{
    	String encodePasswd = passwordEncoder.encode("1234");
    	String password = "1234";
    	// 결과가 true이면 encodePasswd는 password가 인코딩된 문자열이라는 뜻
    	// Spring security는 내부적으로 matches() 메서드를 이용해서 검증을 수행
    	boolean test = passwordEncoder.matches(password, encodePasswd);
    	assertTrue(test);
    }
}