package com.te.resumebuilder.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "profile")
public class UserProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String firstName;
	private String lastName;
	
	@Column
	@ElementCollection(targetClass = String.class)
	@CollectionTable(name = "userTechnologies",joinColumns = @JoinColumn(name = "userId"))
	private List<String> technologies;
	
	private String totalExperience;
	private String relevantExperience;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "userFkId")
	private List<SummeryDetails> summeryDetails;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "achievementFkId")
	private AchievementDetails achievementDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "technicalSkillId")
	private TechnicalSkills technicalSkills;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "projectId")
	private List<ProjectDetails> projectDetails;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "userFkId")
	private List<EducationDetails> educationDetails;

}
