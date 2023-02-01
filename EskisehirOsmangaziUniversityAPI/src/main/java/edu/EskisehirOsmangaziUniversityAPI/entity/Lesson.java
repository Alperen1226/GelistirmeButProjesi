package edu.EskisehirOsmangaziUniversityAPI.entity;

public class Lesson {
    String name;
    String description;
    String lecturer;

    public Lesson(String name, String description, String lecturer) {
        this.name = name;
        this.description = description;
        this.lecturer = lecturer;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getLecturer() {
        return lecturer;
    }
    public void setProfessor(String lecturer) {
        this.lecturer = lecturer;
    }
}
