package com.dzzxjl.dao;

/**
 * Created by dzzxjl on 2017/7/17.
 */
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dzzxjl.model.Student;
import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getInt("age"));
        return student;
    }
}
