package com.example.trananhduong_ph55491_j6.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "tac_gia")
public class TacGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ma_tac_gia")
    private String maTacGia;

    @Column(name = "ten_tac_gia")
    private String tenTacGia;

    @Column(name = "ngay_sinh")
    private Date ngaySinh;

    @Column(name = "quoc_tich")
    private String quocTich;

    @Column(name = "mo_ta")
    private String moTa;
}
