package org.example.demau1j6.exception;

public enum ErrorCode {
    NHANVIEN_NOT_FOUND(608,"Khong tim thay nhan vien"),
    MANHANVIEN_NOT_VALID(401,"Ma nhan vien can not be null"),
    TENNHANVIEN_NOT_VALID(402,"Ten nhan vien can not be null"),
    ;
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
