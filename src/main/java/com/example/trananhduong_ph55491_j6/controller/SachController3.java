package com.example.trananhduong_ph55491_j6.controller;

import com.example.trananhduong_ph55491_j6.model.Sach;
import com.example.trananhduong_ph55491_j6.repository.SachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sach3")
public class SachController3 {
    @Autowired
    private SachRepository sachRepository;

//    @GetMapping("/hien-thi")
//    public List<SachResponse> hienThi(){
//        return sachRepository.getAll();
//    }

    @GetMapping("/hien-thi")
    public List<Sach> phanTrang(){
        return sachRepository.findAll();
    }
}
