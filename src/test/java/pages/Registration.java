package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class Registration {

    public WebElement registerLinkMethod()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement fillFName()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement fillLName()
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement fillEmailReg()
    {
        return  Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement fillPassword()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement fillConfirmPassword()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement clickSignUpMethod()
    {
        return  Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement logoutButtonMethod()
    {
        return Hooks.driver.findElement(By.className("ico-logout"));
    }
    public WebElement successRegMessage()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

}
