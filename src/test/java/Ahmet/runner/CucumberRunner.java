package Ahmet.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources",
        glue = "Ahmet/StepDefinitions",
        dryRun = false,
        tags = "@smoke"
//        plugin = {
//                "html:target/default-cucumber-reports.html",
//                "json:target/cucumber.json",
//        }
)


public class CucumberRunner {
}
