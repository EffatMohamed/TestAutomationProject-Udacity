package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.SwitchCurrencies;

public class SwitchCurrenciesStepDef {

    SwitchCurrencies swichCurrenices=new SwitchCurrencies();

    @Given("user click on currencies button")
    public void clickOnCurrenctButton()
    {
        swichCurrenices.clickOnCurrencies().click();
    }

    @When("user select Euro")
    public void selectEuro() throws InterruptedException {
        Select select=new Select(swichCurrenices.clickOnCurrencies());
        Thread.sleep(3000);
        //by using the object of Select class,we can select "Euro"
        select.selectByIndex(1);
    }
    @Then("user can see all prices in Euro")
    public void checkCurrency() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(swichCurrenices.getPriceTesxt().getText().contains("€"));
    }
}
