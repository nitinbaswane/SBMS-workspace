package com.nb.entity;

import com.nb.generators.CustomGenerator;
import org.hibernate.annotations.IdGeneratorType;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@IdGeneratorType(CustomGenerator.class)
@Retention(RUNTIME)
@Target(FIELD)
public @interface fruitId {
}
