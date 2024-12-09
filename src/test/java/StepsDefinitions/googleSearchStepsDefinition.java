package StepsDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchStepsDefinition {

    WebDriver driver = null;
    @Given("user is opening the browser")
    public void google_open(){
        System.out.println("Inside Step- user is opening the browser");

        String projectPath = System.getProperty("user.dir");
        System.out.println("projectpath is"+ projectPath);
        System.setProperty("WebDriver.ChromeDriver","src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @And("user is on the google search page")
    public void google_search_page(){
        System.out.println("Inside steps- going to the google page");

        driver.navigate().to("https://www.naukri.com/");

    }

    @When("user enter some text to search in the google page")
    public void enter_some_keywords(){
        System.out.println("user enter some text to search in the google page");

        driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Automation Testing");

    }

    @And("user need to click on the search button")
    public void user_need_to_click_the_login_button(){
        System.out.println("user need to click on the Search button");

        driver.findElement(By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnK']")).click();

    }
    @Then("user validate the search result")
    public void user_navigated_to_the_login_page(){
        System.out.println("user navigated to the login page");

        driver.getPageSource().contains("Automation Testing");

    }
}
