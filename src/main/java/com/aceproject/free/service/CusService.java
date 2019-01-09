package com.aceproject.free.service;

import java.util.List;

import com.aceproject.free.model.CusVo;

public interface CusService {

	void register(CusVo cusVo);

	void modify(CusVo cusVo);

	void remove(int cusId);

	CusVo get(String email);

	List<CusVo> get();
}
