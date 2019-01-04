package com.aceproject.free.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CusVo {

	@Getter
	@Setter
	private int cusId;
	private String email;
	private String pw;
	private String name;
	
}
