package com.findjob.company.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import com.findjob.company.dto.CompanyListResponse;
import com.findjob.company.dto.CompanyNotiesRequest;
import com.findjob.company.dto.CompanyNotiesUpdate;


@Mapper
public interface CompanyMapper {

	void companyNoties(CompanyNotiesRequest companyNoties);

	void companyUpdateNoties(@Param("id") Long id, @Param("companyUpdate") CompanyNotiesUpdate companyUpdate);

	void companyDeleteNoties(Long id);

	List<CompanyListResponse> companyListNoties();
	
}
