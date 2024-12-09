package StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import serenitySteps.appLoginSteps;
import utils.generalUtils;
import utils.locators;

public class loginSteps {

    @Steps

    appLoginSteps appLoginStep = new appLoginSteps();
    WebDriver driver= null;

    @Given("^user is log in to the site with credentials with (.*),(.*)$")
    public void Login(String username, String Password) throws InterruptedException {
        appLoginStep.userLogin(username, Password);
    }

    @Then("^User is opening profile and update the profile$")
    public void updateProfile() throws InterruptedException {
        appLoginStep.updateProfile();
    }

    
}
