package com.example.trananhduong_ph55491_j6.repository;

import com.example.trananhduong_ph55491_j6.model.TacGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacGiaRepository extends JpaRepository<TacGia,Integer> {
}
