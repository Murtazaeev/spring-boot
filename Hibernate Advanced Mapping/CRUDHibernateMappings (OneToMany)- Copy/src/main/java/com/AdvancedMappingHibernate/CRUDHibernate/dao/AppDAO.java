package com.AdvancedMappingHibernate.CRUDHibernate.dao;

import com.AdvancedMappingHibernate.CRUDHibernate.entity.Course;
import com.AdvancedMappingHibernate.CRUDHibernate.entity.Instructor;

import java.util.List;

public interface AppDAO {
    void createCourse(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);
    List<Course> findCoursesByInstructorId(int theId);

    Instructor findInstructorByIdJoinFetch(int theId);

    void update(Instructor tempInstructor);

    void deleteInstructor(int theId);

    void deleteCourseById(int theId);

    void createCourse(Course theCourse);

    Course findCourseById(int theId);
}
