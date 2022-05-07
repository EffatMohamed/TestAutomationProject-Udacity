package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.SelectDifferentCategories;
public class SelectDifferentCategoriesStepDef {

    SelectDifferentCategories selectDifferentCategories=new SelectDifferentCategories();

    @Given("user click on the main category: Electronics")
    public void clickOnMainCategory() throws InterruptedException {
        Thread.sleep(3000);
        selectDifferentCategories.selectElectronicsElement().click();
    }

    @When("user select sub-category:Camera & Photo")
    public void clickOnSubCategory() throws InterruptedException {

        Thread.sleep(3000);
        selectDifferentCategories.selectCameraAndPhotoElemnt().click();
    }

    @Then("user navigate to the subcategories page")
    public void navigateToSubCategory() throws InterruptedException {

        Thread.sleep(3000);
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(selectDifferentCategories.displayAddToCartButt().isDisplayed(),true);
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/camera-photo");
        soft.assertAll();
    }
    @And("user select Jewelry section")
    public void selectJewelryButton()
    {
        selectDifferentCategories.selectJewelryButtMethod().click();
    }
    @And("user is able add Jewerly items ti his cart")
    public void goToTheJewelrySection()
    {
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/jewelry");
    }
}
