package org.example.demau1j6.Service.Impl;

import org.example.demau1j6.Dto.NhanVienRequest;
import org.example.demau1j6.Dto.NhanVienResponse;
import org.example.demau1j6.Entity.NhanVien;
import org.example.demau1j6.Repository.NhanVienRepository;
import org.example.demau1j6.Service.NhanVienService;
import org.example.demau1j6.exception.AppException;
import org.example.demau1j6.exception.ErrorCode;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhanVienServiceImpl implements NhanVienService {
    @Autowired
    NhanVienRepository nhanVienRepository;
    @Override
    public List<NhanVienResponse> getListNhanVien() {
        return nhanVienRepository.getListNhanVienRest();
    }

    @Override
    public List<NhanVienResponse> getListNhanVienphantang(Pageable pageable) {
        return nhanVienRepository.getListNhanVienRest(pageable);
    }

    @Override
    public NhanVienResponse findById(Integer id) {
        NhanVienResponse nhanVienResponse = new NhanVienResponse();
        NhanVien nhanVien = nhanVienRepository.findById(id).orElseThrow(()-> new AppException(ErrorCode.NHANVIEN_NOT_FOUND));
        nhanVienResponse.setMaChucVu(nhanVien.getIdChucVu().getMaChucVu());
        nhanVienResponse.setTenChucVu(nhanVien.getIdChucVu().getTenChucVu());
        BeanUtils.copyProperties(nhanVien,nhanVienResponse);
        return nhanVienResponse;
    }

    @Override
    public void add(NhanVienRequest nhanVienRequest) {
        NhanVien nhanVien = new NhanVien();
        BeanUtils.copyProperties(nhanVienRequest,nhanVien);
        nhanVienRepository.save(nhanVien);
    }

    @Override
    public void update(NhanVienRequest nhanVienRequest) {
        NhanVien nhanVien = new NhanVien();
        BeanUtils.copyProperties(nhanVienRequest,nhanVien);
        nhanVienRepository.save(nhanVien);
    }

    @Override
    public void delete(Integer id) {
        nhanVienRepository.deleteById(id);
    }
}
