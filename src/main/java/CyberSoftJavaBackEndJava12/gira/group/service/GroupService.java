package CyberSoftJavaBackEndJava12.gira.group.service;

import java.util.List;

import CyberSoftJavaBackEndJava12.gira.group.dto.GroupDto;
import CyberSoftJavaBackEndJava12.gira.group.entity.Group;

public interface GroupService {
	List<Group> findAll();

	Group newGroup(GroupDto groupDto);

}
