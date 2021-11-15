package CyberSoftJavaBackEndJava12.gira.group.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CyberSoftJavaBackEndJava12.gira.group.entity.Group;



@Repository
public interface GroupRepository extends JpaRepository<Group, Long>{

}
