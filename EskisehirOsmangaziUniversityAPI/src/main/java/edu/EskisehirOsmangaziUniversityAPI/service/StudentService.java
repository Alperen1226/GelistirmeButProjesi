package edu.EskisehirOsmangaziUniversityAPI.service;

import edu.EskisehirOsmangaziUniversityAPI.entity.Lesson;
import edu.EskisehirOsmangaziUniversityAPI.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {
    ArrayList<Student> studentList;
    public StudentService() {
        studentList=new ArrayList<>();
    }
    public ArrayList<Student> getStudentsList(){
        return studentList;
    }
    public Student addStudent(String name){
        studentList.add(new Student(name));
        return new Student(name);
    }
    public ArrayList<Lesson> getLessonsOfStudent(String name){
        for (int i=0;i<studentList.size();i++){
            if (studentList.get(i).getName().equals(name)){
                return studentList.get(i).getLessons();
            }
        }
        return new ArrayList<>();
    }
}
