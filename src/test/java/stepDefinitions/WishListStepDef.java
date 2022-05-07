package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.WishList;

public class WishListStepDef {

    WishList wishlist=new WishList();


    @Given("user click on wishlist for a specific product")
    public void additemToWishlist() throws InterruptedException {
        wishlist.addfirstItemToWL().click();
        Thread.sleep(3000);
    }
    @And("user add another element to wishlist")
    public void addsecitemToWL()
    {
        wishlist.addsecondItemToWL().click();
        wishlist.addToWL().click();
    }
    @When("user goes to Wishlist")
    public void gotoWishlist() throws InterruptedException {
        wishlist.wishlistButton().click();
        Thread.sleep(5000);
    }
    @And("count number of quantity")
    public void quantities()
    {

        int count=wishlist.getCount().size();
        int total=0;
        int sum=0;
        for(int i=0; i< count;i++)
        {
            String values=wishlist.getCount().get(i).getAttribute("value");
            sum=Integer.parseInt(values);
            total=total+sum;
            SoftAssert soft=new SoftAssert();
            soft.assertEquals(total,2);
        }
    }

}
