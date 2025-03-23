package com.example.kubotravel.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kubotravel.entity.Reservation;
import com.example.kubotravel.entity.User;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
	public Page<Reservation> findByUserOrderByCreatedAtDesc(User user,Pageable pageable);

}
