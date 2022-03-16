package desafio.bases;

import desafio.pages.DriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static desafio.pages.DriverFactory.getDriver;


public class BaseTests {

    @BeforeMethod
    public void setUp() {
        getDriver().navigate().to("http://127.0.0.1:8989");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.killDriver();
    }
}
