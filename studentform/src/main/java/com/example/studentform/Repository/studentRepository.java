package com.example.studentform.Repository;

import com.example.studentform.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<Student, Long> {

}
