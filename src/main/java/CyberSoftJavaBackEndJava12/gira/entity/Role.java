package CyberSoftJavaBackEndJava12.gira.entity;



import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import CyberSoftJavaBackEndJava12.gira.common.entity.BaseEntity;

@Entity
@Table(name = "gira_role")
public class Role extends BaseEntity {
	private String name;
	private String description;

	@ManyToOne
	private Group group;
}
