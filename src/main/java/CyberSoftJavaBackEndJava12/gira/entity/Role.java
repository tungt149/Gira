package CyberSoftJavaBackEndJava12.gira.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import CyberSoftJavaBackEndJava12.gira.common.entity.BaseEntity;

@Entity
@Table(name = "gira_role")
public class Role extends BaseEntity{
	
//	@Id
//	@GeneratedValue
//	private Long id;
//	
	private String name;
	private String description;
	
	@ManyToMany(mappedBy = "roles")
	private Set<Group>groups = new HashSet<>();
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "gira_role_program",joinColumns = @JoinColumn(name ="role_id" ),
	inverseJoinColumns = @JoinColumn(name = "program_id"))
	private Set<Program>programs = new HashSet<>();
}