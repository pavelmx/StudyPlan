package com.vstu.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the competence database table.
 * 
 */
@Entity
@NamedQuery(name = "Competence.findAll", query = "SELECT c FROM Competence c")
public class Competence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "name_competence")
	private String nameCompetence;

	// bi-directional many-to-one association to SubCompetence
	@OneToMany(mappedBy = "competence")
	@JsonIgnore
	private List<SubCompetence> subCompetences;

	public Competence() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameCompetence() {
		return this.nameCompetence;
	}

	public void setNameCompetence(String nameCompetence) {
		this.nameCompetence = nameCompetence;
	}

	public List<SubCompetence> getSubCompetences() {
		return this.subCompetences;
	}

	public void setSubCompetences(List<SubCompetence> subCompetences) {
		this.subCompetences = subCompetences;
	}

}