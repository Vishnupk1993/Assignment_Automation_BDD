package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout_Page {

    WebDriver driver;
    String UserProfile="(//button[@type='button' and @class='action switch'])[1]";
    String SignOut="(//a[contains(text(),'Sign Out')])[1]";


    public Logout_Page(WebDriver driver) {
        this.driver=driver;
    }


    public void Click_logout() throws InterruptedException {
        driver.findElement(By.xpath(UserProfile)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(SignOut)).click();
    }

}
