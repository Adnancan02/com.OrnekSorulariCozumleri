package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="features folder path",
        glue="stepdefinitions folder path",
        tags="@istediginiz tag",
        dryRun=true)


public class Runner {
}
