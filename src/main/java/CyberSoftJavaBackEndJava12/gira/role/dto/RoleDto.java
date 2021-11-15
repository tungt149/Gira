package CyberSoftJavaBackEndJava12.gira.role.dto;
import java.util.Set;

import CyberSoftJavaBackEndJava12.gira.program.dto.ProgramDto;
public interface RoleDto {
public Long getId();
public String getName();
public String getDescription();
public Set<ProgramDto>getPrograms();
}
