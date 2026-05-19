package com.nb.dao;

import com.nb.entity.Teacher;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TeacherDao {

    @Autowired
   private HibernateTemplate hibernateTemplate;

    @Transactional
   public void saveTeacher(Teacher teacher){
    hibernateTemplate.save(teacher);
   }

   public List<Teacher> getAllTeacher(){
       return hibernateTemplate.loadAll(Teacher.class);
   }

}
