package net.developia.board.jqueryui;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("jqueryui")
public class AutocompleteController {

	@Autowired
	private ComponentService componentService;

	@GetMapping("autocomplete")
	public String autocomplete() {
		return "autocomplete";
	}

	@GetMapping(value = "autocomplete_action", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public List<ItemVO> autocomplete(@RequestParam String term) throws Exception {

		try {
			log.info("term : " + term);
			List<ItemVO> list = componentService.getWords(term);
			return list;
		} catch (Exception e) {
			log.info(e.getMessage());
			throw e;
		}
	}

	@PostMapping(value = "putjson", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void putjson(@RequestBody ItemVO itemVO) {
		log.info("itemVO : " + itemVO.toString());
	}

	@RequestMapping("/membersList")
	public ResponseEntity<List<MemberVO>> listMembers2() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		for (int i = 0; i < 10; i++) {
			MemberVO vo = new MemberVO();
			vo.setId("lee" + i);
			vo.setPwd("123" + i);
			vo.setName("이순신" + i);
			vo.setEmail("lee" + i + "@test.com");
			list.add(vo);
		}
		return new ResponseEntity(list, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
