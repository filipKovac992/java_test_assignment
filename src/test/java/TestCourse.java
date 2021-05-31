import Resources.Courses;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.concurrent.TimeUnit;

public class TestCourse extends TestBase{


        @Test
        public void CreateClass() {
            Courses courses = new Courses(driver);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            courses.CreateCourse();
        }

        @AfterEach
        public void tearDown() {driver.close();}
    }

