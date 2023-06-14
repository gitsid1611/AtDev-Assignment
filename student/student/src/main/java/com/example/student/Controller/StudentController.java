package com.example.student.Controller;

import com.example.student.Bean.Student;
import com.example.student.Exception.StudentException;
import com.example.student.Service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService str;

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@Valid @RequestBody Student cs) throws StudentException{

        if(cs==null)
        {
            throw new StudentException("Not Saved");
        }
        else {
            Student add = str.addStudent(cs);

            return new ResponseEntity<Student>(add, HttpStatus.ACCEPTED);
        }



    }



//	................Plant

    @PutMapping("/update")
    ResponseEntity<Student> updateStudent(@RequestBody Student student)throws StudentException{




        Student updated = str.updateStudent(student);
        return new ResponseEntity<Student>(updated, HttpStatus.ACCEPTED);



    }


    @DeleteMapping("/delete/{id}")
    ResponseEntity<Student> deleteStudent(@PathVariable("id") Student student) throws StudentException{

        Student pe = str.deleteStudent(student);

        return new ResponseEntity<Student>(pe ,HttpStatus.ACCEPTED);

    }


    @GetMapping("/viewAllStudent")
    public ResponseEntity<List<Student>> viewAll()throws StudentException{

        List<Student> find = str.viewAllStudent();

        return new ResponseEntity<List<Student>>(find,HttpStatus.ACCEPTED);

    }



    @GetMapping("/getById/{id}")
    public ResponseEntity<Student> findbyid(@PathVariable("id") int id)throws StudentException {

        Student byid = str.viewStudent(id);

        return new ResponseEntity<Student>(byid,HttpStatus.ACCEPTED);

    }




}
