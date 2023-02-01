package com.te.resumebuilder.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserProfileDto {

	private Integer userId;
	private String firstName;
	private String lastName;
	private List<String> technologies;
	private String totalExperience;
	private String relevantExperience;
	
	private List<SummeryDetailsDto> summeryDetails;
	private AchievementDetailsDto achievementDetails;
	private TechnicalSkillsDto technicalSkills;
	private List<ProjectDetailsDto> projectDetails;
	private List<EducationDetailsDto> educationDetails;

}
