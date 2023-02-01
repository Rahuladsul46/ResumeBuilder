package com.te.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumebuilder.entity.SummeryDetails;

@Repository
public interface SummeryRepository extends JpaRepository<SummeryDetails, Integer> {

}
