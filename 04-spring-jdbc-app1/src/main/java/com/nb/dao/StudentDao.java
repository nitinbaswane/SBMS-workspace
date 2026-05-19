package com.nb.dao;

import com.nb.dto.Student;
import com.nb.mapper.StudentMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {
    private JdbcTemplate jdbcTemplate;
    StudentDao(JdbcTemplate jt){
        this.jdbcTemplate=jt;
    }

    public int saveStudent(Student s){
        String sql="INSERT INTO STUDENT (ID, NAME, CITY) VALUES (?,?,?) ";
        int rowsAffected = jdbcTemplate.update(sql, s.getId(), s.getName(), s.getCity());
    return rowsAffected;
    }

    public List<Student> findAllStudent(){
        String sql="select * from student";
        List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
        return students;
    }
}
