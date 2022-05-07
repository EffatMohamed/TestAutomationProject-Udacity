package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.Registration;

public class RegisterStepDef {
    Registration register=new Registration();

    @Given("user click on register link")
    public void clickOnRegisterLink()
    {
        register.registerLinkMethod().click();
    }

    @When("user fills your personal details with valid data")
    public void fillRegistrationData()
    {

        register.fillFName().sendKeys("Effat");
        register.fillLName().sendKeys("Fofa");
        register.fillEmailReg().sendKeys("Fofa12@example.com");
    }
    @And("user fills your password field with valid data")
    public void fillPassword()
    {
        register.fillPassword().sendKeys("123456");
        register.fillConfirmPassword().sendKeys("123456");
    }


    @And("user clicks on register button")
    public void clickOnRegister()
    {
        register.clickSignUpMethod().click();
    }

    @Then("user could sign up to his home page successfully and success message is displayed")
    public void successMessage()
    {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/registerresult/1?returnUrl=/"));
        soft.assertEquals(register.successRegMessage().isDisplayed(),true);
        register.logoutButtonMethod().click();
        soft.assertAll();

    }


}
