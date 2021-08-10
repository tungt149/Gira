package CyberSoftJavaBackEndJava12.gira.role.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import CyberSoftJavaBackEndJava12.gira.common.entity.BaseEntity;
import CyberSoftJavaBackEndJava12.gira.group.entity.Group;
import CyberSoftJavaBackEndJava12.gira.program.entity.Program;

@Entity
@Table(name = "gira_role")
public class Role extends BaseEntity{
	
	@NotBlank
	private String name;
	private String description;
	
	@ManyToMany(mappedBy = "roles")
	private Set<Group>groups = new HashSet<>();
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "gira_role_program",joinColumns = @JoinColumn(name ="role_id" ),
	inverseJoinColumns = @JoinColumn(name = "program_id"))
	private Set<Program>programs = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Group> getGroups() {
		return groups;
	}

	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}

	public Set<Program> getPrograms() {
		return programs;
	}

	public void setPrograms(Set<Program> programs) {
		this.programs = programs;
	}



}