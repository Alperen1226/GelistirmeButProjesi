package edu.EskisehirOsmangaziUniversityAPI.service;

import edu.EskisehirOsmangaziUniversityAPI.entity.Lesson;
import edu.EskisehirOsmangaziUniversityAPI.entity.Student;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
class LessonServiceTest {
    @InjectMocks
    private LessonService lessonService;
    @Test
    void testLessonList() {
        //given
        Lesson lesson1 = new Lesson("Java", "Java", "Java lecturer");
        lessonService.addLesson(lesson1.getName(), lesson1.getDescription(), lesson1.getLecturer());

        Lesson lesson2 = new Lesson("Spring", "Spring", "Spring lecturer");
        lessonService.addLesson(lesson2.getName(), lesson2.getDescription(), lesson2.getLecturer());

        Lesson lesson3 = new Lesson("Mobil", "Mobil", "Mobil lecturer");
        lessonService.addLesson(lesson3.getName(), lesson3.getDescription(), lesson3.getLecturer());

        Lesson lesson4 = new Lesson("Kotlin", "Kotlin", "Kotlin lecturer");
        lessonService.addLesson(lesson4.getName(), lesson4.getDescription(), lesson4.getLecturer());

        Lesson lesson5 = new Lesson("GoLang", "GoLang", "GoLang lecturer");
        lessonService.addLesson(lesson5.getName(), lesson5.getDescription(), lesson5.getLecturer());
        //when
        List<Lesson> lessonList = lessonService.getLessonList();
        //then
        assertThat(lessonList.size()).isEqualTo(5);
    }
    @Test
    void testAddLesson() {
        //when
        Lesson lesson = lessonService.addLesson("Java", "Java", "Java lecturer");
        //then
        assertThat(lesson.getName()=="Java");
    }
}