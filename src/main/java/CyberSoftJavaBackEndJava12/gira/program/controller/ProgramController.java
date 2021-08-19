package CyberSoftJavaBackEndJava12.gira.program.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CyberSoftJavaBackEndJava12.gira.common.ResponseHeader;

import CyberSoftJavaBackEndJava12.gira.program.dto.CreateProgramDto;
import CyberSoftJavaBackEndJava12.gira.program.dto.ProgramDto;
import CyberSoftJavaBackEndJava12.gira.program.entity.Program;
import CyberSoftJavaBackEndJava12.gira.program.service.ProgramService;

@RestController
@RequestMapping("/api/program")
public class ProgramController {
	private ProgramService service;

	public ProgramController(ProgramService programService) {
		service = programService;
	}

	@GetMapping
	public Object findAllProgram() {
		List<ProgramDto> programs = service.findAll();
		return ResponseHeader.getResponse(programs, HttpStatus.OK);
	}

	@PostMapping
	public Object SaveProgram(@Valid @RequestBody CreateProgramDto createProgramDto, BindingResult errors) {
		if (errors.hasErrors())
			return ResponseHeader.getResponse(errors, HttpStatus.BAD_REQUEST);
		Program newProgram = service.saveProgram(createProgramDto);
		return ResponseHeader.getResponse(newProgram, HttpStatus.CREATED);
	}
}
