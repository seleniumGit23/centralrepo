package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)  //converts the Feature file into Java class
@CucumberOptions(features="src/test/resources/FeatureFile", glue ={"Steps"},publish = true,
        plugin = {"pretty","html:target/Report1.html", "json:target/json-report/cucumber.json" ,"junit:target/junit-report"},
//dryRun =true,
tags ="@Amazon"
//name =  "test"
)
public class TestRunner {

}
