package com.aceproject.free.service;

import java.util.List;

import com.aceproject.free.model.ArticleVo;

public interface BoardService {

	void register(ArticleVo articleVo);

	void modify(ArticleVo articleVo);

	void remove(int articleId);

	ArticleVo get(int articleId);

	List<ArticleVo> get();
}
