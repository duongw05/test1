package com.example.trananhduong_ph55491_j6.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SachRequest {
    private Integer id;

    @NotBlank(message = "Not_Valid_Ma")
    private String maSach;

    @NotBlank(message = "Not_Valid_Ten")
    private String tenSach;

    @NotBlank(message = "Not_Valid_The_Loai")
    private String theLoai;

    @NotNull(message = "Not_Valid_Ngay")
    private Date ngayXuatBan;

    @NotNull(message = "Not_Valid_Gia")
    private Double gia;

    @NotNull(message = "Not_Valid_Chuc_Vu")
    private Integer tacGiaId;

}
