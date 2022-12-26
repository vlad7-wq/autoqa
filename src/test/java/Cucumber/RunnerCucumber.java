package Cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Cucumber/Amazon/Features/",
        glue = "Cucumber",
        tags = "@AmazonMainPage.feature",
        dryRun = false,
        strict = false,
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)

public class RunnerCucumber {

}
