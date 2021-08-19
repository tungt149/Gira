package CyberSoftJavaBackEndJava12.gira.program.service;

import java.util.List;

import org.springframework.stereotype.Service;

import CyberSoftJavaBackEndJava12.gira.program.dto.CreateProgramDto;
import CyberSoftJavaBackEndJava12.gira.program.dto.ProgramDto;
import CyberSoftJavaBackEndJava12.gira.program.entity.Program;
import CyberSoftJavaBackEndJava12.gira.program.responsitory.ProgramRepository;


@Service
public class ProgramImpl implements ProgramService {
	private ProgramRepository repository;

	public ProgramImpl(ProgramRepository programRepository) {
		repository = programRepository;
	}

	@Override
	public List<ProgramDto> findAll() {

		return repository.findAllDto();
	}

	
	@Override
	public Program saveProgram(CreateProgramDto createProgramDto) {
		Program program = new Program();
		program.setName(createProgramDto.getName());
		program.setMethod(createProgramDto.getMethod());
		program.setPath(createProgramDto.getPath());
		return repository.save(program);
	}

	

}
