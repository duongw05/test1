package org.example.demau1j6.Dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NhanVienResponse {
    private Integer id;
    private String maNhanVien;
    private String hoTen;
    private LocalDate ngaySinh;
    private Boolean gioiTinh;
    private String maChucVu;
    private String tenChucVu;

}
