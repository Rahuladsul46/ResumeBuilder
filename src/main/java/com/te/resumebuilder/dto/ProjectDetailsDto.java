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
public class ProjectDetailsDto {
	
	private Integer projectId;
	private List<String> projectFrontendTechnologies;
	private List<String> projectBackEndTechnologies;
	private List<String> projectDesignPatterns;
	private List<String> projectDatabases;
	private List<String> projectDevelopmentTools;
	private String projectDuration;
	private Integer projectTeamSize;
	private String projectDescription;
	private String projectrolesAndResponsibilities;

}
