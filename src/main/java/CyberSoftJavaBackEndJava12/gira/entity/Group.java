package CyberSoftJavaBackEndJava12.gira.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import CyberSoftJavaBackEndJava12.gira.common.entity.BaseEntity;



@Entity
@Table(name = "gira_group")
public class Group extends BaseEntity{
	
//	@Id
//	@GeneratedValue
//	private Long id;
	
	private String name;
	private String description;
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name = "gira_group_role",joinColumns = @JoinColumn(name = "group_id"),
	inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Role> roles = new ArrayList<>();

}