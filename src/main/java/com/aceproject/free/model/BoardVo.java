package com.aceproject.free.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.Synchronized;

@Data
public class BoardVo {

	private DateFormat format = new SimpleDateFormat("YYYY-MM-dd");
	
	@Getter
	@Setter
	private int boardId;
	private String title;
	private String content;
	private LocalDate crtDate;
	private String upDate;
	private String name;
	private int cusId;
	
	@Synchronized
	public void setCrtDate(java.sql.Date date)
	{
		this.crtDate = date.toLocalDate();
	}

	
}
