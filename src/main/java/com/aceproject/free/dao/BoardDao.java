package com.aceproject.free.dao;

import java.util.List;

import com.aceproject.free.model.ArticleVo;

public interface BoardDao {

	void insert(ArticleVo articleVo);

	void update(ArticleVo articleVo);

	void delete(int articleId);

	ArticleVo select(int articleId);

	List<ArticleVo> select();
}
