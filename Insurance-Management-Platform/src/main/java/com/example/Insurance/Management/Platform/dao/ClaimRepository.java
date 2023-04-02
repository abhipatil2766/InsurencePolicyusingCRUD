package com.example.Insurance.Management.Platform.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Insurance.Management.Platform.entity.Claim;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long>{

}
