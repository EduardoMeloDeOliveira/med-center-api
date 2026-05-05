package io.github.EduardoMeloDeOliveira.med_center_api_v1.handlers.dto;

import java.util.List;

public record ValidationErrorResponseDTO(List<ValidationFieldErrorDTO> errors) {
}
