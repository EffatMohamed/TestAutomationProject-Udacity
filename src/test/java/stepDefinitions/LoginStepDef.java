package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.Login;
public class LoginStepDef {

    Login login=new Login();

    @Given("user go to login page")
    public void go_to_login_page() throws InterruptedException {

        Thread.sleep(3000);
       login.loginBttMethod().click();
    }

    @When("user login with valid username and password")
    public void valid_username_password()
    {
        login.emailMethod().sendKeys("Fofa12@example.com");
        login.passwordMethod().sendKeys("123456");
    }

    @And("user press on login button")
    public void login_button()
    {
        login.signInMethod().click();
    }

    @Then("user login to the system successfully")
    public void success_login() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(login.logoutButton().isDisplayed());
        soft.assertAll();
    }
}
