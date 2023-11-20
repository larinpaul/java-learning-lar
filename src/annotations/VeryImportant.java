package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

// Allows you to specify which kind of Java element this java annotation is valid to be used on
@Target({ElementType.TYPE, ElementType.METHOD}) // This annotation only works with classes (Types)
@Retention(RetentionPolicy.RUNTIME) // THIS ANNOTATION IS SUPPOSED TO WORK...
//@Retention(RetentionPolicy.SOURCE) // Only matter before the code is compiled, like the SuppressWarnings
//@Retention(RetentionPolicty.CLASS) // Keep your annotations around through compilation, but before runtime
public @interface VeryImportant {
	
}