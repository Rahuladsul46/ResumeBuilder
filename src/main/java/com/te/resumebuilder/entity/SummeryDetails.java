package com.te.resumebuilder.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "summeryDetails")
public class SummeryDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer summeryId;
	private String summery;

}
