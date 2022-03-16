package desafio.bases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static desafio.bases.DriverFactory.getDriver;


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
