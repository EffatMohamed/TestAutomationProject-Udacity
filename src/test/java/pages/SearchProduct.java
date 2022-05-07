package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

import java.util.List;

public class SearchProduct {
    public WebElement ClickSearchButton()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchForCertainElement()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement submitSearchItem()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    public List<WebElement> quantity()
    {
        return Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a"));
    }

}
