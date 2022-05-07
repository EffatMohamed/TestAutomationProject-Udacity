package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;
public class CompareList {

    public WebElement addfirstProductToCL()
    {
        return Hooks.driver.findElement(By.xpath("(//button[@title=\"Add to compare list\"])[1]"));
    }
    public WebElement successMessageCL()
    {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

    public WebElement addsecondProductToCL()
    {
        return Hooks.driver.findElement(By.xpath("(//button[@title=\"Add to compare list\"])[1]"));

    }
    public WebElement CompareList()
    {
       return Hooks.driver.findElement(By.cssSelector("a[href=\"/compareproducts\"]"));
    }
}
