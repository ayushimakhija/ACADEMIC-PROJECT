package com.example.academicerp5_2.utils;

import com.example.academicerp5_2.bean.Employee;
import com.example.academicerp5_2.bean.Student;
import com.example.academicerp5_2.dao.EmployeeDao;
import com.example.academicerp5_2.dao.StudentDao;
import com.example.academicerp5_2.dao.implementation.EmployeeDaoImpl;
import com.example.academicerp5_2.dao.implementation.StudentDaoImpl;

public class AddingData {
    public static void main(String[] args) {
        Employee employee1 = new Employee("mvn@iiitb.org", "murli", null, "professor", "academics");
        Employee employee2 = new Employee("bt@iiitb.org", "Thangaraju", null, "professor", "academics");
        Employee employee3 = new Employee("rc@iiitb.org", "Chandrashekar", null, "professor", "academics");
        EmployeeDao employeeDao =  new EmployeeDaoImpl();
        employeeDao.registerEmployee(employee1);
        employeeDao.registerEmployee(employee2);
        employeeDao.registerEmployee(employee3);

        Student student1 = new Student("MT2020001", "ck@iiitb.org", "clark", "kent");
        Student student2 = new Student("MT2020002", "bw@iiitb.org", "bruce", "wayne");
        Student student3 = new Student("MT2020003", "ba@iiitb.org", "barry", "allen");

        StudentDao studentDao = new StudentDaoImpl();
        studentDao.studentRegister(student1);
        studentDao.studentRegister(student2);
        studentDao.studentRegister(student3);




    }
}
