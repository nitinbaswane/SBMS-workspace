package com.nb.main;

import com.nb.config.AppConfig;
import com.nb.dao.TeacherDao;
import com.nb.entity.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        TeacherDao bean = context.getBean(TeacherDao.class);
        Teacher teacher=new Teacher();
        teacher.setId(102L);
        teacher.setName("Rahul");
        teacher.setCity("Latur");

        bean.saveTeacher(teacher);

        List<Teacher> allTeacher = bean.getAllTeacher();
        allTeacher.forEach(System.out::println);
    }
}
