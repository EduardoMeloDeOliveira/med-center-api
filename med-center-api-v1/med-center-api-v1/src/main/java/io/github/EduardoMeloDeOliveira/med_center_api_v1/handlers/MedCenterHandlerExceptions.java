package io.github.EduardoMeloDeOliveira.med_center_api_v1.handlers;

import io.github.EduardoMeloDeOliveira.med_center_api_v1.handlers.dto.ValidationErrorResponseDTO;
import io.github.EduardoMeloDeOliveira.med_center_api_v1.handlers.dto.ValidationFieldErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class MedCenterHandlerExceptions {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationErrorResponseDTO> handleValidationErrors(MethodArgumentNotValidException ex) {
        List<ValidationFieldErrorDTO> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(fieldError -> new ValidationFieldErrorDTO(fieldError.getField(), fieldError.getDefaultMessage()))
                .toList();

        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(new ValidationErrorResponseDTO(errors));
    }
}
