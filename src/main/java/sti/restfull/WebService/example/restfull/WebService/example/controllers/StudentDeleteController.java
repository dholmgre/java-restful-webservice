package sti.restfull.WebService.example.restfull.WebService.example.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sti.restfull.WebService.example.restfull.WebService.example.beans.StudentRegistration;

@RestController
public class StudentDeleteController {

    @RequestMapping(method = RequestMethod.DELETE, value="/delete/student/{regdNum}")

    @ResponseBody
    public String deleteStudentRecord(@PathVariable("regdNum") int id) {
        System.out.println("In deleteStudentRecord");
        return StudentRegistration.getInstance().deleteStudent(id);
    }
}
