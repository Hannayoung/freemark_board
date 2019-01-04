package com.aceproject.free.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aceproject.free.dao.CusDao;
import com.aceproject.free.model.CusVo;

@Repository("cusDao")
public class CusDaoImpl extends SqlSessionDaoSupport implements CusDao {

	
	private static String namespace = "cusmapper";
	
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
	{
		super.setSqlSessionFactory(sqlSessionFactory);
	}


	@Override
	public void insert(CusVo cusVo)  {
		System.out.println("insert cusdao" + cusVo);
		getSqlSession().insert(namespace +".insert", cusVo);
	}

	@Override
	public void update(CusVo cusVo) {
		
	}

	@Override
	public void delete(int cusId)  {
		
	}

	@Override
	public CusVo select(int cusId)  {
		System.out.println("select one cusdao" + cusId);
		return (CusVo) getSqlSession().selectOne(namespace +".select", cusId);
	}

	@Override
	public CusVo selectBoardList(int cusId) {
		return (CusVo) getSqlSession().selectOne(namespace +".selectBoardList", cusId);
	}
	
	@Override
	public List<CusVo> select() {
		return null;
	}


}
