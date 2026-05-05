package io.github.EduardoMeloDeOliveira.med_center_api_v1.handlers.exceptions;

public class MedCenterNotFoundException extends RuntimeException {
    public MedCenterNotFoundException(String message) {
        super(message);
    }
}
