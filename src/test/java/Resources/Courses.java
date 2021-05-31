package Resources;

import com.mysql.cj.jdbc.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Courses {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/nav/a[3]")
    WebElement courseButton;

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
        waitForElementToAppear(courseButton).click();
        addCourseButton.click();
        courseName.sendKeys("Test Course");
        classCost.sendKeys("100");
        classPerWeek.sendKeys("3");
        saveButton.click();

    }
    private WebElement waitForElementToAppear(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }


}
