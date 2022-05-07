package pages;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class SelectDifferentTags {

    public WebElement selectADbutt()
    {
        return Hooks.driver.findElement(By.id("advs"));
    }
    public WebElement selectCategoryButt()
    {
        return Hooks.driver.findElement(By.id("cid"));
    }
    public WebElement SIDButton()
    {
        return Hooks.driver.findElement(By.id("sid"));
    }
    public WebElement clickOnSubmitButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[type=\"submit\"]"));
    }

    public WebElement clickonShoesTag()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/shoes-2\"]"));
    }
    public WebElement successMessageTag()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }
    public WebElement AwesomeTag()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/awesome\"]"));
    }

}
