package CyberSoftJavaBackEndJava12.gira.role.dto;

import javax.validation.constraints.NotBlank;

public class CreateDto {
	@NotBlank
	private String name;
	@NotBlank
	private String desciption;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
}
