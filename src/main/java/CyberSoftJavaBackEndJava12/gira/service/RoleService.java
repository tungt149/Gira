package CyberSoftJavaBackEndJava12.gira.service;

import java.util.List;

import CyberSoftJavaBackEndJava12.gira.dto.CreateDto;
import CyberSoftJavaBackEndJava12.gira.entity.Role;

public interface RoleService {
	List<Role> findAll();

	Role addNewRole(CreateDto dto);
}
