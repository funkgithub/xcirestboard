package net.developia.board.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import net.developia.board.dto.EmployeeDTO;
import net.developia.board.service.BoardService;

@Controller
@RequestMapping("/rest")
public class ChaKyungController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping(method=RequestMethod.GET, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String hello() {
		return "hello~ 안녕하세요... 뷁 🍺";
	}
	
	@RequestMapping(value="/kyung", method=RequestMethod.GET, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public EmployeeDTO hello2() {
		return new EmployeeDTO("이채경","프로그래밍",2021);
	}
	
	@RequestMapping(value="/kyung2", method=RequestMethod.GET, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, List<Map<String,Object>>> hello3() {
		Map map1 = new HashMap();
		map1.put("name", "박지성");
		map1.put("age", "25");
		map1.put("gender", "남자");
		map1.put("nickname", "날센돌이");
		//map1.put("today", new Date());

        //  배열에 입력
		Map map2 = new HashMap();
		map2.put("name", "김연아");
		map2.put("age", "21");
		map2.put("gender", "여자");
		map2.put("nickname", "칼치");

		List<Map<String,Object>> members = new ArrayList<>();
		members.add(map1);
		members.add(map2);
		Map map =new HashMap();
		map.put("members", members);
		return map;
	}
}
