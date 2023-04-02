package com.example.Insurance.Management.Platform.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Insurance.Management.Platform.dao.InsurancePolicyRepository;
import com.example.Insurance.Management.Platform.entity.InsurancePolicy;
@Service
public class InsurancePolicyService {
	
	@Autowired
	InsurancePolicyRepository insurancePolicyRepository;

	public InsurancePolicy createInsurancePolicy(InsurancePolicy insurancePolicy) {
		return insurancePolicyRepository.save(insurancePolicy);
	}

	public Optional<InsurancePolicy> findInsuranceById(Long id) {
		return insurancePolicyRepository.findById(id);
	}

	public String deleteInsurancePolicy(Long id) {
		insurancePolicyRepository.deleteById(id);
		return "deleted successfully";
	}

	public InsurancePolicy upinsurancePolicy(InsurancePolicy insurancePolicy, Long id) {
		Optional<InsurancePolicy> opc=insurancePolicyRepository.findById(id);
		InsurancePolicy isp=opc.get();
		isp.setCoverageAmount(insurancePolicy.getCoverageAmount());
		isp.setEnddate(insurancePolicy.getEnddate());
		isp.setPolicyNumber(insurancePolicy.getPolicyNumber());
		isp.setPremium(insurancePolicy.getPremium());
		isp.setStartdate(insurancePolicy.getStartdate());
		isp.setType(insurancePolicy.getType());
		return insurancePolicyRepository.save(insurancePolicy);
	}
	
}
