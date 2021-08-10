package CyberSoftJavaBackEndJava12.gira.program.service;

import java.util.List;

import org.springframework.stereotype.Service;

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
	public List<Program> findAll() {

		return repository.findAll();
	}

	@Override
	public Program addNewProgram(ProgramDto programDto) {
		Program newProgram = new Program();
		newProgram.setName(programDto.getName());
		newProgram.setMethod(programDto.getMethod());
		newProgram.setPath(programDto.getPath());

		return this.repository.save(newProgram);
	}

}
