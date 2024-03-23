package com.findjob.company.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.findjob.company.dto.CompanyListResponse;
import com.findjob.company.dto.CompanyNotiesRequest;
import com.findjob.company.dto.CompanyNotiesUpdate;
import com.findjob.company.repository.CompanyRepository;
import com.findjob.sample.repository.SampleRepository;

import lombok.RequiredArgsConstructor;


@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CompanyService {

	private final CompanyRepository companyRepository;

	@Transactional
	public void companyNoties(CompanyNotiesRequest companyNoties) {
		// TODO Auto-generated method stub
		companyRepository.companyNoties(companyNoties);
	}

	@Transactional
	public void companyUpdateNoties(Long id, CompanyNotiesUpdate companyUpdate) {
		// TODO Auto-generated method stub
		companyRepository.companyUpdateNoties(id,companyUpdate);
	}

	@Transactional
	public void companyDeleteNoties(Long id) {
		// TODO Auto-generated method stub
		companyRepository.companyDeleteNoties(id);
	}

	public List<CompanyListResponse> companyListNoties() {
		// TODO Auto-generated method stub
		return companyRepository.companyListNoties();
		
	}

}
