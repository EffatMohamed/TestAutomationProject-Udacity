package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddDifferentProductsToShoppingCart;
import pages.FilterWIthColor;

public class AddDifferentProductsToShoppingCartStepDef {
    public static String QTYValue;
    AddDifferentProductsToShoppingCart addProductsToShoopingCart=new AddDifferentProductsToShoppingCart();
    FilterWIthColor filterColors=new FilterWIthColor();
    @Given("user clicks on The Apparel category")
    public void clickonApparelCategoryy()
    {
        filterColors.ApparelCategory().click();
    }

    @When("user clicks on subcategory clothes")
    public void clickOnClothesCategory()
    {
        addProductsToShoopingCart.ClickOnClothingSubCategory().click();
    }

    @And("user adds products from clothes category")
    public void selectTshirt()
    {
        addProductsToShoopingCart.selectATshirt().click();
    }
    @And("User ENter Req. text")
    public void enterReqText()
    {

        addProductsToShoopingCart.fillReqText().sendKeys("To me");
    }
    @And("user add the Tshirt to his cart")
    public void addTshirtToCart()  {
        addProductsToShoopingCart.addTheTshirtToTheCart().click();

    }
    @And("user click on Digital downloads")
    public void clickOnDigitalDownloads()
    {
        addProductsToShoopingCart.clickOnDDownloads().click();
    }
    @And("user click ON DD Photo")
    public void clickOnDDPhotos()
    {
        addProductsToShoopingCart.clickOnDDPhoto().click();
    }
    @And("user Add DD photo TO The cart")
    public void addDDPHOTOToShoppingCart()  {
        addProductsToShoopingCart.addDDphotoCart().click();
    }
    @And("user click ON Shopping CArt")
    public void CheckShoopingCArt()
    {

        addProductsToShoopingCart.clickOnSCartButton().click();
    }
    @Then("user is able to update the quantity")
    public void editQuantities() throws InterruptedException {

        Thread.sleep(3000);
        addProductsToShoopingCart.updateQTY().clear();
          addProductsToShoopingCart.updateQTY().sendKeys("50");
          Thread.sleep(3000);
    }

    @And("user is able to remove items from cart")
    public void removeitems() throws InterruptedException {
        addProductsToShoopingCart.rmvItem().click();
        Thread.sleep(3000);
    }
    @And("user could confirm update cart")
    public void confirmupdatecart() throws InterruptedException {

        addProductsToShoopingCart.confirmUpdateCart().click();
        Thread.sleep(3000);
    }

}
