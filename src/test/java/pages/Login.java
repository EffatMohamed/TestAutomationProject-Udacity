package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class Login {

    public WebElement loginBttMethod()
    {
        WebElement loginElemnet= Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
        return loginElemnet;
    }

    public WebElement emailMethod()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement passwordMethod()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement signInMethod()
    {
        return Hooks.driver.findElement(By.className("login-button"));
    }
    public WebElement logoutButton()
    {
        return Hooks.driver.findElement(By.className("ico-logout"));
    }
}
