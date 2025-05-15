package com.example.trananhduong_ph55491_j6.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = HanleException.class)
    public ResponseEntity<ApiResponse<Void>> xuLy(HanleException e) {
        ErrorCode errorCode = e.getErrorCode();
        ApiResponse<Void> response = new ApiResponse<>(
                errorCode.getCode(),
                errorCode.getMessage(),
                null
        );
        return ResponseEntity.status(errorCode.getCode()).body(response);
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse<Void>> xuLy2(MethodArgumentNotValidException e) {
        String enumKey = e.getFieldError().getDefaultMessage();
        try {
            ErrorCode errorCode = ErrorCode.valueOf(enumKey);
            ApiResponse<Void> response = new ApiResponse<>(
                    errorCode.getCode(),
                    errorCode.getMessage(),
                    null
            );
            return ResponseEntity.status(errorCode.getCode()).body(response);
        } catch (IllegalArgumentException ex) {
            // Xử lý trường hợp enumKey không hợp lệ
            ApiResponse<Void> response = new ApiResponse<>(
                    400,
                    "Invalid error code: " + enumKey,
                    null
            );
            return ResponseEntity.status(400).body(response);
        }
    }
}
