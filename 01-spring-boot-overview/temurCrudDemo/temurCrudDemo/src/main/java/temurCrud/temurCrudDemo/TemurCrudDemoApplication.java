package temurCrud.temurCrudDemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import temurCrud.temurCrudDemo.dao.StudentDAO;
import temurCrud.temurCrudDemo.entities.Student;

import java.util.List;

@SpringBootApplication
public class TemurCrudDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemurCrudDemoApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {

        return runner -> {
            // creating one by one student!!!!!!
            // createStudent(studentDAO);

            // creating multiple student!!!!!!!!
            //  createMultipleStudent(studentDAO);

            // reading data by id
            //  readStudent(studentDAO);

            // listing all students
            // queryForStudents(studentDAO);

            // updating student
            // updateStudent(studentDAO);

            // deleting student
            deleteStudent(studentDAO);
        };
    }

    private void deleteStudent(StudentDAO studentDAO) {
        int studentId = 1;
        System.out.println("Getting student by id  " + studentId);
        studentDAO.delete(studentId);

    }

    private void updateStudent(StudentDAO studentDAO) {

        int studentId = 1;
        System.out.println("Getting student by id  " + studentId);
        Student myStudent = studentDAO.findById(studentId);
        // changing firstname to something
        myStudent.setFirstName("Temusha");
        studentDAO.update(myStudent);

        System.out.println("updated student  " + myStudent);
    }

    private void queryForStudents(StudentDAO studentDAO) {

        // get list of students
        List<Student> theStudent = studentDAO.findAll();

        //display students
        for (Student tempStudent  : theStudent){
            System.out.println(tempStudent);
        }
    }

    private void readStudent(StudentDAO studentDAO) {
        // create new student obj
        System.out.println("Creating student objects");
        Student tempStudent = new Student("Gulnoza", "Murtazaeva", "gulnoza@gmail.com");

        // save the student
        studentDAO.save(tempStudent);

        //display the id of student
        int theId = tempStudent.getId();
        System.out.println("Saved student. Generated id:  " + theId);

        //retrieve studnt based on id
        Student myStudent = studentDAO.findById(theId);

        //display the student
        System.out.println("Found the student:  " + myStudent);
    }


    private void createMultipleStudent(StudentDAO studentDAO) {

        // create multiple student
        System.out.println("Creating 3 students objects");
        Student tempStudent1 = new Student("Temur", "Murtazaev", "temur@gmail.com");
        Student tempStudent2 = new Student("Bobur", "Murtazaev", "bobur@gmail.com");
        Student tempStudent3 = new Student("Rene", "Raxmatov", "rene@gmail.com");

        // save them
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);
    }
    private void createStudent(StudentDAO studentDAO) {

        // create the student object
        System.out.println("Creating student objetc");
        Student tempStudent = new Student("Temur", "Murtazaev", "temur@gmail.com");

        //save the student object
        System.out.println("Saving student");
        studentDAO.save(tempStudent);

        // display the id of the saved student
        System.out.println("Saved student. Generated id:  " + tempStudent.getId());


    }
}
