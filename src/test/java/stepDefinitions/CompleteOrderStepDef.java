package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.CompleteOrder;

public class CompleteOrderStepDef {
   CompleteOrder completeorder=new CompleteOrder();

   @When("user is able to accept terms and conditions")
   public void acceptTerms()
   {
      completeorder.acceptTermsConditions().click();
   }
   @And("user is able to click on Checkout")
   public void clickOnCheckOut()  {
      completeorder.CHECKoutBtt().click();
   }
   @And("user is able to select country")
   public void SelectCountry() throws InterruptedException {
      Select select=new Select(completeorder.selectCountry());
      select.selectByIndex(1);

      Thread.sleep(2000);
      Select select2=new Select(completeorder.selectStatus());
      select2.selectByIndex(1);
   }
   @And("user is able to enter the city successfully")
   public void enterCity()
   {
      completeorder.EnterCity().sendKeys("CITYYYY");
   }
   @And("user is able to enter the address successfully")
   public void enterAddress()
   {
      completeorder.EnterAddress().sendKeys("Address1");
   }

   @And("user isa able tp Enter His ZIP code successfully")
   public void ENterZIP()
   {
      completeorder.EnterZIP().sendKeys("12345");
   }
   @And("user is able to Enter the phone number successfully and continue the process")
   public void EnterPNumber() throws InterruptedException {
      completeorder.EnterPhoneNumber().sendKeys("01912345678");
      completeorder.ContinueButton().click();
   }


   @And("user is able to fill address")
   public void fillAddress()
   {
      completeorder.FillAddress().click();
   }

   @And("user able to select paymentMethods")
   public void selectPaymentMethods()
   {
      completeorder.SlectfirstPayment().click();
      completeorder.SlectPaymentInfo().click();


   }
   @Then("user can confirm the order")
   public void confirmOrder() throws InterruptedException {
      completeorder.ConfirmOrders().click();
      Thread.sleep(3000);
   }


   @And("success Message Appears that the order is already completed successfully")
   public void Message()
   {
      String ActualMessage="Your order has been successfully processed!";
      SoftAssert soft=new SoftAssert();
      soft.assertTrue(completeorder.successMessage().getText().contains(ActualMessage));
   }

}
