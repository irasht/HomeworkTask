package com.training;

import java.lang.annotation.*;

@Documented
@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface NameAnnotation {
    String name();
}
