package sti.restfull.WebService.example.restfull.WebService.example.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {
    private List<Student> studentRecords;

    private static StudentRegistration stdregd = null;

    private StudentRegistration(){
        studentRecords = new ArrayList<Student>();
    }

    public static StudentRegistration getInstance() {

        if(stdregd == null) {
            stdregd = new StudentRegistration();
            return stdregd;
        }
        else {
            return stdregd;
        }
    }

    public void add(Student std) {
        studentRecords.add(std);
    }

    public String upDateStudent(Student std) {

        for(int i=0; i<studentRecords.size(); i++)
        {
            Student stdn = studentRecords.get(i);
            System.out.println(stdn.getId());
            System.out.println(std.getId());
            if(stdn.getId() == std.getId()) {
                studentRecords.set(i, std);//update the new record
                return "Update successful";
            }
        }

        return "Update un-successful";

    }

    public String deleteStudent(int id) {

        for(int i=0; i<studentRecords.size(); i++)
        {
            Student stdn = studentRecords.get(i);
            if(stdn.getId() == (id)) {
                studentRecords.remove(i);//update the new record
                return String.format("Deleted student %s with id: %s successfully",stdn.getName() , id);
            }
        }

        return "Delete un-successful. Please enter an existing ID";

    }

    public List<Student> getStudentRecords() {
        return studentRecords;
    }

    public Student getStudent(int studentId){
        for(int i=0; i<studentRecords.size(); i++){
            Student student = studentRecords.get(i);
            if(student.getId() == studentId){
                return student;
            }
        }
        return null;
    }


    public String addCourseToStudent(int studentId, Course course){

        for (int i=0; i<studentRecords.size(); i++) {
            Student student = studentRecords.get(i);
            if (student.getId() == studentId) {
                if(student.getCourses() == null){
                    student.setCourses(new ArrayList<Course>());
                }
                student.getCourses().add(course);
                studentRecords.set(i, student);
                return String.format("You have successfully added course %s for %s", course.name, student.getName());
            }
        }

        return "Student not found. Please try again.";
    }

    public List<Course> retrieveCourses(int studentId){
        List<Course> courseList = null;
        for (Student student : studentRecords) {
            if (student.getId() == studentId) {
                courseList = student.getCourses();
            }
        }

        return courseList;
    }

    public Course retrieveCourse(int studentId, int courseId){

        for (Course course : retrieveCourses(studentId)) {
            if (course.getId() == courseId) {
                return course;
            }
        }
        return null;
    }

    public String deleteCourse(int studentId, Course course){
        retrieveCourses(studentId).remove(course);
        return String.format("Successfully deleted course for student %s", studentId);
    }

}
