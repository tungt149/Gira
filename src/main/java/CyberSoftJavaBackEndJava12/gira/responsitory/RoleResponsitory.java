package CyberSoftJavaBackEndJava12.gira.responsitory;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CyberSoftJavaBackEndJava12.gira.entity.Role;

@Repository
public interface RoleResponsitory extends JpaRepository<Role,Long> {
	

}
