package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.ForgotPassword;
public class ForgotPasswordStepDEf {

    ForgotPassword forgotPassword=new ForgotPassword();

    @Given("user click on login button")
    public void clickOnLoginButton() throws InterruptedException {
        Thread.sleep(3000);
        forgotPassword.navigateToLogin().click();
    }

    @And("user clicks on ForgotPassword button")
    public void clickOnForgotPasswordButton()
    {
        forgotPassword.forgotPasswordButton().click();

    }

    @When("user enters his valid email")
    public void enterValidEmail()
    {
        forgotPassword.emailToresetPassword().sendKeys("Fofa12@example.com");
    }

    @And("user clicks on Recover button")
    public void clickOnRecoverEmail()
    {
        forgotPassword.submitRecoverEmail().click();
    }
    @Then("success message appears to notify the user that all details are sent to his email address")
    public void emailDetails()
    {
        String actualResult=forgotPassword.getRecoverMessage().getText();
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(actualResult,"Email with instructions has been sent to you.");
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/passwordrecovery"));
        soft.assertAll();
    }
}
