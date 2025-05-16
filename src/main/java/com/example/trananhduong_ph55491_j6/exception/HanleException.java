package com.example.trananhduong_ph55491_j6.exception;

public class HanleException extends RuntimeException{
    private ErrorCode errorCode;

    public HanleException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
