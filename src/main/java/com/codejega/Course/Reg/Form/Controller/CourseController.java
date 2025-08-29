package com.codejega.Course.Reg.Form.Controller;

import com.codejega.Course.Reg.Form.Model.Course;
import com.codejega.Course.Reg.Form.Model.CourseRegistry;
import com.codejega.Course.Reg.Form.Repository.CourseRegistryRepo;
import com.codejega.Course.Reg.Form.Service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:5500", "http://127.0.0.1:5501"})
@RestController
public class CourseController {

    @Autowired
    courseService CourseService;

    @GetMapping("courses")

    public List<Course> availableCourses(){
      return  CourseService.availableCourses();
    }

    @GetMapping("courses/enrolled")
     public  List<CourseRegistry> enrolledStudents(){
        return  CourseService.enrolledStudents();

    }

    @PostMapping("courses/register")
    public String enrollCourse(
            @RequestParam ("name")String name,
            @RequestParam("emailId") String emailId,
            @RequestParam("courseName")String courseName
    ){
        CourseService.enrollCourse(name ,emailId,courseName);
        return "Congratulations "+name+" Enrollment Successful For "+courseName;



    }
}
