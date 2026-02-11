package com.abc.springthymeleaf.service;

import com.abc.springthymeleaf.entity.Student;
import com.abc.springthymeleaf.reposetory.StudentReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentReposetory studentReposetory;

    public void saveStudent(Student student){
        studentReposetory.save(student);
    }

    public Student findByEmail(String email){
        return studentReposetory.findByEmail(email);
    }

    public Student findById(Integer id){
        return studentReposetory.findById(id).orElse(null);
    }

    public void deleteById(Integer id){
        studentReposetory.deleteById(id);
    }

    public List<Student>getAllStudents(){
        return studentReposetory.findAll();
    }
}
