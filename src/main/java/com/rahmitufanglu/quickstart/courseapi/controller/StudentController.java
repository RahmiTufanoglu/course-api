package com.rahmitufanglu.quickstart.courseapi.controller;

import com.rahmitufanglu.quickstart.courseapi.entity.Student;
import com.rahmitufanglu.quickstart.courseapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/students")
    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(value = "/students/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping(value = "/students/{id}")
    public void deleteStudentById(@PathVariable int id) {
        studentService.removeStudentById(id);
    }

    @PutMapping(value = "/students")
    public void deleteStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

    @PostMapping(value = "/students")
    public void insertStudent(@RequestBody Student student) {
        studentService.insertStudent(student);
    }
}