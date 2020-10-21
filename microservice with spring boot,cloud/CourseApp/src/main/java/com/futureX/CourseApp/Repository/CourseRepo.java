package com.futureX.CourseApp.Repository;

import com.futureX.CourseApp.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface CourseRepo extends JpaRepository<Course, BigInteger> {

 //   Optional< Course > findById(Long id);
}
