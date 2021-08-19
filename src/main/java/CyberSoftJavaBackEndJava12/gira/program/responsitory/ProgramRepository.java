package CyberSoftJavaBackEndJava12.gira.program.responsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import CyberSoftJavaBackEndJava12.gira.program.dto.ProgramDto;
import CyberSoftJavaBackEndJava12.gira.program.entity.Program;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {
	@Transactional(readOnly = true)
	@Query("SELECT p  FROM Program p")
	List<ProgramDto> findAllDto();
}
