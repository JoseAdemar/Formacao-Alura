package adopet.api.exception;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ResponserError(String message, HttpStatus badRequest, LocalDateTime time) {
}
