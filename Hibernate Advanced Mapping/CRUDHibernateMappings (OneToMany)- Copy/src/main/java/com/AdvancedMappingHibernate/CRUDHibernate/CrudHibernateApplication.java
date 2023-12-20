package com.AdvancedMappingHibernate.CRUDHibernate;

import com.AdvancedMappingHibernate.CRUDHibernate.dao.AppDAO;
import com.AdvancedMappingHibernate.CRUDHibernate.entity.Course;
import com.AdvancedMappingHibernate.CRUDHibernate.entity.Instructor;
import com.AdvancedMappingHibernate.CRUDHibernate.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudHibernateApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO) {
        return runner -> {
//            createInstructor(appDAO);
//            findInstructor(appDAO);
//            deleteInstructor(appDAO);
//            createInstructorWithCourses(appDAO);
//            findInstructorWithCourses(appDAO);
//            findCoursesForInstructor(appDAO);
//            findInstructorWithCoursesJoinFetch(appDAO);
//            updateInstructor(appDAO);
//            deleteInstructor(appDAO);
//            deletingCourse(appDAO);

        };

    }

//    private void deletingCourse(AppDAO appDAO) {
//        int theId = 10;
//        System.out.println("Finding course with id number: " + theId);
//        appDAO.deleteCourseById(theId);
//    }

//    private void deleteInstructor(AppDAO appDAO) {
//        int theId = 1;
//        System.out.println("Finding instructor with id number: " + theId);
//        appDAO.deleteInstructor(theId);
//        System.out.println("Done!");
//    }

//    private void updateInstructor(AppDAO appDAO) {
//
//        int theId = 1;
//        System.out.println("Finding instructor with id number: " + theId);
//
//        Instructor tempInstructor = appDAO.findInstructorById(theId);
//        System.out.println("Found an instructor " + tempInstructor);
//        tempInstructor.setLastName("Chad");
//        appDAO.update(tempInstructor);
//        System.out.println("updated instructor " + tempInstructor);
//
//
//    }

//    private void findInstructorWithCoursesJoinFetch(AppDAO appDAO) {
//
//        int theId = 1;
//        System.out.println("Finding instructor id: " + theId  );
//        Instructor tempInstructor = appDAO.findInstructorByIdJoinFetch(theId);
//        System.out.println("tempInstructor: " + tempInstructor);
//        System.out.println("tempInstructor courses: " + tempInstructor.getCourses());
//    }

//    private void findCoursesForInstructor(AppDAO appDAO) {
//
//        int theId = 1;
//        System.out.println("finding instructor with id number  " + theId);
//
//        Instructor tempInstructor = appDAO.findInstructorById(theId);
//
//        System.out.println("tempInstructor: " + tempInstructor);
//
//        List<Course> courses = appDAO.findCoursesByInstructorId(theId);
//
//        tempInstructor.setCourses(courses);
//
//        System.out.println(tempInstructor.getCourses());
//
//    }

//    private void findInstructorWithCourses(AppDAO appDAO) {
//
//        int theId = 1;
//        System.out.println("finding instructor with id number  " + theId);
//
//        Instructor tempInstructor = appDAO.findInstructorById(theId);
//
//        System.out.println("tempInstructor: " + tempInstructor);
//        System.out.println("and associated courses are " + tempInstructor.getCourses());
//    }

//    private void createInstructorWithCourses(AppDAO appDAO) {
//
//        Instructor tempInstructor = new Instructor("Rizo", "Orzu", "orzu@gmail.com");
//
//        InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.orzu.com/youtube", "love to shit");
//
//        tempInstructor.setInstructorDetail(tempInstructorDetail);
//
//        Course tempCourse1 = new Course("shitting course xdd (sorry bro!)");
//        Course tempCourse2 = new Course("billiard course (6:0)");
//
//        tempInstructor.add(tempCourse1);
//        tempInstructor.add(tempCourse2);
//
//        System.out.println("Saving course to the db  " + tempInstructor);
//        appDAO.save(tempInstructor);
//
//    }


//    public void findInstructor(AppDAO appDAO) {
//        int theId = 1;
//        System.out.println("Finding instructor  " + theId);
//
//        Instructor tempInstructor = appDAO.findInstructorById(theId);
//
//        System.out.println("tempInstructor " + tempInstructor);
//
//    }

//    public void deleteInstructor(AppDAO appDAO) {
//        int theId = 2;
//        System.out.println("Finding Instructor with id:    " + theId);
//        appDAO.deleteInstructorById(theId);
//        System.out.println("Done");
//    }

//    private void createInstructor(AppDAO appDAO) {
//
////        Instructor tempInstructor = new Instructor("Temur", "Murtazaev", "temur@gmail.com");
////
////        InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.lifeshots.com/youtube", "love to eat");
//
//
//        Instructor tempInstructor = new Instructor("Bobur", "Rasulov", "bobur@gmail.com");
//
//        InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.Boburitto.com/youtube", "love to code");
//
//
//        tempInstructor.setInstructorDetail(tempInstructorDetail);
//
//        System.out.println("saving the instructor: " + tempInstructor);
//
//        appDAO.save(tempInstructor);
//
//    }

}
