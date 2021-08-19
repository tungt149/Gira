package CyberSoftJavaBackEndJava12.gira.program.dto;

import CyberSoftJavaBackEndJava12.gira.role.util.Httpmethods;

public interface ProgramDto {
public Long getId();
public String getName();
public Httpmethods getMethods();
public String path();

}
