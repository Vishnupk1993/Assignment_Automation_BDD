package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {

    WebDriver driver;
    String User_Email_id="//input[@id='email']";
    String User_Password="//input[@title='Password']";
    String Sign_in_Button="//button[@class='action login primary']/span[text()='Sign In']";

    public Login_Page(WebDriver driver)
    {
        this.driver=driver;
    }
            public void Enter_Email(String Email)
            {
                driver.findElement(By.xpath(User_Email_id)).sendKeys(Email);

            }
            public void  Enter_Password(String Password)
            {
                driver.findElement(By.xpath(User_Password)).sendKeys(Password);
            }
            public void Click_SignIn()
            {
                driver.findElement(By.xpath(Sign_in_Button)).click();
            }

}
