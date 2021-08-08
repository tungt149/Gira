package CyberSoftJavaBackEndJava12.gira.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CyberSoftJavaBackEndJava12.gira.entity.Program;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {

}
