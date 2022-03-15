package desafio.tests;

import desafio.bases.BaseTests;
import org.testng.annotations.Test;


public class LoginTests extends BaseTests {
    @Test
    public void testeLoginEsenhaCorreto(){
        loginPage.setUsername("administrator");
        loginPage.clickButton();
        passwordPage.setPassword("DB2SWD");
        passwordPage.clickButtonEntrar();
    }

    @Test
    public void testeLoginEsenhaErrado(){
        loginPage.setUsername("Adm");
        loginPage.clickButton();
        passwordPage.setPassword("DB2SWD2");
        passwordPage.clickButtonEntrar();
    }

    @Test
    public void testeLoginCorretoeSenhaErrada(){
        loginPage.setUsername("administrator");
        loginPage.clickButton();
        passwordPage.setPassword("DB2SWD2");
        passwordPage.clickButtonEntrar();
    }

    @Test
    public void testeLoginErradoeSenhaCorreto(){
        loginPage.setUsername("Adm");
        loginPage.clickButton();
        passwordPage.setPassword("DB2SWD");
        passwordPage.clickButtonEntrar();
    }

    @Test
    public void testeLoginEmBranco(){
        loginPage.setUsername("");
        loginPage.clickButton();
    }

    @Test
    public void testeLoginCorretoSenhaEmBranco(){
        loginPage.setUsername("administrator");
        loginPage.clickButton();
        passwordPage.setPassword("");
        passwordPage.clickButtonEntrar();
    }

}
