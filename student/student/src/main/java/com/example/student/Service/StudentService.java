package com.example.student.Service;

import com.example.student.Bean.Student;
import com.example.student.Exception.StudentException;

import java.util.List;

public interface StudentService {

    public Student addStudent (Student cs) throws StudentException;

    public Student updateStudent(Student student) throws StudentException;

    public Student deleteStudent(Student studentId) throws StudentException;

    public Student viewStudent(Integer st_id) throws StudentException;

    public List<Student> viewAllStudent() throws StudentException;
}
