package CyberSoftJavaBackEndJava12.gira.role.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CreateDto {
	@NotBlank(message = "{role.name.notblank}")
	@Size(min=3,max=50,message = "{role.name.size}")
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
