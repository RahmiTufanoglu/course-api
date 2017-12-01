package com.rahmitufanglu.quickstart.courseapi.dao;

import com.rahmitufanglu.quickstart.courseapi.entity.Student;

import java.util.Collection;

public interface StudentDao {

    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudent(Student student);
}