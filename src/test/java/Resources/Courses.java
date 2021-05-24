package Resources;

import com.mysql.cj.jdbc.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Courses {

    WebDriver driver;

    @FindBy(css = "#root > div > main > div.makeStyles-mainContent-4 > button")
    WebElement addCourseButton;

    @FindBy(name = "developerCourseName")
    WebElement courseName;

    @FindBy(name = "costPerClass")
    WebElement classCost;

    @FindBy(name = "classesPerWeek")
    WebElement classPerWeek;

    @FindBy(css = "button.MuiButton-root:nth-child(1)")
    WebElement saveButton;

    public Courses(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void CreateCourse() {
        addCourseButton.click();
        courseName.sendKeys("Test Course");
        classCost.sendKeys("100");
        classPerWeek.sendKeys("3");
        saveButton.click();

    }


}
