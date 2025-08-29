package com.codejega.Course.Reg.Form.Repository;

import com.codejega.Course.Reg.Form.Model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {
}
