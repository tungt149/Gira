package CyberSoftJavaBackEndJava12.gira.role.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import CyberSoftJavaBackEndJava12.gira.role.validation.anotation.UniqueRoleName;

public class UniqueRoleNameValidator implements ConstraintValidator<UniqueRoleName, String>{
private String message;

@Override
public boolean isValid(String value, ConstraintValidatorContext context) {
	// TODO Auto-generated method stub
	return false;
}

}
