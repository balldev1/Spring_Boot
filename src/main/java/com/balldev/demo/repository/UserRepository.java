package com.balldev.demo.repository;

import com.balldev.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // สามารถเพิ่มเมธอดสำหรับค้นหาหรือจัดการข้อมูลอื่นๆ ได้ที่นี่
}
