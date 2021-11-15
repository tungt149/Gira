package CyberSoftJavaBackEndJava12.gira.group.controller;

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

import CyberSoftJavaBackEndJava12.gira.common.ResponseHeader;
import CyberSoftJavaBackEndJava12.gira.group.dto.GroupDto;
import CyberSoftJavaBackEndJava12.gira.group.entity.Group;
import CyberSoftJavaBackEndJava12.gira.group.service.GroupService;

@RestController
@RequestMapping("/api/group")
public class GroupController {
	private GroupService service;

	public GroupController(GroupService groupService) {
		service = groupService;
	}

	@GetMapping
	public Object findAllGroup() {
		List<Group> groups = service.findAll();
		return ResponseHeader.getResponse(groups, HttpStatus.OK);
	}

	@PostMapping
	public Object saveGroup(@Valid @RequestBody GroupDto groupDto, BindingResult errors) {
		if (errors.hasErrors())
			return new ResponseEntity<>(errors.getAllErrors(), HttpStatus.BAD_REQUEST);

		Group addedGroup = service.newGroup(groupDto);

		return ResponseHeader.getResponse(addedGroup, HttpStatus.CREATED);

	}

}
