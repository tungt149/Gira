package CyberSoftJavaBackEndJava12.gira.role.service;

import java.util.List;



import CyberSoftJavaBackEndJava12.gira.role.dto.AddProgramDto;
import CyberSoftJavaBackEndJava12.gira.role.dto.CreateDto;
import CyberSoftJavaBackEndJava12.gira.role.dto.RoleDto;
import CyberSoftJavaBackEndJava12.gira.role.entity.Role;

public interface RoleService {
	List<RoleDto> findAll();

	Role addNewRole(CreateDto dto);

	Role addProgram( AddProgramDto dto);
}
