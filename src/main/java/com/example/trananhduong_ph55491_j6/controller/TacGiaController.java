package com.example.trananhduong_ph55491_j6.controller;

import com.example.trananhduong_ph55491_j6.model.TacGia;
import com.example.trananhduong_ph55491_j6.repository.TacGiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tac-gia")
public class TacGiaController {

    @Autowired
    private TacGiaRepository tacGiaRepository;

    @GetMapping("/get-all")
    public List<TacGia> getAll(){
        return tacGiaRepository.findAll();
    }

    @GetMapping("/get-one/{id}")
    public TacGia getOne(@PathVariable(value = "id") Integer id){
        return tacGiaRepository.findById(id).orElse(null);
    }
}
