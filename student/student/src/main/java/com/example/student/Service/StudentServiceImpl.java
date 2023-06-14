package com.example.student.Service;

import com.example.student.Bean.Student;
import com.example.student.Exception.StudentException;
import com.example.student.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepo pl;

    @Override
    public Student addStudent(Student cs) throws StudentException {
        Student mod = pl.save(cs);

        if(mod!=null)
        {
            return mod;
        }
        else {
            throw new StudentException("Input is Not Correct");
        }

    }

    @Override
    public Student updateStudent(Student student) throws StudentException {
        Optional<Student> opt=pl.findById(student.getId());

        if(opt.isPresent())
        {
            pl.save(student);

        }


        else {
            throw new StudentException("Student with given id is not presesnt........");

        }

        return opt.get();
    }

    @Override
    public Student deleteStudent(Student studentId) throws StudentException {
        Optional<Student> found = pl.findById(studentId.getId());


        if(found.isPresent()) {
            pl.delete(studentId);


        }
        else {
            throw new StudentException("Cant delete this because no such student is present here");
        }

        return found.get();
    }

    @Override
    public Student viewStudent(Integer st_id) throws StudentException {
        Optional<Student> id = pl.findById(st_id);

        if(id.isEmpty()) {
            throw new StudentException("Id Was In-Correct");
        }
        else {
            return id.get() ;

        }
    }

    @Override
    public List<Student> viewAllStudent() throws StudentException {
        List<Student> allcus = pl.findAll();

        if(allcus.isEmpty()) {
            throw new StudentException("No Student In The Detabase");
        }
        else {
            return allcus;
        }
    }
}
