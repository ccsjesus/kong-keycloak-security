package br.com.tecnssi.security.roles;

import javax.annotation.security.RolesAllowed;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@RolesAllowed({"admin", "teachers", "students"})
public @interface PermittedForAdmin {
}
