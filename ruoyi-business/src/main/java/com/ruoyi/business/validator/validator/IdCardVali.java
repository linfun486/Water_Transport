package com.ruoyi.business.validator.validator;

import com.ruoyi.business.validator.constraint.IdCardConstraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author hj
 * @date 2021/10/8 15:06
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IdCardConstraint.class)
public @interface IdCardVali {

    String message() default "身份证格式错误";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}