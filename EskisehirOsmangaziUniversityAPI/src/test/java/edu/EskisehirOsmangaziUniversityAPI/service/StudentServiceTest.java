package edu.EskisehirOsmangaziUniversityAPI.service;

import edu.EskisehirOsmangaziUniversityAPI.entity.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SpringExtension.class)
class StudentServiceTest {
    @InjectMocks
    private StudentService studentService;
    @Test
    void testGetStudentList() {
        //given
        studentService.addStudent("Metin Cavit");
        studentService.addStudent("Ali Galip");
        studentService.addStudent("Feyza idil");
        studentService.addStudent("Mehmet Fazıl");
        studentService.addStudent("Enes Ense");
        //when
        List<Student> studentList = studentService.getStudentsList();
        //then
        assertThat(studentList.size()).isEqualTo(5);
    }
    @Test
    void testAddStudent() {
        //when
        Student student = studentService.addStudent("ahmet");
        //then
        assertThat(studentService.getStudentsList().size()).isGreaterThanOrEqualTo(1);
    }
}