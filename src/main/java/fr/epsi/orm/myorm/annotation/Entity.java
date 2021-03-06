package fr.epsi.orm.myorm.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by fteychene on 14/05/17.
 *
 * Specifies that the class is an entity. This annotation is applied to the
 * entity class.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Entity {

    /**
     * (Optional) The name of the table.
     * Defaults to the entity name.
     * @return the table name defined in annotation
     */
    String table() default "";
}
