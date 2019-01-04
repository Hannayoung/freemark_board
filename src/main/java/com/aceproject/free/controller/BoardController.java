package com.aceproject.free.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.aceproject.free.model.BoardVo;
import com.aceproject.free.service.impl.BoardServiceImpl;

@Controller
@SessionAttributes("board")
public class BoardController{

	@Autowired (required=false)
	private BoardServiceImpl boardService;
	
	@RequestMapping("/main.fre")
	public String main(@ModelAttribute("boardList") ModelMap model)
	{
		//로그인 값 넘겨줘야함.
		List<BoardVo> boardList = new ArrayList<BoardVo>();
		boardList = boardService.get();
		model.addAttribute("boardList", boardList);
		return "/board/main.ftl";
	}
	
	@RequestMapping("/write.fre")
	public String write()
	{
		//로그인 값 넘겨줘야함.

		return "/board/write.ftl";
	}
	
}
