package com.abc.springthymeleaf.controller;

import com.abc.springthymeleaf.entity.Student;
import com.abc.springthymeleaf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/home")
    public String home(){
        return "index";
    }
    @GetMapping("/insert")
    public String insert(){
        return "insert";
    }
    @PostMapping("/insert")
    public void insertAcc(@ModelAttribute Student student){
        studentService.saveStudent(student);
    }
    @GetMapping("/update")
    public String update(){
        return "update";
    }
    @PostMapping("/findByEmail")
    public String findByEmail(@RequestParam String email, Model model){
        Student student=studentService.findByEmail(email);
        model.addAttribute("searchEmail",email);
        if(student!=null){
            model.addAttribute("student",student);
        }else {
            model.addAttribute("errorMessage", "❌ Email Not Found!");
        }
        return "update";
    }
    @PostMapping("/update")
    public String updateStudent(@ModelAttribute Student student,Model model){
        studentService.saveStudent(student);
        model.addAttribute("successMessage", "✅ Update Successfully!");
        return "update";
    }












    @GetMapping("/delete")
    public String delete(){
        return "delete";
    }
    @PostMapping("/delete")
    public String deleteStudent(@RequestParam Integer id, Model model){
        Student student=studentService.findById(id);
        if(student!=null){
            studentService.deleteById(id);
            model.addAttribute("successMessage", "✅ Student Deleted Successfully!");
        }else {
            model.addAttribute("errorMessage", "❌ Student ID Not Found!");
        }
        return "delete";
}





    @GetMapping("/search")
    public String search(){
        return "search";
    }
    @PostMapping("/search")
    public String searchStudent(@RequestParam String email,Model model){
        Student student=studentService.findByEmail(email);
        model.addAttribute("searchEmail",email);
        if(student!=null){
            model.addAttribute("student",student);
        }
        else {
            model.addAttribute("errorMessage","❌ Email Not Found!");
        }
        return "search";
    }

    @GetMapping("/students")
    public String showAllStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

}
