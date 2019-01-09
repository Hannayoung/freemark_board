package com.aceproject.free.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ArticleVo {

	private int articleId;
	private String title;
	private String content;
	private Timestamp crtDate;
	private String upDate;
	private String cusName;
	private String email;

}
