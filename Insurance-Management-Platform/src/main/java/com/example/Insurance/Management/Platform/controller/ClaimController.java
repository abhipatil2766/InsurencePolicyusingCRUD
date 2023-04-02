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

import com.example.Insurance.Management.Platform.entity.Claim;
import com.example.Insurance.Management.Platform.service.ClaimService;

@RestController
public class ClaimController {
	
	@Autowired
	ClaimService claimService;
	
	@PostMapping("/claim")
	public Claim createClaim(@RequestBody Claim claim) {
		return claimService.createClaim(claim);
	}
	@GetMapping("/claim/{id}")
	public Optional<Claim> findClaimById(@PathVariable Long id) {
		return claimService.findClaimById(id);
	}
	@DeleteMapping("/claim/{id}")
	public String deleteById(Long id) {
		return claimService.deleteClaim(id);
	}
	@PutMapping("/claim")
	public Claim updateClaim(@RequestBody Claim claim, @RequestParam Long id) {
		return claimService.updateClaim(claim, id);
	}

}
