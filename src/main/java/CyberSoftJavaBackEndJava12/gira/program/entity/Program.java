package CyberSoftJavaBackEndJava12.gira.program.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import CyberSoftJavaBackEndJava12.gira.common.entity.BaseEntity;
import CyberSoftJavaBackEndJava12.gira.role.entity.Role;
import CyberSoftJavaBackEndJava12.gira.role.util.Httpmethods;

@Entity
public class Program extends BaseEntity {
	private String name;
	private Httpmethods method;
	private String path;

	@ManyToMany(mappedBy = "programs")
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