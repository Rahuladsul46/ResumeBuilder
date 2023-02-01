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
@Table(name = "achievementDetails")
public class AchievementDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer achievementId;

	@Column
	@ElementCollection(targetClass = String.class)
	@CollectionTable(name = "achievements",joinColumns = @JoinColumn(name = "achievementsId"))
	private List<String> achievement;

}
