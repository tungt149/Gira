package CyberSoftJavaBackEndJava12.gira.role.service;

import java.util.List;

import CyberSoftJavaBackEndJava12.gira.role.dto.CreateDto;
import CyberSoftJavaBackEndJava12.gira.role.entity.Role;

public interface RoleService {
	List<Role> findAll();

	Role addNewRole(CreateDto dto);
}
