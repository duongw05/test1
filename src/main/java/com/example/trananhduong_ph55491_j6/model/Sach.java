package com.example.trananhduong_ph55491_j6.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "sach")
public class Sach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ma_sach")
    private String maSach;

    @Column(name = "ten_sach")
    private String tenSach;

    @Column(name = "the_loai")
    private String theLoai;

    @Column(name = "ngay_xuat_ban")
    private Date ngayXuatBan;

    @Column(name = "gia")
    private Double gia;

    @ManyToOne
    @JoinColumn(name = "id_tac_gia")
    private TacGia tacGia;
}
