package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage_login {
    WebDriver driver;

    String Create_AccountLink="(//a[text()='Create an Account'])[1]";
    String SignInLink="(//a[contains(text(),'Sign')])[1]";
    String LogoDisplay="//a[@class='logo']";

    public Homepage_login(WebDriver driver)
    {
        this.driver=driver;
    }

    public void clickSigninlink()
    {
        driver.findElement(By.xpath(SignInLink)).click();
    }
    public void clickOnCreateAccountLink()
    {
        driver.findElement(By.xpath(Create_AccountLink)).click();
    }
    public  void validateLogodisplayed()
    {
        driver.findElement(By.xpath(LogoDisplay)).isDisplayed();
    }
}
