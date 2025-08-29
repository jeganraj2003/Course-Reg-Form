package com.codejega.Course.Reg.Form.Service;


import com.codejega.Course.Reg.Form.Model.Course;
import com.codejega.Course.Reg.Form.Model.CourseRegistry;
import com.codejega.Course.Reg.Form.Repository.CourseRegistryRepo;
import com.codejega.Course.Reg.Form.Repository.courseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseService {


         @Autowired
         courseRepo CourseRepo;

        @Autowired
        CourseRegistryRepo courseRegistryRepo;

    public  List<Course> availableCourses() {
      return CourseRepo.findAll();

    }


    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {

        CourseRegistry courseReg=new CourseRegistry (name,emailId,courseName);

        courseRegistryRepo.save(courseReg);

    }
}
