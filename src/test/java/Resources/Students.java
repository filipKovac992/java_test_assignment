package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Students {

    WebDriver driver ;

    @FindBy(className = "MuiFab-label")
    WebElement addStudentButton;

    @FindBy(name = "name")
    WebElement studentNameField;

    @FindBy(name = "surname")
    WebElement studentSurnameField;

    @FindBy(name = "accountName")
    WebElement accountNameField;

    @FindBy(name = "email")
    WebElement emailField;

    @FindBy(name = "bankCardNumber")
    WebElement cardNumberField;

    @FindBy(css = "button.MuiButton-root:nth-child(1) > span:nth-child(1)")
    WebElement saveButton;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div")
    WebElement userName;

    @FindBy(css = ".makeStyles-actions-13 > button:nth-child(1) > span:nth-child(1)")
    WebElement saveButtonUpdated;

    public Students (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createStudent() {
        addStudentButton.click();
        studentNameField.sendKeys("First");
        studentSurnameField.sendKeys("Student");
        accountNameField.sendKeys("First Student");
        emailField.sendKeys("firststudnet@test.com");
        cardNumberField.sendKeys("05222021");
        saveButton.click();
    }

    public void updateStudent() {
        userName.click();
        studentNameField.sendKeys("Updated");
        studentSurnameField.sendKeys("Name");
        emailField.clear();
        emailField.sendKeys("updatedstudent@test.com");
        saveButtonUpdated.click();
    }
}
