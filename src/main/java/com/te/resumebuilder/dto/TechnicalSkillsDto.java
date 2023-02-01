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
public class TechnicalSkillsDto {
	
	private Integer skillId;
	private List<String> frontendTechnologies;
	private List<String> backendTechnologies;
	private List<String> middlewareTechnologies;
	private List<String> designPatterns;
	private List<String> skillDatabase;
	private List<String> versionControlSystems;
	private List<String> aws;
	private List<String> sdlc;
	private List<String> developmentTools;

}
