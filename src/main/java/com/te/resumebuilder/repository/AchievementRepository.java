package com.te.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumebuilder.entity.AchievementDetails;

@Repository
public interface AchievementRepository extends JpaRepository<AchievementDetails, Integer> {

}
