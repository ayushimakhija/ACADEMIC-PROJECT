package com.example.academicerp5_2.service;

import com.example.academicerp5_2.bean.Specialization;
import com.example.academicerp5_2.bean.Student;
import com.example.academicerp5_2.dao.StudentDao;
import com.example.academicerp5_2.dao.implementation.StudentDaoImpl;

public class StudentService {
    private static StudentDao studentDao = new StudentDaoImpl();
    //static StudentDao studentDao = new StudentDaoImpl();

    public static Student getPassedCourses(Student student) {
        return (Student) studentDao.getPassedCourses(student);
    }

    public static Student getStudentByID(Student student){
        return studentDao.getStudentByID(student);
    }

    public static void updateStudentSpecialization(Student student, Specialization specialization) {
         studentDao.updateStudentSpecialization(student,specialization);
        //return student;
    }

    public static Specialization getStudentSpecialization(Student student) {
        return studentDao.getStudentSpecialization(student);
    }
}
