package com.example.test.JDBCC;


import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate implements StudentDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
        String SQL = "CREATE TABLE Student( " +
                "ID   INT NOT NULL AUTO_INCREMENT, " +
                "NAME VARCHAR(20) NOT NULL, " +
                "AGE  INT NOT NULL, " +
                "PRIMARY KEY (ID));";

        jdbcTemplateObject.execute( SQL );
    }

    @Override
    public void create(String name, Integer age) {

        String SQL = "insert into Student (name, age) values (?, ?)";
        jdbcTemplateObject.update(SQL, name, age);
        System.out.println("Created => name: "+name+", age: "+age);
        return;
    }

    @Override
    public Student getStudent(Integer id) {
        String SQL = "select * from Student where id = ?";
        Student student = jdbcTemplateObject.queryForObject(SQL,
                new Object[]{id}, new StudentMapper());
        return student;
    }

    @Override
    public List<Student> listStudent() {
        String SQL = "select * from Student";
        List<Student> list = jdbcTemplateObject.query(SQL, new StudentMapper());
        return list;
    }

    @Override
    public void delete(Integer id) {
        String SQL = "delete from Student where id = ?";
        jdbcTemplateObject.update(SQL,id);
        System.out.println("deleted object with id: "+id);
        return;
    }

    @Override
    public void update(Integer id, Integer age) {
        String SQL = "update Student set age = ? where id = ?";
        jdbcTemplateObject.update(SQL,age, id);
        System.out.println("updated record with id: "+id);
    }
}