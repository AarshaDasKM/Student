package com.java.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.Student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
