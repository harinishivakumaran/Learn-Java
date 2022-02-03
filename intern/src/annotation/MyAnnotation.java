package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //tell annotation how long this annotation should be retained
@Target(ElementType.METHOD) //target tells where annotations to be applied
public @interface MyAnnotation {
	
}
