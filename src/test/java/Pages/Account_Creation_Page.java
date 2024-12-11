package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Account_Creation_Page {
    WebDriver driver;
    String First_Name="//input[@id='firstname']";
    String Last_Name="//input[@id='lastname']";
    String Email_id="//input[@id='email_address']";
    String User_Password="//input[@id='password']";
    String User_Confirm_pwd="//input[@id='password-confirmation']";
    String AccountCreation_button="//button[@title='Create an Account']";

    public Account_Creation_Page(WebDriver driver)
    {
        this.driver=driver;
    }

    public void Enter_FirstName(String FirstName)
    {
        driver.findElement(By.xpath(First_Name)).sendKeys(FirstName);
    }
    public void Enter_LastName(String LastName)
    {
        driver.findElement(By.xpath(Last_Name)).sendKeys(LastName);
    }
    public void Enter_EmailID(String Email)
    {
        driver.findElement(By.xpath(Email_id)).sendKeys(Email);
    }
    public void Enter_UserPassword(String Password) throws InterruptedException {
        driver.findElement(By.xpath(User_Password)).sendKeys(Password);
        Thread.sleep(2000);
    }
    public void Enter_ConfirmPassword(String ConfirmPassword)
    {
        driver.findElement(By.xpath(User_Confirm_pwd)).sendKeys(ConfirmPassword);
    }

    public void click_Create_account_Button()
    {
        driver.findElement(By.xpath(AccountCreation_button)).click();

    }
}
