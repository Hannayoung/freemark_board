package com.aceproject.free.dao;

import java.util.List;

import com.aceproject.free.model.CusVo;

public interface CusDao {
	void insert(CusVo cusVo);

	void update(CusVo cusVo);

	void delete(int cusId);

	CusVo select(String email);

	List<CusVo> select();
}
