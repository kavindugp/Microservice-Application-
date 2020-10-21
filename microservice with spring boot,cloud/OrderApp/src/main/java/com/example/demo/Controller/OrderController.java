package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Model.Course;

@RestController
public class OrderController {

	@GetMapping("/")
	public String testRestClient() {
		
		String CourseUrl="http://localhost:8080/";
		RestTemplate restTemplate=new RestTemplate();
		String msg= restTemplate.getForObject(CourseUrl, String.class);
		return msg + " with Order ";
	}
	
	@GetMapping("/Course")
	public String getAllCourses() {
	
		String CourseUrl="http://localhost:8080/courses/";
		RestTemplate restTemplate=new RestTemplate();
		
		String course=restTemplate.getForObject(CourseUrl, String.class);
		
		return course;
				
	}
	//////////////////////////////////////////////////////////////////////

//	@GetMapping("/courseList")
//	public Course getCourseList() {
//		String url="http://localhost:8080/courses/";
//		RestTemplate restTemplate=new RestTemplate();
//		Course course=restTemplate.getForObject(url, Course.class);
//		return course;
//	}
//
	@GetMapping("/CourseList")
	public Course getAllCourse() {
	
		String CourseUrl="http://localhost:8080/courses/";
		RestTemplate restTemplate=new RestTemplate();
		
		Course course=restTemplate.getForObject(CourseUrl, Course.class);
		
		return course;
				
	}
	
	//////////////////////////////////////////////////////////////////////
	
	@GetMapping("/Course/{id}")
	public Course getCourseObject(@PathVariable int id) {
	
		String CourseUrl="http://localhost:8080/courses/"+id;
		RestTemplate restTemplate=new RestTemplate();
		
		Course course=restTemplate.getForObject(CourseUrl, Course.class);
		
		return course;
				
	}
	
	@GetMapping("/CourseAuthor/{id}")
	public String getCourseAuthor(@PathVariable int id) {
	
		String CourseUrl="http://localhost:8080/courses/"+id;
		RestTemplate restTemplate=new RestTemplate();
		
		Course course=restTemplate.getForObject(CourseUrl, Course.class);
		
		return course.getAuthorname();
				
	}
	
	@GetMapping("/CourseName/{id}")
	public String getCourseName(@PathVariable int id) {
	
		String CourseUrl="http://localhost:8080/courses/"+id;
		RestTemplate restTemplate=new RestTemplate();
		
		Course course=restTemplate.getForObject(CourseUrl, Course.class);
		
		return course.getCoursename();
				
	}
}
