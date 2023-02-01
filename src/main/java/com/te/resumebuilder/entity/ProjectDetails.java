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
@Table(name = "projectDetails")
public class ProjectDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer projectId;
	
	@Column
	@ElementCollection(targetClass = String.class)
	@CollectionTable(name = "projectFrontendTechnologies",joinColumns = @JoinColumn(name = "projectId"))
	private List<String> projectFrontendTechnologies;
	
	@Column
	@ElementCollection(targetClass = String.class)
	@CollectionTable(name = "projectBackEndTechnologies",joinColumns = @JoinColumn(name = "projectId"))
	private List<String> projectBackEndTechnologies;
	
	@Column
	@ElementCollection(targetClass = String.class)
	@CollectionTable(name = "projectDesignPatterns",joinColumns = @JoinColumn(name = "projectId"))
	private List<String> projectDesignPatterns;
	
	@Column
	@ElementCollection(targetClass = String.class)
	@CollectionTable(name = "projectDatabases",joinColumns = @JoinColumn(name = "projectId"))
	private List<String> projectDatabases;
	
	@Column
	@ElementCollection(targetClass = String.class)
	@CollectionTable(name = "projectDevelopmentTools",joinColumns = @JoinColumn(name = "projectId"))
	private List<String> projectDevelopmentTools;
	
	private String projectDuration;
	private Integer projectTeamSize;
	private String projectDescription;
	private String projectrolesAndResponsibilities;

}
