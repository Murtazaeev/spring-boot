package com.AdvancedMappingHibernate.CRUDHibernate;

import com.AdvancedMappingHibernate.CRUDHibernate.dao.AppDAO;
import com.AdvancedMappingHibernate.CRUDHibernate.entity.Instructor;
import com.AdvancedMappingHibernate.CRUDHibernate.entity.InstructorDetail;
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
//            createInstructor(appDAO);
//            findInstructor(appDAO);
            deleteInstructor(appDAO);
        };
    }


//    public void findInstructor(AppDAO appDAO) {
//        int theId = 1;
//        System.out.println("Finding instructor  " + theId);
//
//        Instructor tempInstructor = appDAO.findInstructorById(theId);
//
//        System.out.println("tempInstructor " + tempInstructor);
//
//    }

    public void deleteInstructor(AppDAO appDAO) {
        int theId = 2;
        System.out.println("Finding Instructor with id:    " + theId);
        appDAO.deleteInstructorById(theId);
        System.out.println("Done");
    }

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
