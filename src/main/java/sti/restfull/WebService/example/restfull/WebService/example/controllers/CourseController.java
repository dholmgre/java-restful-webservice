package sti.restfull.WebService.example.restfull.WebService.example.controllers;

import org.springframework.web.bind.annotation.*;
import sti.restfull.WebService.example.restfull.WebService.example.beans.*;

import java.util.List;

@RestController
public class CourseController {

    @RequestMapping(method = RequestMethod.DELETE, value="/delete/course/{courseId}/fromstudent/{studentId}")

    @ResponseBody
    public String deleteCourseRecord(@PathVariable("studentId") int studentId, @PathVariable("courseId") int courseId) {
        System.out.println("In deleteCourseRecord");
        return StudentRegistration.getInstance().deleteCourse(studentId, StudentRegistration.getInstance().retrieveCourse(studentId, courseId));
    }

    @RequestMapping(method = RequestMethod.PUT, value="/register/course/{studentId}")

    @ResponseBody
    public String registerCourse(@PathVariable("studentId") int studentId, @RequestBody Course course) {

        System.out.println("In registerCourse");
        return StudentRegistration.getInstance().addCourseToStudent(studentId, course);
    }

    @RequestMapping(method = RequestMethod.GET, value="/course/allcourses/{studentId}")

    @ResponseBody
    public List<Course> getAllCourses(@PathVariable("studentId") int studentId) {
        return StudentRegistration.getInstance().retrieveCourses(studentId);
    }

    @RequestMapping(method = RequestMethod.GET, value="/course/{courseId}/student/{studentId}")

    @ResponseBody
    public Course getCourse(@PathVariable("courseId") int courseId, @PathVariable("studentId") int studentId) {
        return StudentRegistration.getInstance().retrieveCourse(studentId, courseId);
    }
}
