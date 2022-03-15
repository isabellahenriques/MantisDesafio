package desafio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordPage {
    private WebDriver driver;
    private By passwordField = By.id("password");
    private By clickButtonEntrar = By.xpath("//input[@type='submit']");

    public PasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setPassword(String password) {
        driver.findElement(passwordField ).sendKeys(password);
    }

    public void clickButtonEntrar() {
        driver.findElement(clickButtonEntrar).click();
    }


}
