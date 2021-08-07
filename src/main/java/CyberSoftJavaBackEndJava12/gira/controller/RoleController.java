package CyberSoftJavaBackEndJava12.gira.controller;

import java.util.ArrayList;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import CyberSoftJavaBackEndJava12.gira.entity.Role;

@RestController
@RequestMapping("/api/role")
public class RoleController {

	
	@GetMapping
	public Object finAllRole() {
		return new ResponseEntity<>(new ArrayList<Role>(), HttpStatus.OK);
	}
}
