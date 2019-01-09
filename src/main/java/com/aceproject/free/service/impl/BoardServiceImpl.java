package com.aceproject.free.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aceproject.free.dao.BoardDao;
import com.aceproject.free.model.ArticleVo;
import com.aceproject.free.service.BoardService;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;

	@Override
	public void register(ArticleVo articleVo) {
		boardDao.insert(articleVo);
	}

	@Override
	public void modify(ArticleVo articleVo) {
		boardDao.update(articleVo);
	}

	@Override
	public void remove(int articleId) {
		boardDao.delete(articleId);
	}

	@Override
	public ArticleVo get(int articleId) {
		return boardDao.select(articleId);
	}

	@Override
	public List<ArticleVo> get() {
		return boardDao.select();
	}

}
