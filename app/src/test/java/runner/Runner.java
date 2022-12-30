package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import pages.BasePage;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps",
    monochrome = true
)

public class Runner {
     @AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }
}