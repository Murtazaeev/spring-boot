package temurCrud.temurCrudDemo.dao;

import temurCrud.temurCrudDemo.entities.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    void update(Student student);

    void delete(Integer id);
}
