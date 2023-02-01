package edu.EskisehirOsmangaziUniversityAPI.controller;

import edu.EskisehirOsmangaziUniversityAPI.entity.Lesson;
import edu.EskisehirOsmangaziUniversityAPI.service.LessonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LessonController {

    private final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @GetMapping("/lesson")
    public List<Lesson> getLessonList(){
        return lessonService.getLessonList();
    }

    @PostMapping("/lesson/add")
    public Lesson addLesson(@RequestBody Lesson lesson){
        return lessonService.addLesson(lesson.getName(), lesson.getDescription(), lesson.getLecturer());
    }
    @GetMapping("/lesson/{lessonName}/{studentName}")
    public Lesson addStudent(@PathVariable String lessonName, @PathVariable String studentName){
        return lessonService.addStudent(lessonName,studentName);
    }

}

