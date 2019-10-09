package com.wild_circus.checkpoint.repositories;

import com.wild_circus.checkpoint.entities.Circus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircusRepository extends JpaRepository<Circus, Long> {

}