package com.kavinda.sms.service;

import com.kavinda.sms.model.Student;
import com.kavinda.sms.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// bussiness logic of the system
@Service
public class StudentService{

    private StudentRepository repository;

    public StudentService(StudentRepository repository){
        this.repository = repository;
    }

    public Student addStudent(Student student){
        return repository.save(student);
    }

    public List<Student> getAllStudents(){
        return repository.findAll();
    }

    public Student updateStudent(Integer id , Student updatedStudent){

        Student student = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("student not found"));

        student.setName(updatedStudent.getName());
        student.setEmail(updatedStudent.getEmail());
        student.setAge(updatedStudent.getAge());

        return repository.save(student);
    }

    public void deleteStudent(Integer id){
        repository.deleteById(id);
    }

}

