package pucmm.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pucmm.springboot.entity.Student;
import pucmm.springboot.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void createStudent(Student student){
        studentRepository.save(student);
    }

    public List<Student> allStudents(){
        List<Student> studentList = new ArrayList<Student>();
        studentRepository.findAll().forEach(student -> studentList.add(student));
        return studentList;
    }


    public Student readStudent(int idStudent){
        for(Student s : allStudents()){
            if(s.getIdStudent() == idStudent){
                return s;
            }
        }
        return null;
    }

    //SAME AS CREATE
    public void updateStudent(Student student){
        studentRepository.save(student);
    }

    public boolean deleteStudent(int idStudent) {
        for (Student s : allStudents()) {
            if (s.getIdStudent() == idStudent) {
                studentRepository.delete(s);
                return true;
            }

        }
        return false;
    }
}
