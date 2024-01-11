package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginStepDefinitions {
WebDriver driver;
    @Given(": User Launch the URl")
    public void user_launch_the_u_rl() {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.shop.demoqa.com");
    }
    @When(": user enter username as {string} and password {string}")
    public void user_enter_username_as_and_password(String string, String string2) {

    }
    @Then(": verify User is able to Login")
    public void verify_user_is_able_to_login() {

    }

}
