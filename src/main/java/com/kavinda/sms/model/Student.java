package com.kavinda.sms.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "students")
public class Student{

    @Id //set id as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //set the id to auto increment
    private Integer id;

    @NotBlank(message = "name is mandotory")
    private String name;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is mandatory")
    private String email;

    @Min(value = 1, message = "Age must be greater than 0")
    private int age;

    public Student() {} //no argument constructors so it can create object by itself
                        // and it is for the framework not for us

    //this constructor is for us not for the framework
    public Student (String name , String email , int age ){
        this.name = name ;
        this.email = email;
        this.age = age;
    }

    //why we need getter and setter
    //Used by Hibernate to read and write entity data when mapping objects to database tables
    // hibernate = tool that concert object to db and db to to object

    public void setId(Integer id){this.id = id;}
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setAge(int age){
        this.age = age;
    }

    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public  String getEmail(){
        return email;
    }
    public int getAge(){
        return age;
    }



}