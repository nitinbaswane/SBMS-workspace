package com.nb;

import com.nb.config.AppConfig;
import com.nb.dao.StudentDao;
import com.nb.dto.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentDao dao = context.getBean(StudentDao.class);

//        Student student = new Student();
//        student.setId(2);
//        student.setName("sharan");
//        student.setCity("pune");
//
//
//        System.out.println( dao.saveStudent(student));

        List<Student> allStudent = dao.findAllStudent();
        allStudent.forEach(System.out::println);
    }
}