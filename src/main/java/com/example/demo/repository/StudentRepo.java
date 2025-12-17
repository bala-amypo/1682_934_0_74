package com.example.demo.repository;
import org.springframework.data.jpa.respository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Student;

@Repository
public interface StudentRepo extends JpaRespository<Student, Long>{
}