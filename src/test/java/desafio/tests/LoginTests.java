package desafio.tests;

import desafio.bases.BaseTests;
import desafio.pages.GerenciadorDeProjetosPage;
import desafio.pages.LoginPage;
import desafio.pages.PasswordPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTests extends BaseTests {

    LoginPage loginPage = new LoginPage();
    PasswordPage passwordPage = new PasswordPage();
    GerenciadorDeProjetosPage gerenciadorDeProjetosPage = new GerenciadorDeProjetosPage();

    @Test
    public void testeLoginEsenhaCorreto(){
        loginPage.setUsername("administrator");
        loginPage.clickButtonEntrar();
        passwordPage.setPassword("DB2SWD");
        passwordPage.setClickButtonEntrarPassword();

        Assert.assertEquals(gerenciadorDeProjetosPage.getText("/html/body/div[2]/div[2]/div[2]/div/div/div[2]"),
                "Crie um projeto para ser capaz de registro de problemas.");
    }

    @Test
    public void testeLoginEsenhaErrado(){
        loginPage.setUsername("Adm");
        loginPage.clickButtonEntrar();
        passwordPage.setPassword("DB2SWD2");
        passwordPage.setClickButtonEntrarPassword();

        Assert.assertEquals(passwordPage.getText("/html/body/div/div/div/div/div/div[4]/p"),
                "Sua conta pode estar desativada ou bloqueada ou o nome de usuário " +
                        "e a senha que você digitou não estão corretos.");
    }

    @Test
    public void testeLoginCorretoeSenhaErrada(){
        loginPage.setUsername("administrator");
        loginPage.clickButtonEntrar();
        passwordPage.setPassword("DB2SWD2");
        passwordPage.setClickButtonEntrarPassword();

        Assert.assertEquals(passwordPage.getText("/html/body/div/div/div/div/div/div[4]/p"),
                "Sua conta pode estar desativada ou bloqueada ou o nome de usuário " +
                        "e a senha que você digitou não estão corretos.");
    }

    @Test
    public void testeLoginErradoeSenhaCorreto(){
        loginPage.setUsername("Adm");
        loginPage.clickButtonEntrar();
        passwordPage.setPassword("DB2SWD");
        passwordPage.setClickButtonEntrarPassword();

        Assert.assertEquals(passwordPage.getText("/html/body/div/div/div/div/div/div[4]/p"),
                "Sua conta pode estar desativada ou bloqueada ou o nome de usuário " +
                        "e a senha que você digitou não estão corretos.");
    }

    @Test
    public void testeLoginEmBranco(){
        loginPage.setUsername("");
        loginPage.clickButtonEntrar();

        Assert.assertEquals(passwordPage.getText("/html/body/div/div/div/div/div/div[4]/p"),
                "Sua conta pode estar desativada ou bloqueada ou o nome de usuário " +
                        "e a senha que você digitou não estão corretos.");
    }

    @Test
    public void testeLoginCorretoSenhaEmBranco(){
        loginPage.setUsername("administrator");
        loginPage.clickButtonEntrar();
        passwordPage.setPassword("");
        passwordPage.setClickButtonEntrarPassword();

        Assert.assertEquals(passwordPage.getText("/html/body/div/div/div/div/div/div[4]/p"),
                "Sua conta pode estar desativada ou bloqueada ou o nome de usuário " +
                        "e a senha que você digitou não estão corretos.");
    }

}
