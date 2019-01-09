package com.aceproject.free.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aceproject.free.dao.CusDao;
import com.aceproject.free.model.CusVo;
import com.aceproject.free.service.CusService;

@Service("cusService")
public class CusServiceImpl implements CusService {

	@Autowired
	private CusDao cusDao;

	@Override
	public void register(CusVo cusVo) {
		cusDao.insert(cusVo);
	}

	@Override
	public void modify(CusVo cusVo) {
	}

	@Override
	public void remove(int cusId) {
	}

	@Override
	public CusVo get(String email) {
		return cusDao.select(email);
	}

	@Override
	public List<CusVo> get() {
		return null;
	}

}
