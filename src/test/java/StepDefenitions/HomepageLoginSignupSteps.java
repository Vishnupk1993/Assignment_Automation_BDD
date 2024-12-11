package StepDefenitions;

import Pages.Account_Creation_Page;
import Pages.Homepage_login;
import Pages.Logout_Page;
import Pages.My_AccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomepageLoginSignupSteps {
    WebDriver driver;

    @Given("User Enters the URL")
    public void userEntersTheURL() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @Then("User Lands on the Homepage")
    public void userLandsOnTheHomepage() {
        Homepage_login HP_login = new Homepage_login(driver);
        HP_login.clickOnCreateAccountLink();

    }

    @And("User lands on the Account creation page and create new account with {string} and {string} and {string} and {string} and {string}")
    public void UserEnterAccountCreationDetails(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) throws InterruptedException {
        Account_Creation_Page ACP = new Account_Creation_Page(driver);
        ACP.Enter_FirstName(FirstName);
        ACP.Enter_LastName(LastName);
        ACP.Enter_EmailID(Email);
        ACP.Enter_UserPassword(Password);
        ACP.Enter_ConfirmPassword(ConfirmPassword);
        ACP.click_Create_account_Button();
    }


    @And("User Navigates to My Account Page and Validate the success message")
    public void userNavigatesToMyAccountPage() {
        My_AccountPage Account_Page = new My_AccountPage(driver);
        Account_Page.Valdiate_SuccessMessage();
    }

    @And("user Logout from Application")
    public void userLogoutFromApplication() throws InterruptedException {
        Logout_Page logout_page = new Logout_Page(driver);
        logout_page.Click_logout();
    }

    @And("User close the browser")
    public void user_close_the_browser() {
        driver.close();


    }
}
