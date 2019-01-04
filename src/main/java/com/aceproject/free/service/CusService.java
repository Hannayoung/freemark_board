package com.aceproject.free.service;

import java.util.List;

import com.aceproject.free.model.CusVo;

public interface CusService {

	public void register(CusVo cusVo);
	public void modify(CusVo cusVo) ;
	public void remove(int cusId) ;
	public CusVo get(int cusId) ;
	public CusVo getBoardList(int cusId) ;
	public List<CusVo> get() ;
}
