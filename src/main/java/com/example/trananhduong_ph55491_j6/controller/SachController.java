package com.example.trananhduong_ph55491_j6.controller;

import com.example.trananhduong_ph55491_j6.dto.SachRequest;
import com.example.trananhduong_ph55491_j6.model.Sach;
import com.example.trananhduong_ph55491_j6.repository.SachRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sach")
public class SachController {
    @Autowired
    private SachRepository sachRepository;

//    @GetMapping("/hien-thi")
//    public List<SachResponse> hienThi(){
//        return sachRepository.getAll();
//    }

    @GetMapping("/phan-trang")
    public Page<Sach> phanTrang(Pageable pageable){
        return sachRepository.findAll(pageable);
    }

    @GetMapping("/detail")
    public Sach phanTrang(@RequestParam Integer id){
        return sachRepository.findById(id).orElse(null);
    }

    @GetMapping("/tim-kiem")
    public Sach timKiem(@RequestParam("ten") String tenSach){
        return sachRepository.timKiem(tenSach);
    }

    @PutMapping("/admin/update")
    public String update(@RequestBody @Valid SachRequest sachRequest){
        Sach sach = new Sach();
        BeanUtils.copyProperties(sachRequest,sach);
        sachRepository.save(sach);
        return "Sua Thanh cong";
    }
}
