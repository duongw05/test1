package com.example.trananhduong_ph55491_j6.exception;


public enum ErrorCode {
    Not_Valid_Ma(401,"Vui long nhap ma"),
    Not_Valid_Ten(401,"Vui long nhap tenSach"),
    Not_Valid_The_Loai(401,"Vui long nhap theLoai"),
    Not_Valid_Ngay(401,"Vui long nhap ngayXuatBan"),
    Not_Valid_Gia(401,"Vui long nhap gia"),
    Not_Valid_Chuc_Vu(401,"Vui long nhap Tác Gỉa"),
    ;
    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
