package com.taikang.springbootdemo.validCheck;



import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidCardNumberConstraint implements ConstraintValidator<ValidCardNumber,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        String[] arrs = s.split("-");
        if (arrs.length!=2){
            return false;
        }

        String prefix = arrs[0];
        String suffix = arrs[1];

        boolean checkPrefix = "HE".equals(prefix);
        boolean checkSuffix = StringUtils.isNumeric(suffix);
        return checkPrefix && checkSuffix;
    }
}
