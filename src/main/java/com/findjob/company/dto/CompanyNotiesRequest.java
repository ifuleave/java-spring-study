package com.findjob.company.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyNotiesRequest {

	private String position;
	private long reward;
	private String skill;
	private String content;
	
	public CompanyNotiesRequest(String position, long reward, String skill, String content) {
		this.position = position;
		this.reward = reward;
		this.skill = skill;
		this.content = content;
	}
	
}
