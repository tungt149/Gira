package CyberSoftJavaBackEndJava12.gira.entity;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;



import CyberSoftJavaBackEndJava12.gira.common.entity.BaseEntity;
import CyberSoftJavaBackEndJava12.gira.common.until.Httpmethods;




@Entity
public class Program extends BaseEntity{
	private String name;
	private Httpmethods method;//safe type
	private String path;
	
	
	@ManyToMany(mappedBy = "programs")
	private Set<Role> roles = new HashSet<>();
}