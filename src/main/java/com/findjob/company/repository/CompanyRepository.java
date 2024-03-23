package com.findjob.company.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.findjob.company.dto.CompanyListResponse;
import com.findjob.company.dto.CompanyNotiesRequest;
import com.findjob.company.dto.CompanyNotiesUpdate;
import com.findjob.company.repository.mapper.CompanyMapper;
import com.findjob.sample.repository.mapper.SampleMapper;

import lombok.RequiredArgsConstructor;


@Repository
@RequiredArgsConstructor
public class CompanyRepository {
	
	private final CompanyMapper companyMapper;
		
	public void companyNoties(CompanyNotiesRequest companyNoties) {
		// TODO Auto-generated method stub
		companyMapper.companyNoties(companyNoties);
	}

	public void companyUpdateNoties(Long id, CompanyNotiesUpdate companyUpdate) {
		// TODO Auto-generated method stub
		companyMapper.companyUpdateNoties(id,companyUpdate);
	}

	public void companyDeleteNoties(Long id) {
		// TODO Auto-generated method stub
		companyMapper.companyDeleteNoties(id);
		
	}

	public List<CompanyListResponse> companyListNoties() {
		// TODO Auto-generated method stub
		return companyMapper.companyListNoties();
	}

}
