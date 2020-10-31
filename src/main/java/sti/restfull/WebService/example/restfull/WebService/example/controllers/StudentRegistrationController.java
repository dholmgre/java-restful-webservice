package sti.restfull.WebService.example.restfull.WebService.example.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sti.restfull.WebService.example.restfull.WebService.example.beans.*;

@RestController
public class StudentRegistrationController {

    @RequestMapping(method = RequestMethod.POST, value="/register/student")

    @ResponseBody
    StudentRegistrationReply registerStudent(@RequestBody Student student) {

        System.out.println("In registerStudent");
        StudentRegistrationReply stdregreply = new StudentRegistrationReply();

        StudentRegistration.getInstance().add(student);

        //We are setting the below value just to reply a message back to the caller
        stdregreply.setName(student.getName());
        stdregreply.setId(student.getId());
        stdregreply.setDescription(student.getDescription());
        stdregreply.setCourses(student.getCourses());
        stdregreply.setRegistrationStatus("Successful");


        return stdregreply;

    }
}
