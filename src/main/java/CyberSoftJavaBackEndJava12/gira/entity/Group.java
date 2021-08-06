package CyberSoftJavaBackEndJava12.gira.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import CyberSoftJavaBackEndJava12.gira.common.entity.BaseEntity;

@Entity
@Table(name = "gira_group")
public class Group extends BaseEntity {
	

	private String name;
	private String description;
	
	@OneToMany(mappedBy = "group")
	private List<Role> roles = new ArrayList<>();
	
	
}
