package org.example.demau1j6.Repository;

import org.example.demau1j6.Dto.NhanVienResponse;
import org.example.demau1j6.Entity.NhanVien;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, Integer> {
    @Query("""
        select new org.example.demau1j6.Dto.NhanVienResponse(
            nv.id,
            nv.maNhanVien,
            nv.hoTen,
            nv.ngaySinh,
            nv.gioiTinh,
            nv.idChucVu.maChucVu,
            nv.idChucVu.tenChucVu
        ) from NhanVien nv
""") public List<NhanVienResponse> getListNhanVienRest();
    @Query("""
        select new org.example.demau1j6.Dto.NhanVienResponse(
            nv.id,
            nv.maNhanVien,
            nv.hoTen,
            nv.ngaySinh,
            nv.gioiTinh,
            nv.idChucVu.maChucVu,
            nv.idChucVu.tenChucVu
        ) from NhanVien nv
""") public List<NhanVienResponse> getListNhanVienRest(Pageable pageable);

}