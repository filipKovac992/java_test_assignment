import Resources.Courses;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestCourse {

    WebDriver driver;

    @BeforeEach
    public void setDriver() {
        driver = new FirefoxDriver();
        driver.get("http://localhost:3000/course");
        driver.manage().window().maximize();
    }

        @Test
        public void CreateClass() {
            Courses courses = new Courses(driver);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            courses.CreateCourse();
        }

        @AfterEach
        public void tearDown() {driver.close();}
    }

