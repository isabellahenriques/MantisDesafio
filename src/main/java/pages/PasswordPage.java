package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordPage {
    private WebDriver driver;
    private By passwordField = By.id("password");
    private By clickButtonEntrar = By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div/form/fieldset/input[3]");

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
