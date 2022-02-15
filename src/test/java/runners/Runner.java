package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin = {
//                "pretty",//This is used for more readable reports or outputs
//                "html:target/default-cucumber-reports.html",//Use this reports
//                "json:target/json-reports/cucumber.json",
//                "junit:target/xml-report/cucumber.xml",
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//                "rerun:target/failedRerun.txt"
//        },
        features = "C:\\Users\\Nurdan\\IdeaProjects\\cucumberproject\\src\\test\\resources\\features",
        glue = {"stepdefinitions","Hooks"},//run stepdefinitions and Hooks folder
        tags = "@create_account_with_existing_email",
        dryRun = false
)
public class Runner {
}



