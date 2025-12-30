package com.kavinda.sms.controller;


import com.kavinda.sms.model.Student;
import com.kavinda.sms.repository.StudentRepository;
import com.kavinda.sms.service.StudentService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController{

    private final StudentService studentService;

    // constructor injection
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    //test endpoing
    @GetMapping("/hello")
    public String hello(){
        return "Student api is working ";
    }

    //add student
    @PostMapping
    public Student createStudent (@RequestBody Student student){
        return studentService.addStudent(student);
    }

    //view student
    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }

    //update student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Integer id , @RequestBody Student student ){
        return studentService.updateStudent(id , student);
    }

    //delete student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);

        return "Student with id " + id + "deleted succefully";
    }

}


