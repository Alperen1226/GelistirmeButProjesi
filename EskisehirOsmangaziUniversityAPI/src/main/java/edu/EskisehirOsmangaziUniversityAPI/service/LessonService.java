package edu.EskisehirOsmangaziUniversityAPI.service;

import edu.EskisehirOsmangaziUniversityAPI.entity.Lesson;
import edu.EskisehirOsmangaziUniversityAPI.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LessonService {

    final List<Lesson> lessonList;
    StudentService studentService;
    public LessonService(StudentService studentService) {
        lessonList = new ArrayList<>();
        this.studentService = studentService;
    }
    public  List<Lesson> getLessonList(){
        return lessonList;
    }
    public Lesson addLesson(String name, String description, String lecturer){
        lessonList.add(new Lesson(name, description, lecturer));
        return new Lesson(name, description, lecturer);
    }
    public Lesson addStudent(String lessonName, String studentName){
        for (Lesson lesson:lessonList){
            if (lesson.getName().equals(lessonName)){
                for(Student student:studentService.getStudentsList()){
                    if (student.getName().equals(studentName)){
                        student.getLessons().add(lesson);
                        return lesson;
                    }
                }
            }
        }
        return new Lesson("", "","");
    }
}

