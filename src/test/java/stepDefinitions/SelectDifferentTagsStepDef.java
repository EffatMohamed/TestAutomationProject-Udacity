package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.SelectDifferentTags;
public class SelectDifferentTagsStepDef {

    SelectDifferentTags adSearch=new SelectDifferentTags();

    @Given("use select advanced search")
    public void selectADButton()
    {
        adSearch.selectADbutt().click();
    }
    @And("user select Apparel Category List")
    public void selectApparelCategory() throws InterruptedException {
        Select select=new Select(adSearch.selectCategoryButt());
        Thread.sleep(3000);
        select.selectByIndex(10);
    }
    @And("user click on search in description")
    public void selctSIDButton()
    {
        adSearch.SIDButton().click();
    }
    @When("user clicks on submit\"search\" button")
    public void clickOnSearchButton()
    {
        adSearch.clickOnSubmitButton().click();
        //click OK on alert Box
        Hooks.driver.switchTo().alert().accept();
    }
    @Then("user is able to click on shoes tag")
    public void viewAllTags() throws InterruptedException {
        Thread.sleep(2000);
        adSearch.clickonShoesTag().click();
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/shoes-2");
        Boolean text=adSearch.successMessageTag().getText().contains("Products tagged with 'shoes'");
        soft.assertTrue(text);
        Thread.sleep(5000);
    }
    @And("user clicks on awesome tag")
    public void clickOnAwesomeTag()
    {
        adSearch.AwesomeTag().click();
        Boolean text=adSearch.successMessageTag().getText().contains("Products tagged with 'awesome'");
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(text);
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/awesome");

    }
}
