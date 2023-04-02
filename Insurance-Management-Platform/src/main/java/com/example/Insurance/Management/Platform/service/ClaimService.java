package com.example.Insurance.Management.Platform.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Insurance.Management.Platform.dao.ClaimRepository;
import com.example.Insurance.Management.Platform.entity.Claim;

@Service
public class ClaimService {
	
	@Autowired
	ClaimRepository cliamRepository;

	public Claim createClaim(Claim claim) {
		return cliamRepository.save(claim);
	}

	public Optional<Claim> findClaimById(Long id) {
		return cliamRepository.findById(id);
	}

	public String deleteClaim(Long id) {
		cliamRepository.deleteById(id);
		return "delete successfully";
	}

	public Claim updateClaim(Claim claim, Long id) {
		Optional<Claim> opcl= cliamRepository.findById(id);
		Claim cl=opcl.get();
		cl.setClaimNumber(claim.getClaimNumber());
		cl.setDescription(claim.getDescription());
		cl.setClaimStatus(claim.getClaimStatus());
		cl.setClaimdate(claim.getClaimdate());
		return cliamRepository.save(cl);
	}
	
	
}
