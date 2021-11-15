package CyberSoftJavaBackEndJava12.gira.group.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import CyberSoftJavaBackEndJava12.gira.common.entity.BaseEntity;
import CyberSoftJavaBackEndJava12.gira.role.entity.Role;

@Entity
@Table(name = "gira_group")
public class Group extends BaseEntity {

//	@Id
//	@GeneratedValue
//	private Long id;

	@NotNull
	@Column(unique = true)
	@Size(min=3,max=50,message = "{group.name.size}")
	private String name;
	
	private String description;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "gira_group_role", joinColumns = @JoinColumn(name = "group_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Role> roles = new ArrayList<>();

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

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}