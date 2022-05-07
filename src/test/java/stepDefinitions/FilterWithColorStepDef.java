package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.FilterWIthColor;
public class FilterWithColorStepDef {

    FilterWIthColor filterWithColor=new FilterWIthColor();

    @Given("user clicks on Apparel category")
    public void clickOnApparelCategory()
    {
        filterWithColor.ApparelCategory().click();
    }

    @When("user clicks on subcategory shoes")
    public void clickOnShoesSubcategory()
    {
        filterWithColor.ShoesCategory().click();
    }

    @And("user filter with red")
    public void filterRedColor()
    {
        filterWithColor.filterItemWithRedColor().click();
    }

    @And("user click on the first item")
    public void ClickOnFirstItem() throws InterruptedException {
        Thread.sleep(3000);
        filterWithColor.ClickFirstItem().click();
    }
    @Then("user could view the full picture of the red shoes")
    public void viewRedShoes()
    {

        SoftAssert soft=new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"Hooks.driver.getCurrentUrl()");
    }
    @And("user could able to add the red shoes to the cart")
    public void appearcnceOFAddItemsToCart()
    {
        filterWithColor.appearanceOfAddToCartElement().isDisplayed();
    }

    @And("success operation by checking the color element")
    public void checkColor ()
    {
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(filterWithColor.CheckColors().isSelected(),true);
    }
}
