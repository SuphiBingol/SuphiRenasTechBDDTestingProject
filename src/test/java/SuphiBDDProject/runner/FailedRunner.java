package SuphiBDDProject.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "SuphiBDDProject.step_definitions",
        tags = "@Smoke",
        dryRun = true,
        plugin = {"pretty",
                "html:target/default-cucumber-reports.html",
               "json:target/cucumber.json",
               "rerun:target/rerun.txt"},
        publish = false,
        monochrome = false

)

public class FailedRunner {

}
