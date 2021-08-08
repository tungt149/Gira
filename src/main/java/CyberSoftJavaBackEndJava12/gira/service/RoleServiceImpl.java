package CyberSoftJavaBackEndJava12.gira.service;

import java.util.List;


import org.springframework.stereotype.Service;

import CyberSoftJavaBackEndJava12.gira.dto.CreateDto;
import CyberSoftJavaBackEndJava12.gira.entity.Role;
import CyberSoftJavaBackEndJava12.gira.responsitory.RoleResponsitory;

@Service
public class RoleServiceImpl implements RoleService {
	private RoleResponsitory responsitory;

	public RoleServiceImpl(RoleResponsitory roleResponsitory) {
		responsitory = roleResponsitory;
	}

	@Override
	public List<Role> findAll() {

		return responsitory.findAll();
	}

	@Override
	public Role addNewRole(CreateDto dto) {
		Role newRole = new Role();
		newRole.setName(dto.getName());
		newRole.setDescription(dto.getDesciption());
		return this.responsitory.save(newRole);
	
	}
}
