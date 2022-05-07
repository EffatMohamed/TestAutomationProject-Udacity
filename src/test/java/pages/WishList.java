package pages;

import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

import java.util.List;

public class WishList {

    public WebElement addfirstItemToWL()
    {
        return Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])[3]"));
    }
    public WebElement addsecondItemToWL()
    {
        return Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])[2]"));
    }
    public WebElement addToWL()
    {
        return Hooks.driver.findElement(By.id("add-to-wishlist-button-4"));
    }
    public WebElement wishlistButton()
    {
        return Hooks.driver.findElement(By.className("wishlist-label"));
    }
    public List<WebElement> getCount()
    {
        return Hooks.driver.findElements(By.cssSelector("input[class=\"qty-input\"]"));
    }
}
