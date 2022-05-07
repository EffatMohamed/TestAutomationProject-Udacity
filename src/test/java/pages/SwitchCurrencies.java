package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class SwitchCurrencies {

    public WebElement clickOnCurrencies()
    {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public WebElement getPriceTesxt()
    {
        return Hooks.driver.findElement(By.className("price"));
    }
}
