package CyberSoftJavaBackEndJava12.gira.role.service;

import java.util.List;



import org.springframework.stereotype.Service;

import CyberSoftJavaBackEndJava12.gira.program.entity.Program;
import CyberSoftJavaBackEndJava12.gira.program.responsitory.ProgramRepository;
import CyberSoftJavaBackEndJava12.gira.role.dto.AddProgramDto;
import CyberSoftJavaBackEndJava12.gira.role.dto.CreateDto;
import CyberSoftJavaBackEndJava12.gira.role.dto.RoleDto;
import CyberSoftJavaBackEndJava12.gira.role.entity.Role;
import CyberSoftJavaBackEndJava12.gira.role.reponsitory.RoleResponsitory;



@Service
public class RoleServiceImpl implements RoleService {
	private RoleResponsitory responsitory;
	private ProgramRepository programRepository;

	public RoleServiceImpl(RoleResponsitory roleResponsitory,ProgramRepository programRepository) {
		responsitory = roleResponsitory;
		this.programRepository= programRepository;
	}

	@Override
	public List<RoleDto> findAll() {
		return responsitory.findAllDto();
	}

	@Override
	public Role addNewRole(CreateDto dto) {
		Role newRole = new Role();
		newRole.setName(dto.getName());
		newRole.setDescription(dto.getDesciption());
		return this.responsitory.save(newRole);
	
	}

	@Override
	public Role addProgram(AddProgramDto dto) {
		Role role = responsitory.getById(dto.getRoleId());
		Program program = programRepository.getById(dto.getProgramId());
		role.addProgram(program);
		return responsitory.save(role);
	}
}
