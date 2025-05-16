package org.example.demau1j6.Service;

import org.example.demau1j6.Dto.NhanVienRequest;
import org.example.demau1j6.Dto.NhanVienResponse;
import org.example.demau1j6.Entity.NhanVien;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface NhanVienService {
    List<NhanVienResponse> getListNhanVien();
    List<NhanVienResponse> getListNhanVienphantang(Pageable pageable);
    NhanVienResponse findById(Integer id);
    void add(NhanVienRequest nhanVien);
    void update(NhanVienRequest nhanVien);
    void delete(Integer id);
}
