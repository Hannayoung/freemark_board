package com.aceproject.free.dao;

import java.util.List;

import com.aceproject.free.model.BoardVo;

public interface BoardDao  {

	public void insert(BoardVo boardVo) ;
	public void update(BoardVo boardVo) ;
	public void delete(int boardId) ;
	public BoardVo select(int boardId) ;
	public List<BoardVo> select() ;
}
