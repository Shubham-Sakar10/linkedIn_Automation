package StepsDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/shubham.sarkar/Desktop/serenity-cucumber-starter-master/src/test/resources/" +
        "features/search/loginpage.feature",
        glue={"StepsDefinitions"}
        )
public class testRunner {

}
