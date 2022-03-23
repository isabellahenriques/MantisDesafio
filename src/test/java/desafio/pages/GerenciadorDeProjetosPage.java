package desafio.pages;

import org.openqa.selenium.By;

import static desafio.bases.DriverFactory.getDriver;

public class GerenciadorDeProjetosPage {
    public String getText(By by) {
        return getDriver().findElement(by).getText();
    }

    public String getText(String xpath) {
        return getText(By.xpath(xpath));
    }
}
