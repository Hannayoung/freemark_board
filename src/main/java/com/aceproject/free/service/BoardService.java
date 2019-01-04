package com.aceproject.free.service;

import java.util.List;

import com.aceproject.free.model.BoardVo;

public interface BoardService {

	public void register(BoardVo boardVo);
	public void modify(BoardVo boardVo);
	public void remove(int boardId);
	public BoardVo get(int boardId);
	public List<BoardVo> get();
}
