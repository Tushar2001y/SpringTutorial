package com.example.test.JDBCC;
import javax.sql.DataSource;
import java.util.List;

    public interface StudentDAO {
        public void setDataSource(DataSource ds);
        public void create(String name, Integer age);
        public Student getStudent(Integer id);
        public List<Student> listStudent();
        public void delete(Integer id);
        public void update(Integer id, Integer age);
    }
