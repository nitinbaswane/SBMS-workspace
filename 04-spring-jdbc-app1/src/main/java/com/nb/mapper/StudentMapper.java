package com.nb.mapper;

import com.nb.dto.Student;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper {
    @Nullable
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student s=new Student();
        s.setId(rs.getInt("id"));
        s.setName(rs.getString("name"));
        s.setCity(rs.getString("city"));
        return s;
    }
}
