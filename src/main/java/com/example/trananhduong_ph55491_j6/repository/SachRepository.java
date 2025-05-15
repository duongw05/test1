package com.example.trananhduong_ph55491_j6.repository;

import com.example.trananhduong_ph55491_j6.dto.SachResponse;
import com.example.trananhduong_ph55491_j6.model.Sach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SachRepository extends JpaRepository<Sach,Integer> {

    @Query("""
    select new com.example.trananhduong_ph55491_j6.dto.SachResponse(
        s.maSach,s.tenSach,tg.tenTacGia,s.ngayXuatBan,s.theLoai,s.gia
    ) from Sach s join TacGia tg
""")
    List<SachResponse> getAll();

    @Query("""
    select s from Sach s where s.tenSach =:tenSach 
""")
    Sach timKiem(@Param("tenSach") String tenSach);
}
