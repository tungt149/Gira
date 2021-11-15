package CyberSoftJavaBackEndJava12.gira.program.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import CyberSoftJavaBackEndJava12.gira.role.util.Httpmethods;

public class CreateProgramDto {
	
	@NotBlank(message = "{role.name.not-blank}")
	@Size(min = 3, max = 50, message = "{role.name.size}")
	private String name;

	private Httpmethods method;
	private String path;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Httpmethods getMethod() {
		return method;
	}

	public void setMethod(Httpmethods method) {
		this.method = method;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
