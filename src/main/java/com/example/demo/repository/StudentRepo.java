package com.example.demo.repository;
import org.springframework.data.jpa.respository.JpaRepository;
import org.springframwork.stereotype.Repository;
import com.example.demo.entity.Student;

@Repository
public interface StudentRepo extends JpaRespositry<Student, Long>{
    
}