package test;

import java.util.Enumeration;

import javax.servlet.http.HttpSession;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class SecurityTestController {
	
	@RequestMapping("/")
	public String root(HttpSession session) {
		Enumeration<?> attrName = session.getAttributeNames();
		while (attrName.hasMoreElements()) {
			String attr = (String) attrName.nextElement();
			log.info("session attr : " + session.getAttribute(attr).toString());
		}
		return "redirect:index";
	}

	@RequestMapping("/index")
	public String index(HttpSession session) {
		log.info("-----------------------------------------------");
			Enumeration e=session.getAttributeNames();
			String name="";
			while(e.hasMoreElements()){
			name=(String)e.nextElement();
			log.info(name + " >>> " + session.getAttribute(name));
		}
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		log.info("user name       : " + auth.getName());
//		log.info("credential      : " + auth.getCredentials());
//		log.info("user info       : " + auth.getPrincipal());
//		log.info("detail          : " + auth.getDetails().toString());
//		log.info("isAuthenticated : " + auth.isAuthenticated());
//		log.info("user role       : " + auth.getAuthorities().toString());
//		log.info("-----------------------------------------------");

		return "sec_view/index";
	}

	@RequestMapping("/home/main")
	public String home() {
		return "sec_view/homeMain";
	}

	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_MEMBER')")
	@RequestMapping("/manager/main")
	public String manager() {
		return "sec_view/managerMain";
	}

	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_MEMBER')")
	@RequestMapping("/admin/main")
	public String admin() {
		return "sec_view/adminMain";
	}

	@RequestMapping("/member/main")
	public String member() {
		return "sec_view/memberMain";
	}

}
