package com.AdvancedMappingHibernate.CRUDHibernate;

import com.AdvancedMappingHibernate.CRUDHibernate.dao.AppDAO;
import com.AdvancedMappingHibernate.CRUDHibernate.entity.Course;
import com.AdvancedMappingHibernate.CRUDHibernate.entity.Instructor;
import com.AdvancedMappingHibernate.CRUDHibernate.entity.InstructorDetail;
import com.AdvancedMappingHibernate.CRUDHibernate.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudHibernateApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO) {
        return runner -> {
//            createCourseAndStudents(appDAO);
//            findCourseAndStudents(appDAO);    for doing it reverse, just do it as reverse, simple)))
        };
    }

    private void findCourseAndStudents(AppDAO appDAO) {
        int theId = 10;
        Course tempCourse = appDAO.findCourseAndStudentsByCourseId(theId);

        System.out.println("Loaded courses " + tempCourse);
        System.out.println("students  " + tempCourse.getStudents());


    }

    private void createCourseAndStudents(AppDAO appDAO) {

        Course theCourse = new Course("Udemy React");
        Course theCourse2 = new Course("Udemy Node");
        Student theStudent = new Student("Temur", "Murtazaev", "temur@gmail.com");
        Student theStudent1 = new Student("Aziz", "Azizov", "aziz@gmail.com");
        Student theStudent2 = new Student("Bobur", "Boburov", "bobur@gmail.com");
        Student theStudent3 = new Student("Boxo", "Shox", "boxo@gmail.com");

        theCourse.addStudent(theStudent);
        theCourse.addStudent(theStudent1);
        theCourse2.addStudent(theStudent2);
        theCourse2.addStudent(theStudent3);

        appDAO.createCourse(theCourse);
        appDAO.createCourse(theCourse2);


    }

}
