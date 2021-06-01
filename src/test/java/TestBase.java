import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {


    protected WebDriver driver;

    public void setDriver(String browserName) {
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
                System.out.println("Launching Chrome as the default browser");

        }
    }

    @BeforeEach
    public void setUp() {
        setDriver(System.getProperty("browserName"));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
