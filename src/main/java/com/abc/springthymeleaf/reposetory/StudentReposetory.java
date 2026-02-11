package com.abc.springthymeleaf.reposetory;

import com.abc.springthymeleaf.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentReposetory extends JpaRepository<Student,Integer> {
    Student findByEmail(String email);

}
