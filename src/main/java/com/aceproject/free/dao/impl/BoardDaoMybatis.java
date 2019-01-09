package com.aceproject.free.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aceproject.free.dao.BoardDao;
import com.aceproject.free.model.ArticleVo;

@Repository("boardDao")
public class BoardDaoMybatis extends SqlSessionDaoSupport implements BoardDao {

	private static final String namespace = "articlemapper";

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public void insert(ArticleVo articleVo) {
		getSqlSession().insert(namespace + ".insert", articleVo);
	}

	@Override
	public void update(ArticleVo articleVo) {
		getSqlSession().update(namespace + ".update", articleVo);
	}

	@Override
	public void delete(int articleId) {
		getSqlSession().delete(namespace + ".delete", articleId);
	}

	@Override
	public ArticleVo select(int articleId) {
		return getSqlSession().selectOne(namespace + ".select", articleId);
	}

	@Override
	public List<ArticleVo> select() {
		return getSqlSession().selectList(namespace + ".selectAll");
	}

}
