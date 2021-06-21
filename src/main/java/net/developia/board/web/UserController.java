package net.developia.board.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
import net.developia.board.dto.UserDTO;
import net.developia.board.service.UserService;

@Slf4j
@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping()
	public String login() {
		return "redirect:user/";
	}

	@GetMapping(value="/")
	public String login2() {
		log.info("login 수행중...");
		return "user/login";
	}

	@RequestMapping(value={"/","/loginAction"})
	public String login(
			@ModelAttribute UserDTO userDTO,
			Model model,
			HttpSession session) {
		log.info(userDTO.toString());
		try {
			UserDTO userInfo = userService.getUser(userDTO);
			log.info(userInfo.toString());
			log.info("🦢🦢🦢🦢🦢🦢🦢🦢🦢🦢🦢🦢");
			session.setAttribute("userInfo", userInfo);
			log.info("🦢🦢🦢🦢🦢🦢🦢🦢🦢🦢🦢🦢");
			return "redirect:../board";
		} catch (Exception e) {
			log.info(e.getMessage());
			model.addAttribute("msg",e.getMessage());
			model.addAttribute("url", "./");
			return "result";
		}
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		log.info("logout 수행 중.............");
		UserDTO userInfo = (UserDTO) session.getAttribute("userInfo");
		session.invalidate();
		
		ModelAndView mav = new ModelAndView("result");
		mav.addObject("msg", userInfo.getUsr_name() + 
				 "(" + userInfo.getUsr_id() + ")님이 로그아웃 하였습니다.");
		mav.addObject("url", "./");
		return mav;
	}
	
	@RequestMapping("/logout2")
	public String logout2() {
		log.info("logout 수행 중.............");
		
		return "user/logout";
	}
	@GetMapping("/login_error")
	public String login_error(HttpSession session, Model model) {
		
		model.addAttribute("msg","아이디 혹은 비밀번호가 틀립니다.");
		model.addAttribute("url", "./");
		return "result";
	}

	
}