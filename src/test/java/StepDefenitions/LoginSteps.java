package StepDefenitions;

import Pages.Homepage_login;
import Pages.Login_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class LoginSteps {

    WebDriver driver;
    Login_Page lp;
    Homepage_login HP_login;

    @Given("User enter the magneto Login Url")
    public void userEnterTheMagnetoLoginUrl() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @Then("User Navigate to Homepage and click on the Sign In link")
    public void userNavigateToHomepageAndClickOnTheSignInLink() {
        HP_login = new Homepage_login(driver);
        HP_login.clickSigninlink();
    }

    @And("User Enters the {string} and {string}")
    public void userEntersTheAnd(String Email, String Password)
    {
        lp = new Login_Page(driver);
    lp.Enter_Email(Email);
    lp.Enter_Password(Password);


    }

    @And("User click on the Sign in button")
    public void userClickOnTheSignInButton() {
        lp.Click_SignIn();

    }

    @And("User navigate to the Homepage")
    public void userNavigateToTheHomepage() {
        HP_login.validateLogodisplayed();

    }


}
