package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import java.util.ArrayList;
import pages.SearchProduct;
public class SearchStepDef {

    SearchProduct searchProduct=new SearchProduct();

    @Given("user click on search field")
    public void clickOnSearchField()
    {
        searchProduct.ClickSearchButton().click();
    }

    @When("user search with name of product")
    public void searchForCertainProduct()
    {
        searchProduct.searchForCertainElement().sendKeys("shoes");
        searchProduct.submitSearchItem().click();
    }

    @Then("user could find relative results")
    public void findRelativeResults()
    {
        int count =searchProduct.quantity().size();
        System.out.println(count);
        Assert.assertTrue(count > 0);

        ArrayList<String> productList=null;
        productList=new ArrayList <String> ();
        for (int i = 0; i < count ; i++) {
            System.out.println(searchProduct.quantity().get(i).getText());
            productList.add(searchProduct.quantity().get(i).getText());
            Assert.assertTrue(searchProduct.quantity().get(i).getText().toLowerCase().contains("shoes"));

        }
        System.out.println(productList);
    }
}
