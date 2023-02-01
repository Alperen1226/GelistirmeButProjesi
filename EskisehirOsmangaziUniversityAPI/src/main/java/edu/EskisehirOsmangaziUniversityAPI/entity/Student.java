package edu.EskisehirOsmangaziUniversityAPI.entity;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Lesson> lessons;

    public Student(String name) {
        this.name = name;
        lessons=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }
}
