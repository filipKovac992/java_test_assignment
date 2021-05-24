package Resources;

import datacontainers.StudentDTO;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class StudentsPage {

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

    public StudentsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public StudentsPage createStudent(StudentDTO student) {
        waitForElementToAppear(addStudentButton).click();
        waitForElementToAppear(studentNameField).sendKeys(student.getName());
        waitForElementToAppear(studentSurnameField).sendKeys(student.getSurname());
        waitForElementToAppear(accountNameField).sendKeys(student.getAccountName());
        waitForElementToAppear(emailField).sendKeys(student.getEmail());
        waitForElementToAppear(cardNumberField).sendKeys(student.getBankCardNumber());
        waitForElementToAppear(saveButton).click();
        return new StudentsPage(driver);
    }

    public void updateStudent() {
        waitForElementToAppear(userName).click();
        waitForElementToAppear(studentNameField).sendKeys("Updated");
        waitForElementToAppear(studentSurnameField).sendKeys("Name");
        waitForElementToAppear(emailField).sendKeys(Keys.CONTROL + "a");
        waitForElementToAppear(emailField).sendKeys(Keys.DELETE);
        waitForElementToAppear(emailField).sendKeys("updatedstudent@test.com");
        waitForElementToAppear(saveButtonUpdated).click();
    }

    public String getEmail() {
        return waitForElementToAppear(emailField).getText();
    }

    private WebElement waitForElementToAppear(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
