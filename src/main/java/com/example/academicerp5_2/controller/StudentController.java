package com.example.academicerp5_2.controller;


import com.example.academicerp5_2.bean.Course;
import com.example.academicerp5_2.bean.Specialization;
import com.example.academicerp5_2.bean.Student;
import com.example.academicerp5_2.service.CourseService;
import com.example.academicerp5_2.service.StudentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Path("students")
public class StudentController {
    StudentService studentService = new StudentService();

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response loginStudent(Student student) throws URISyntaxException {
        Student result = StudentService.getStudentByID(student);
        if(result == null){
            return Response.noContent().build();
        }

        return Response.ok().entity(result).build();
    }
    @GET
    @Path("/passed")
    @Produces(MediaType.APPLICATION_JSON)
    public Response passedcourses(Student student) throws URISyntaxException {
        Student result = StudentService.getPassedCourses(student);
        if(result == null){
            return Response.noContent().build();
        }

        return Response.ok().entity(result).build();
    }

    @GET
    @Path("/updatedspecailisation")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updatedStudentSpecailization(Student student,Specialization specialization)  {
        StudentService.updateStudentSpecialization(student,specialization);
        return Response.ok().build();
    }
    @GET
    @Path("/getspecailisation")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudentSpecialization(Student student) throws URISyntaxException {
        Specialization result = StudentService.getStudentSpecialization(student);
        if(result == null){
            return Response.noContent().build();
        }

        return Response.ok().entity(result).build();
    }

}

