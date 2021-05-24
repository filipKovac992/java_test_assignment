
import Resources.Driver;
import Resources.Students;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestStudent {

    WebDriver driver;

    @BeforeEach
    public void setDriver() {
        driver = new FirefoxDriver();
        driver.get("http://localhost:3000/student");
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

       @Test
        public void createStudent () {
            Students addStudent = new Students(driver);
            addStudent.createStudent();
        }

        @Test
        public void updateStudent () throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            Students addStudent = new Students(driver);
            addStudent.updateStudent();
        }


    }

