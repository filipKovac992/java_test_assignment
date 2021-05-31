import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {


    protected WebDriver driver;

    public WebDriver setDriver(String browserName) {
        switch (browserName) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("http://localhost:3000/student");
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.get("http://localhost:3000/student");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + browserName);
        }
        return null;

    }

    @BeforeEach
    public void setUp() {
        setDriver(System.getProperty("browserName"));
    }

//
//    @BeforeEach
//
//    public void setDriver() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://localhost:3000/student");
//    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
