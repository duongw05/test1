package com.example.trananhduong_ph55491_j6.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ApiResponse<T> {
    private int code; // Mã trạng thái HTTP (ví dụ: 400, 404, 500)
    private String message; // Thông điệp lỗi hoặc thông báo
    private T data; // Dữ liệu trả về (có thể là null trong trường hợp lỗi)
}
