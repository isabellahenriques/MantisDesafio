package desafio.tests;

import desafio.bases.BaseTests;
import desafio.pages.LoginPage;
import desafio.pages.PasswordPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTests extends BaseTests {

    LoginPage loginPage = new LoginPage();
    PasswordPage passwordPage = new PasswordPage();

    @Test
    public void testeLoginEsenhaCorreto(){
        loginPage.setUsername("administrator");
        loginPage.clickButtonEntrar();
        passwordPage.setPassword("DB2SWD");
        passwordPage.setClickButtonEntrarPassword();
    }

    @Test
    public void testeLoginEsenhaErrado(){
        loginPage.setUsername("Adm");
        loginPage.clickButtonEntrar();
        passwordPage.setPassword("DB2SWD2");
        passwordPage.setClickButtonEntrarPassword();

        Assert.assertEquals("Sua conta pode estar desativada ou bloqueada ou o " +
                        "nome de usuário e a senha que você digitou não estão corretos."
                ,passwordPage.getText("/html/body/div/div/div/div/div/div[4]/p"));
    }

    @Test
    public void testeLoginCorretoeSenhaErrada(){
        loginPage.setUsername("administrator");
        loginPage.clickButtonEntrar();
        passwordPage.setPassword("DB2SWD2");
        passwordPage.setClickButtonEntrarPassword();

        Assert.assertEquals("Sua conta pode estar desativada ou bloqueada ou o " +
                        "nome de usuário e a senha que você digitou não estão corretos."
                ,passwordPage.getText("/html/body/div/div/div/div/div/div[4]/p"));
    }

    @Test
    public void testeLoginErradoeSenhaCorreto(){
        loginPage.setUsername("Adm");
        loginPage.clickButtonEntrar();
        passwordPage.setPassword("DB2SWD");
        passwordPage.setClickButtonEntrarPassword();

        Assert.assertEquals("Sua conta pode estar desativada ou bloqueada ou o " +
                        "nome de usuário e a senha que você digitou não estão corretos."
                ,passwordPage.getText("/html/body/div/div/div/div/div/div[4]/p"));
    }

    @Test
    public void testeLoginEmBranco(){
        loginPage.setUsername("");
        loginPage.clickButtonEntrar();

        Assert.assertEquals("Sua conta pode estar desativada ou bloqueada ou o " +
                        "nome de usuário e a senha que você digitou não estão corretos."
                ,passwordPage.getText("/html/body/div/div/div/div/div/div[4]/p"));
    }

    @Test
    public void testeLoginCorretoSenhaEmBranco(){
        loginPage.setUsername("administrator");
        loginPage.clickButtonEntrar();
        passwordPage.setPassword("");
        passwordPage.setClickButtonEntrarPassword();

        Assert.assertEquals("Sua conta pode estar desativada ou bloqueada ou o " +
                        "nome de usuário e a senha que você digitou não estão corretos."
                ,passwordPage.getText("/html/body/div/div/div/div/div/div[4]/p"));
    }


}
