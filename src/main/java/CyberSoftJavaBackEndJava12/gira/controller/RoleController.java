package CyberSoftJavaBackEndJava12.gira.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CyberSoftJavaBackEndJava12.gira.common.until.ResponseHeader;
import CyberSoftJavaBackEndJava12.gira.dto.CreateDto;
import CyberSoftJavaBackEndJava12.gira.entity.Role;
import CyberSoftJavaBackEndJava12.gira.service.RoleService;
import javassist.expr.NewArray;

@RestController
@RequestMapping("/api/role")
public class RoleController {
	private RoleService service;

	public RoleController(RoleService roleService) {
		service = roleService;
	}

	@GetMapping
	public Object finAllRole() {
		List<Role> roles = service.findAll();
		return ResponseHeader.getResponse(roles, HttpStatus.OK);
	}

	@PostMapping
	public Object saveRole(@Valid @RequestBody CreateDto dto,BindingResult erros) {
		if(erros.hasErrors()) {
			return new ResponseEntity<>(erros.getAllErrors(), HttpStatus.BAD_REQUEST);
		}
		
		Role addedRole = service.addNewRole(dto);
		
		
		return ResponseHeader.getResponse(addedRole, HttpStatus.CREATED);
	}

}
