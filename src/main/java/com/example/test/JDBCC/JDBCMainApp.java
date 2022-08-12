package com.example.test.JDBCC;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
@SpringBootApplication
public class JDBCMainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("JDBCBean.xml");

        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

        System.out.println("\n|--        Record Creation     --|");
        studentJDBCTemplate.create("Ocer",25);
        studentJDBCTemplate.create("Core",24);
        studentJDBCTemplate.create("Orca",26);
        studentJDBCTemplate.create("Erco",24);

        System.out.println("\n|--  Listing multiple records  --|");
        List<Student> studentList = studentJDBCTemplate.listStudent();
        for(Student s: studentList){
            System.out.println("["
                    +"ID: "+s.getId()
                    +", Name: "+s.getName()
                    +", Age: "+s.getAge()
                    +"]");
        }
        System.out.println("\n|-- Updating record with ID: 2 --|");
        studentJDBCTemplate.update(2,30);

        System.out.println("\n|-- Listng student with ID: 2  --|");
        Student student = studentJDBCTemplate.getStudent(2);
        System.out.println("["
                +"ID: "+student.getId()
                +", Name: "+student.getName()
                +", Age: "+student.getAge()
                +"]");
    }
}
