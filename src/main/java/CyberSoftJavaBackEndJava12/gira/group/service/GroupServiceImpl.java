package CyberSoftJavaBackEndJava12.gira.group.service;

import java.util.List;

import org.springframework.stereotype.Service;

import CyberSoftJavaBackEndJava12.gira.group.dto.GroupDto;
import CyberSoftJavaBackEndJava12.gira.group.entity.Group;
import CyberSoftJavaBackEndJava12.gira.group.responsitory.GroupRepository;

@Service
public class GroupServiceImpl implements GroupService {
	private GroupRepository repository;

	public GroupServiceImpl(GroupRepository groupRepository) {
		repository = groupRepository;
	}

	@Override
	public List<Group> findAll() {

		return repository.findAll();
	}

	@Override
	public Group newGroup(GroupDto groupDto) {
		Group newGroup = new Group();
		newGroup.setName(groupDto.getName());
		newGroup.setDescription(groupDto.getDescription());

		return this.repository.save(newGroup);
	}

}
