package sti.restfull.WebService.example.restfull.WebService.example.beans;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private String description;
    private List<Course> courses;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
