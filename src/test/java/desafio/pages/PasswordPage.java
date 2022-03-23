package desafio.pages;

import org.openqa.selenium.By;

import static desafio.bases.DriverFactory.getDriver;

public class PasswordPage {

    private By passwordField = By.id("password");
    private By clickButtonEntrarPassword = By.xpath("//input[@type='submit']");

    public void setPassword(String password) {
        getDriver().findElement(passwordField ).sendKeys(password);
    }

    public void setClickButtonEntrarPassword() {
        getDriver().findElement(clickButtonEntrarPassword).click();
    }

    public String getText(By by) {
       return getDriver().findElement(by).getText();
    }

    public String getText(String xpath) {
        return getText(By.xpath(xpath));
    }

}
