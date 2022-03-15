import base.BaseTests;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

    @Test
    public void testeLoginEsenhaCorreto(){
        loginPage.setUsername("administrator");
        loginPage.clickButton();
        passwordPage.setPassword("DB2SWD");
        passwordPage.clickButtonEntrar();
    }
}
