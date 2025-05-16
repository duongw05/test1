package org.example.demau1j6.Controller;

import jakarta.validation.Valid;
import org.example.demau1j6.Dto.NhanVienRequest;
import org.example.demau1j6.Dto.NhanVienResponse;
import org.example.demau1j6.Entity.NhanVien;
import org.example.demau1j6.Service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nhan-vien")
public class NhanVienController {
    @Autowired
    NhanVienService nhanVienService;
    @GetMapping("/hien-thi")
    public List<NhanVienResponse> hienthi(){
        return nhanVienService.getListNhanVien();
    }
    @GetMapping("/hien-thi/phan-trang")
    public List<NhanVienResponse> hienthiPhanTrang(@PageableDefault(size = 5, page = 0)Pageable pageable){
        return nhanVienService.getListNhanVienphantang(pageable);
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id){
        nhanVienService.delete(id);
        return "xoa thanh cong";
    }
    @GetMapping("/find")
    public NhanVienResponse find(@RequestParam("id") Integer id){
        return nhanVienService.findById(id);
    }

    @PutMapping("/add")
    public ResponseEntity<NhanVienRequest> add(@RequestBody @Valid NhanVienRequest nhanVienRequest){
        nhanVienService.add(nhanVienRequest);
        return ResponseEntity.ok(nhanVienRequest);
    }
    @PutMapping("/update")
    public ResponseEntity<NhanVienRequest> adsd(@RequestBody NhanVienRequest nhanVienRequest){
        nhanVienService.add(nhanVienRequest);
        return ResponseEntity.ok(nhanVienRequest);
    }

}
