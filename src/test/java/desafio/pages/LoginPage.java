package desafio.pages;

import org.openqa.selenium.By;
import static desafio.bases.DriverFactory.getDriver;

public class LoginPage {

    private By usernameField = By.id("username");
    private By clickButtonEntrar = By.xpath("//input[@type='submit']");

    public void setUsername(String username) {
        getDriver().findElement(usernameField).sendKeys(username);
    }

    public void clickButtonEntrar() {
        getDriver().findElement(clickButtonEntrar).click();
    }
}