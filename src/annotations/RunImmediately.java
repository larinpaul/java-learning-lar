package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RunImmediately {

	int times();
	// annotation members can only be primitives, array of primitives, or a class type (but not your type like Dog)
	
	// you can also add default values if you want to:
	int timesToo() default 1; 
	
}
