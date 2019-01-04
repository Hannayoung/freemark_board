package com.aceproject.free.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aceproject.free.dao.impl.BoardDaoImpl;
import com.aceproject.free.model.BoardVo;
import com.aceproject.free.service.BoardService;


@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired (required=false)
	private BoardDaoImpl boardDaoImpl;
	
	@Override
	public void register(BoardVo boardVo) {
		boardDaoImpl.insert(boardVo);
	}

	@Override
	public void modify(BoardVo boardVo)  {
		boardDaoImpl.update(boardVo);
	}

	@Override
	public void remove(int boardId) {
		boardDaoImpl.delete(boardId);
	}

	@Override
	public BoardVo get(int boardId)  {
		System.out.println("board service get " + boardId);
		return  boardDaoImpl.select(boardId);
	}

	@Override
	public List<BoardVo> get(){
		System.out.println("board service get all");
		return boardDaoImpl.select();
	}

}
