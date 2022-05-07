package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;


public class FilterWIthColor {

     public WebElement ApparelCategory()
     {
          return Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
     }

     public WebElement  ShoesCategory()
     {
       return Hooks.driver.findElement(By.cssSelector("a[title=\"Show products in category Shoes\"]"));
     }

     public WebElement filterItemWithRedColor()
     {
          return Hooks.driver.findElement(By.id("attribute-option-15"));
     }

     public WebElement ClickFirstItem()
     {
          return Hooks.driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000053_adidas-consortium-campus-80s-running-shoes_415.jpg\"]"));
     }
     public WebElement appearanceOfAddToCartElement()
     {
          return Hooks.driver.findElement(By.id("add-to-cart-button-25"));
     }
     public WebElement CheckColors()
     {
          return Hooks.driver.findElement(By.cssSelector("span[style=\"background-color:#663030\"]"));
     }
}
