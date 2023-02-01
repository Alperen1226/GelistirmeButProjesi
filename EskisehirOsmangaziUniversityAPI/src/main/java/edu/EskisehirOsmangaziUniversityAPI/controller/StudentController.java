package edu.EskisehirOsmangaziUniversityAPI.controller;

import edu.EskisehirOsmangaziUniversityAPI.entity.Lesson;
import edu.EskisehirOsmangaziUniversityAPI.entity.Student;
import edu.EskisehirOsmangaziUniversityAPI.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentController {
    StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/student")
    public ArrayList<Student> getStudentList(){
        return studentService.getStudentsList();
    }
    @PostMapping("/student/add")
    public Student addStudent(@RequestBody String name){
        return studentService.addStudent(name);
    }
    @GetMapping("/student/{name}")
    public ArrayList<Lesson> getLessonsOfStudent(@PathVariable String name){
        return studentService.getLessonsOfStudent(name);
    }
}
