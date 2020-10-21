package com.futureX.CourseApp.Controller;

import com.futureX.CourseApp.Model.Course;
import com.futureX.CourseApp.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseRepo repository;

    @GetMapping("/")
    public String getCourseAppHome(){
        return "get COURSE APP home";
    }

    @GetMapping("/courses")
    public List<Course> getCourse(){
        return repository.findAll();
    }

    @PostMapping("/courses")
    public Course SaveCourse(@RequestBody Course course){
        return repository.save(course);
    }

    @PutMapping("/courses")
    public Course EditCourse(@RequestBody Course course){
        return repository.save(course);
    }

    @GetMapping("/courses/{id}")
    public Optional<Course> getCourseById(@PathVariable BigInteger id){
        return repository.findById(id);
    }

    @DeleteMapping("/courses/{id}")
    public List<Course> deleteCourse(@PathVariable BigInteger id){
        repository.deleteById(id);
        return repository.findAll();
    }

}
