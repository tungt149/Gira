package CyberSoftJavaBackEndJava12.gira.role.reponsitory;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import CyberSoftJavaBackEndJava12.gira.role.dto.RoleDto;
import CyberSoftJavaBackEndJava12.gira.role.entity.Role;

@Repository
public interface RoleResponsitory extends JpaRepository<Role, Long> {
	@Transactional(readOnly =true)
	@Query("SELECT r  FROM Role r")
	List<RoleDto> findAllDto();
}
