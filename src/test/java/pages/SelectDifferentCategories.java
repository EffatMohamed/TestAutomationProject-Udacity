package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class SelectDifferentCategories {

    public WebElement selectElectronicsElement()
    {
        return Hooks.driver.findElement(By.partialLinkText("Electronics"));
    }

    public WebElement selectCameraAndPhotoElemnt()
    {
        return Hooks.driver.findElement(By.partialLinkText("Camera & photo"));
    }
    public WebElement displayAddToCartButt()
    {
        return Hooks.driver.findElement(By.className("product-box-add-to-cart-button"));
    }
    public WebElement selectJewelryButtMethod()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/jewelry\"]"));
    }

}
