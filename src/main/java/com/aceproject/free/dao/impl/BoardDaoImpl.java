package com.aceproject.free.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aceproject.free.dao.BoardDao;
import com.aceproject.free.model.BoardVo;

@Repository("boardDao")
public class BoardDaoImpl extends SqlSessionDaoSupport implements BoardDao{

	
	private static final String namespace = "boardmapper";
	
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
	{
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public void insert(BoardVo boardVo) {
		System.out.println("insert board dao" + boardVo);
		getSqlSession().insert(namespace +".insert", boardVo);
	}

	@Override
	public void update(BoardVo boardVo) {
		System.out.println("update board dao " + boardVo);
		getSqlSession().update(namespace+ ".update", boardVo);
	}

	@Override
	public void delete(int boardId) {
		System.out.println("delete board dao "+ boardId);
		getSqlSession().delete(namespace+ ".delete", boardId);
	}

	@Override
	public BoardVo select(int boardId)  {
		System.out.println("select one board dao"+ (BoardVo) getSqlSession().selectOne(namespace +".select", boardId));
		return (BoardVo) getSqlSession().selectOne(namespace +".select", boardId);
	}

	@Override
	public List<BoardVo> select()  {
		System.out.println("select list board dao "+ getSqlSession().selectList(namespace + ".selectAll"));
		return getSqlSession().selectList(namespace + ".selectAll");
	}

}
