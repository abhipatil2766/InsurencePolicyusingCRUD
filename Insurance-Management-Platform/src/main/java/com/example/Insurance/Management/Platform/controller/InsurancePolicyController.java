package com.example.Insurance.Management.Platform.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Insurance.Management.Platform.entity.InsurancePolicy;
import com.example.Insurance.Management.Platform.service.InsurancePolicyService;

@RestController
public class InsurancePolicyController {
	
	@Autowired
	InsurancePolicyService insurancePolicyService;
	
	@PostMapping("/insurancePolicy")
	public InsurancePolicy createInsurancePolicy(@RequestBody InsurancePolicy insurancePolicy) {
		return insurancePolicyService.createInsurancePolicy(insurancePolicy);
	}
	
	@GetMapping("/insurancePolicity/{id}")
	public Optional<InsurancePolicy> findInsuranceById(@PathVariable Long id) {
		return insurancePolicyService.findInsuranceById(id);
	}
	
	@DeleteMapping("/insurancePolicy")
	public String deleteInsurancePolicy(Long id) {
		return insurancePolicyService.deleteInsurancePolicy(id);
	}
	
	@PutMapping("insurancePolicy")
	public InsurancePolicy upinsurancePolicy(@RequestBody InsurancePolicy insurancePolicy, @RequestParam Long id) {
		return insurancePolicyService.upinsurancePolicy(insurancePolicy, id);
		
	}

}
