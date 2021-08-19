package CyberSoftJavaBackEndJava12.gira.program.service;

import java.util.List;

import CyberSoftJavaBackEndJava12.gira.program.dto.CreateProgramDto;
import CyberSoftJavaBackEndJava12.gira.program.dto.ProgramDto;
import CyberSoftJavaBackEndJava12.gira.program.entity.Program;
public interface ProgramService {
	List<ProgramDto> findAll();
	
	
	Program saveProgram(CreateProgramDto createProgramDto);
}
