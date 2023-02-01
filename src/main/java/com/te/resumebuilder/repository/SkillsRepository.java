package com.te.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumebuilder.entity.TechnicalSkills;

@Repository
public interface SkillsRepository extends JpaRepository<TechnicalSkills, Integer> {

}
