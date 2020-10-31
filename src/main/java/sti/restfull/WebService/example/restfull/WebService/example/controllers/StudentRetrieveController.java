package sti.restfull.WebService.example.restfull.WebService.example.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import sti.restfull.WebService.example.restfull.WebService.example.beans.Student;
import sti.restfull.WebService.example.restfull.WebService.example.beans.StudentRegistration;

@RestController
public class StudentRetrieveController {

    @RequestMapping(method = RequestMethod.GET, value="/student/allstudent")

    @ResponseBody
    public List<Student> getAllStudent() {
        return StudentRegistration.getInstance().getStudentRecords();
    }



    @RequestMapping(method = RequestMethod.GET, value="/student/specific/{id}")

    @ResponseBody
    public Student getStudent(@PathVariable("id") int id) {
        return StudentRegistration.getInstance().getStudent(id);
    }


}