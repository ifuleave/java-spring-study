package com.findjob.company.cotroller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.findjob.company.dto.CompanyListResponse;
import com.findjob.company.dto.CompanyNotiesRequest;
import com.findjob.company.dto.CompanyNotiesUpdate;
import com.findjob.company.service.CompanyService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CompanyController {
	
	private final CompanyService companyService;
	
	@PostMapping("/noties")
	public void companyNoties(@RequestBody CompanyNotiesRequest companyNoties) {
		companyService.companyNoties(companyNoties);
	}
	
	@PutMapping("/noties/{id}")
	public void companyUpdateNoties(@RequestBody CompanyNotiesUpdate companyUpdate, @PathVariable Long id) {
		companyService.companyUpdateNoties(id, companyUpdate);
	}
	
	@DeleteMapping("/notices/{id}")
	public void companyDeleteNoties(@PathVariable Long id) {
		companyService.companyDeleteNoties(id);
	}
	
	@GetMapping("/noties")
	public List<CompanyListResponse> companyListNoties() {
		return companyService.companyListNoties();
	}
	
}
