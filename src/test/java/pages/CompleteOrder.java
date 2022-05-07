package pages;

import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class CompleteOrder {
    public WebElement acceptTermsConditions()
    {

        return Hooks.driver.findElement(By.xpath("//div/input[@ id=\"termsofservice\"]"));
    }
    public WebElement CHECKoutBtt()
    {
        return Hooks.driver.findElement(By.xpath("//div/button[@id=\"checkout\"]"));
    }
    public WebElement Continue()
    {
        return Hooks.driver.findElement(By.xpath("//div/button[@class=\"button-1 new-address-next-step-button\"]"));
    }
    public WebElement selectCountry()
    {
        return Hooks.driver.findElement(By.cssSelector("select[id=\"BillingNewAddress_CountryId\"]"));
    }

    public WebElement selectStatus()
    {
        return Hooks.driver.findElement(By.cssSelector("select[id=\"BillingNewAddress_StateProvinceId\"]"));
    }
    public WebElement EnterCity()
    {

        return Hooks.driver.findElement(By.cssSelector("input[id=\"BillingNewAddress_City\" ]"));
    }
    public WebElement EnterAddress()
    {
        return Hooks.driver.findElement(By.cssSelector("input[id=\"BillingNewAddress_Address1\" ]"));

    }
    public WebElement EnterZIP()
    {
        return Hooks.driver.findElement(By.cssSelector("input[id=\"BillingNewAddress_ZipPostalCode\"]"));
    }

    public WebElement EnterPhoneNumber()
    {
        return Hooks.driver.findElement(By.cssSelector("input[id=\"BillingNewAddress_PhoneNumber\"]"));
    }
    public WebElement ContinueButton()
    {
        return Hooks.driver.findElement(By.xpath("//div/button[@class=\"button-1 new-address-next-step-button\"]"));
    }
    public WebElement FillAddress()
    {
        return Hooks.driver.findElement(By.xpath("//div/button[@class=\"button-1 shipping-method-next-step-button\"]"));
    }
    public WebElement SlectfirstPayment()
    {
        return Hooks.driver.findElement(By.xpath("//div/button[@class=\"button-1 payment-method-next-step-button\"]"));
    }
    public WebElement SlectPaymentInfo()
    {
        return Hooks.driver.findElement(By.xpath("//div/button[@class=\"button-1 payment-info-next-step-button\"]"));
    }

    public WebElement ConfirmOrders()
    {
        return Hooks.driver.findElement(By.xpath("//div/button[@class=\"button-1 confirm-order-next-step-button\"]"));
    }
    public WebElement successMessage()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"section order-completed\"]"));
    }

//    public WebElement estimateShipping()
//    {
//        return Hooks.driver.findElement(By.id("open-estimate-shipping-popup"));
//    }
//    public WebElement SelectCountry()
//    {
//        return Hooks.driver.findElement(By.id("CountryId"));
//    }
//    public WebElement ZIPCode()
//    {
//       return Hooks.driver.findElement(By.id("ZipPostalCode"));
//    }
//    public WebElement APply()
//    {
//        return Hooks.driver.findElement(By.xpath("//div[class=\"apply-shipping-button-container\"] button"));
//    }
}
