
import Resources.StudentsPage;

import datacontainers.StudentDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStudent extends TestBase {

       @Test
        public void createStudent () {
           StudentDTO student = new StudentDTO("First", "Student", "Acc name", "firststudnet@test.com", "05222021");
            StudentsPage studentsPage = new StudentsPage(driver);
            studentsPage = studentsPage.createStudent(student);
            Assertions.assertEquals(student.getEmail(), studentsPage.getEmail());
        }

        @Test
        public void updateStudent ()  {
            StudentsPage addStudent = new StudentsPage(driver);
            addStudent.updateStudent();
        }


    }

