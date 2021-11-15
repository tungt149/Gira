package CyberSoftJavaBackEndJava12.gira.program.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import CyberSoftJavaBackEndJava12.gira.common.entity.BaseEntity;
import CyberSoftJavaBackEndJava12.gira.role.entity.Role;
import CyberSoftJavaBackEndJava12.gira.role.util.Httpmethods;

@Entity
@Table(name = "gira_program")
public class Program extends BaseEntity {

	@NotNull
	@Column(unique = true)
	@Size(min = 3,max =50,message = "{program.name.size}")
	private String name;
	
	@NotNull
	private Httpmethods method;
	
	@NotNull
	private String path;

	@ManyToMany(mappedBy = "programs",fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<Role> roles = new HashSet<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Httpmethods getMethod() {
		return method;
	}

	public void setMethod(Httpmethods method) {
		this.method = method;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}