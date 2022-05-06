package com.springdemo.mvc;

import com.springdemo.mvc.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {

    @NotNull(message = "is required")
    @Min(value = 0,message = "minimum 0")
    @Max(value = 10, message = "max 10")
    private String freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "only 5 chars")
    private String postalCode;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    private String firstName;


    @NotNull(message = "is required")
    @Size(min=1,message="is required")
    private String lastName;

    @CourseCode
    private String courseCode;


    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public  String getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(String freePasses) {
        this.freePasses = freePasses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}