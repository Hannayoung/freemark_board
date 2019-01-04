package com.aceproject.free.dao;

import java.util.List;

import com.aceproject.free.model.CusVo;

public interface CusDao{
	public void insert(CusVo cusVo) ;
	public void update(CusVo cusVo) ;
	public void delete(int cusId) ;
	public CusVo select(int cusId) ;
	public CusVo selectBoardList(int cusId) ;
	public List<CusVo> select() ;
}
