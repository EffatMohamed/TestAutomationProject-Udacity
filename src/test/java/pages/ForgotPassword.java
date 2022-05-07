package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class ForgotPassword {

    public WebElement navigateToLogin()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    public WebElement forgotPasswordButton()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    }

    public WebElement emailToresetPassword()
    {
        return Hooks.driver.findElement(By.cssSelector("input[data-val-email=\"Wrong email\"]"));
    }

    public WebElement submitRecoverEmail()
    {
        return Hooks.driver.findElement(By.name("send-email"));
    }

    public WebElement getRecoverMessage()
    {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }
}
