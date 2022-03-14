package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.PasswordPage;

public class BaseTests {
    private WebDriver driver;
    protected LoginPage loginPage;
    protected PasswordPage passwordPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver99.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        goHome();
    }

    @BeforeMethod
    public void goHome(){
        driver.get("http://127.0.0.1:8989");
        loginPage = new LoginPage(driver);
        passwordPage = new PasswordPage(driver);

    }

    @AfterClass
    public void tearDown() {
//        driver.quit();
    }

}
