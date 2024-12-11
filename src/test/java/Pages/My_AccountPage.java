package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class My_AccountPage {

    WebDriver driver;

    String Validate_SuccessMessage="//div[text()='Thank you for registering with Main Website Store.']";
    String Expected_message="Thank you for registering with Main Website Store.";

    public My_AccountPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void Valdiate_SuccessMessage()
    {
       String Actual_message= driver.findElement(By.xpath(Validate_SuccessMessage)).getText();
        Assert.assertEquals(Actual_message,Expected_message);
    }
}
