package serenitySteps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.generalUtils;
import utils.locators;

import java.time.Duration;

public class appLoginSteps {

    generalUtils utils = new generalUtils();
    locators locator = new locators();
    WebDriver driver= null;
    WebDriverWait wait ;

    @Step
    public void userLogin(String userName, String password) throws InterruptedException {
        System.setProperty(utils.getChromeDriver, utils.getPath);
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        driver.manage().window().maximize();
        driver.navigate().to(utils.getUrl);
        WebElement userNameInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator.userName)));
        userNameInput.sendKeys(userName);
        driver.findElement(By.xpath(locator.passWord)).sendKeys(password);
        driver.findElement(By.xpath(locator.showButton));
        driver.findElement(By.xpath(locator.loginButton)).click();
        WebElement header = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator.linkedinHeader)));
        Assert.assertTrue(header.isDisplayed());
//        WebElement messageDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator.messageDownButton)));
//        messageDown.click();
//        driver.findElement(By.xpath(locator.messageDownButton)).click();
    }

    @Step
    public void updateProfile() throws InterruptedException {
        driver.findElement(By.xpath((locator.getProfile))).click();
        System.out.println("getting to the profile");
    }
}
