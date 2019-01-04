package com.aceproject.free.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aceproject.free.dao.impl.CusDaoImpl;
import com.aceproject.free.model.CusVo;
import com.aceproject.free.service.CusService;

@Repository("cusService")
public class CusServiceImpl implements CusService{

	@Autowired(required=false)
	private CusDaoImpl cusDaoImpl;
	
	@Override
	public void register(CusVo cusVo) {
		cusDaoImpl.insert(cusVo);
	}

	@Override
	public void modify(CusVo cusVo) {
		cusDaoImpl.update(cusVo);
	}

	@Override
	public void remove(int cusId)  {
		cusDaoImpl.delete(cusId);
	}

	@Override
	public CusVo get(int cusId)  {
		return cusDaoImpl.select(cusId);
	}

	@Override
	public CusVo getBoardList(int cusId) {
		return cusDaoImpl.selectBoardList(cusId);
	}
	
	@Override
	public List<CusVo> get() {
		return cusDaoImpl.select();
	}


}
