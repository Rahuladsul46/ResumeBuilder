package com.te.resumebuilder.dto;

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
public class EducationDetailsDto {

	private Integer educationId;
	private String education;
	private String specialization;
	private String university;
	private Integer passoutYear;
	private Double percentage;

}
