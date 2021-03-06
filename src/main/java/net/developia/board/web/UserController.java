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
		log.info("login μνμ€...");
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
			log.info("π¦’π¦’π¦’π¦’π¦’π¦’π¦’π¦’π¦’π¦’π¦’π¦’");
			session.setAttribute("userInfo", userInfo);
			log.info("π¦’π¦’π¦’π¦’π¦’π¦’π¦’π¦’π¦’π¦’π¦’π¦’");
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
		log.info("logout μν μ€.............");
		UserDTO userInfo = (UserDTO) session.getAttribute("userInfo");
		session.invalidate();
		
		ModelAndView mav = new ModelAndView("result");
		mav.addObject("msg", userInfo.getUsr_name() + 
				 "(" + userInfo.getUsr_id() + ")λμ΄ λ‘κ·Έμμ νμμ΅λλ€.");
		mav.addObject("url", "./");
		return mav;
	}
	
	@RequestMapping("/logout2")
	public String logout2() {
		log.info("logout μν μ€.............");
		
		return "user/logout";
	}
	@GetMapping("/login_error")
	public String login_error(HttpSession session, Model model) {
		
		model.addAttribute("msg","μμ΄λ νΉμ λΉλ°λ²νΈκ° νλ¦½λλ€.");
		model.addAttribute("url", "./");
		return "result";
	}

	
}