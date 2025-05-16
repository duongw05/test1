package org.example.demau1j6.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.demau1j6.Entity.ChucVu;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NhanVienRequest {
    private Integer id;
    @NotBlank(message = "MANHANVIEN_NOT_VALID")
    private String maNhanVien;
    private String hoTen;
    private LocalDate ngaySinh;
    private Boolean gioiTinh;
    private String email;
    private String soDienThoai;
    private BigDecimal luong;
    private String diaChi;
    private ChucVu idChucVu;
}
