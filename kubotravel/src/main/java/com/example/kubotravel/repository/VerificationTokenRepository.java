package com.example.kubotravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kubotravel.entity.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken,Integer> {
	public VerificationToken findByToken(String token);

}
