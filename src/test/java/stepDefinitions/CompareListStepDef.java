package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.CompareList;
import pages.SearchProduct;
public class CompareListStepDef {
    CompareList comparelist=new CompareList();
    SearchProduct search=new SearchProduct();

    SoftAssert soft=new SoftAssert();

    @When("user add the first product to compare list")
    public void addproducttoCPList() throws InterruptedException {
        Thread.sleep(3000);
        comparelist.addfirstProductToCL().click();
    }


    @Then("success message appears that the product is already added to the compare list")
    public void successMessageOne() throws InterruptedException {
        String expectedResult = "The product has been added to your product comparison";
        String actualResult=comparelist.successMessageCL().getText();

        Thread.sleep(3000);
    }


    @And("user add the second product to compare list")
    public void addsecondProducttoCL() throws InterruptedException {
        Thread.sleep(3000);
        search.searchForCertainElement().clear();
        search.searchForCertainElement().click();
        search.searchForCertainElement().sendKeys("T-shirt");
        search.submitSearchItem().click();
        Thread.sleep(3000);
        comparelist.addsecondProductToCL().click();
    }


    @And("success message appears that the second product is already added to the compare list")
    public void successMessageTwo()
    {
        String expectedResult = "The product has been added to your product comparison";
        String actualResult=comparelist.successMessageCL().getText();
        soft.assertEquals(actualResult,expectedResult);
    }

    @And("user could see the items in the compare list")
    public void seeItemsInCompareList() throws InterruptedException {
        comparelist.CompareList().click();
        Thread.sleep(4000);
    }
}
