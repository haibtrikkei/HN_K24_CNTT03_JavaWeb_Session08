package validate_form.validateform_session08.custom_validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ProIdValidValidator implements ConstraintValidator<ProIdValid, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value==null || value.isEmpty()){
            return true;
        }
        return value.startsWith("P");
    }
}
