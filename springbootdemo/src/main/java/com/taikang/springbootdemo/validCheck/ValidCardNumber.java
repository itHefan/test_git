package com.taikang.springbootdemo.validCheck;

@java.lang.annotation.Target({ java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Documented
@javax.validation.Constraint(validatedBy = {ValidCardNumberConstraint.class})
public @interface ValidCardNumber {
    java.lang.String message() default "{javax.validation.constraints.NotNull.message}";

    java.lang.Class<?>[] groups() default {};

    java.lang.Class<? extends javax.validation.Payload>[] payload() default {};

}
