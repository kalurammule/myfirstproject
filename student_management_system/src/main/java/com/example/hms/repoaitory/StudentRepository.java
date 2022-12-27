package com.example.hms.repoaitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	

}
