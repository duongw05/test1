package com.example.trananhduong_ph55491_j6.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SachResponse {
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private Date ngayXuatBan;
    private String theLoai;
    private Double gia;

}
