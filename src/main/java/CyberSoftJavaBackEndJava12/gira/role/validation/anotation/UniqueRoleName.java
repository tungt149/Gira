package CyberSoftJavaBackEndJava12.gira.role.validation.anotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.hibernate.validator.internal.constraintvalidators.hv.UniqueElementsValidator;
@Constraint(validatedBy = UniqueElementsValidator.class)
@Retention(RUNTIME)
@Target(FIELD)
public @interface UniqueRoleName {
public String massege() default "Role name has been used";

public int min() default 3;


Class<?>[]group()default{};
Class<? extends Payload> [] payload() default {};
}
