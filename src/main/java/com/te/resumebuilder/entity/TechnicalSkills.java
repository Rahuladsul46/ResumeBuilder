package com.te.resumebuilder.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "technicalSkills")
public class TechnicalSkills {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer skillId;
	
	@Column()
	@ElementCollection
	@CollectionTable(name = "frontendTechnologies",joinColumns = @JoinColumn(name = "skillId"))
	private List<String> frontendTechnologies;
	
	@Column
	@ElementCollection
	@CollectionTable(name = "backendTechnologies",joinColumns = @JoinColumn(name = "skillId"))
	private List<String> backendTechnologies;
	
	@Column
	@ElementCollection
	@CollectionTable(name = "middlewareTechnologies",joinColumns = @JoinColumn(name = "skillId"))
	private List<String> middlewareTechnologies;
	
	@Column
	@ElementCollection
	@CollectionTable(name = "designPatterns",joinColumns = @JoinColumn(name = "skillId"))
	private List<String> designPatterns;
	
	@Column
	@ElementCollection
	@CollectionTable(name = "skill_database",joinColumns = @JoinColumn(name = "skillId"))
	private List<String> skillDatabase;
	
	@Column
	@ElementCollection
	@CollectionTable(name = "versionControlSystems",joinColumns = @JoinColumn(name = "skillId"))
	private List<String> versionControlSystems;
	
	@Column
	@ElementCollection
	@CollectionTable(name = "aws",joinColumns = @JoinColumn(name = "skillId"))
	private List<String> aws;
	
	@Column
	@ElementCollection
	@CollectionTable(name = "sdlc",joinColumns = @JoinColumn(name = "skillId"))
	private List<String> sdlc;
	
	@Column
	@ElementCollection
	@CollectionTable(name = "developmentTools",joinColumns = @JoinColumn(name = "skillId"))
	private List<String> developmentTools;

}
