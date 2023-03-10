package com.te.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumebuilder.entity.EducationDetails;

@Repository
public interface EducationRepository extends JpaRepository<EducationDetails, Integer> {

}
