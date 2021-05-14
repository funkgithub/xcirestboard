package net.developia.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import net.developia.board.service.BoardService;

@Slf4j
@Controller
@RequestMapping("board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@GetMapping
	public String list() {
		return "redirect:board/";
	}
	
	@GetMapping(value= {"/"})
	public String list2() {
		return "board/board_list";
	}
	
/*	@GetMapping("insert")
	public void insert() {}
	
	@PostMapping("insert")
	public void insert(@ModelAttribute BoardDTO boardDTO) {} */
}