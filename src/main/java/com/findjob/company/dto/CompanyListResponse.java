package com.findjob.company.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyListResponse {
	
	private long id;
	private String position;
	private long reward;
	private String skill;
	private String content;
	private String name;
	private String nation;
	private String location;
	
}
