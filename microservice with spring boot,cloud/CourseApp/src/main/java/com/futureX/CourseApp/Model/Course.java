package com.futureX.CourseApp.Model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "course")
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger courseid;
    private String coursename;
    private String authorname;

    public Course() {
    }

    public Course(BigInteger courseid, String coursename, String authorname) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.authorname = authorname;
    }

    public BigInteger getCourseid() {
        return courseid;
    }

    public void setCourseid(BigInteger courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }
}
