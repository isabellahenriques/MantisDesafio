import base.BaseTests;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

    @Test
    public void testLogin(){
        loginPage.setUsername("administrator");
        loginPage.clickButton();
        passwordPage.setPassword("DB2SWD");
        passwordPage.clickButtonEntrar();
    }

}
