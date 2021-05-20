package net.developia.board.tx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("tx")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping("transfer")
	public void transfer(Model model) {
		
		// 계좌 이체
		try {
			accountService.transfer();
			model.addAttribute("msg", "이체 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("msg", "이체 중 오류가 발생하였습니다.");
		}
	}
}