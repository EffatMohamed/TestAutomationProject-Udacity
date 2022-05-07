package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class AddDifferentProductsToShoppingCart {

    public WebElement ClickOnClothingSubCategory()
    {
        return Hooks.driver.findElement(By.cssSelector("a[title=\"Show products in category Clothing\"]"));
    }
    public WebElement selectATshirt()
    {
        return Hooks.driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000059_custom-t-shirt_415.jpeg\"]"));
    }
    public WebElement fillReqText()
    {
        return Hooks.driver.findElement(By.cssSelector("input[name=\"product_attribute_12\"]"));
    }
    public WebElement addTheTshirtToTheCart()
    {
        return Hooks.driver.findElement(By.cssSelector("button[data-productid=\"29\"]"));
    }
    public WebElement clickOnDDownloads()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/digital-downloads\"]"));
    }
    public WebElement clickOnDDPhoto()
    {
        return Hooks.driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000066_if-you-wait-donation_415.jpeg\"]"));
    }
    public WebElement addDDphotoCart()
    {
        return Hooks.driver.findElement(By.cssSelector("button[data-productid=\"35\"]"));
    }
    public WebElement clickOnSCartButton()
    {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"cart-label\"]"));
    }
    public WebElement updateQTY()
    {
        return Hooks.driver.findElement(By.xpath("//td[@class=\"quantity\"]/input[@class=\"qty-input\"]"));

    }
    public WebElement rmvItem()
    {
        return Hooks.driver.findElement(By.xpath("(//td[@class=\"remove-from-cart\"])[2]"));

    }
    public WebElement confirmUpdateCart()
    {
        return Hooks.driver.findElement(By.id("updatecart"));
    }




}
