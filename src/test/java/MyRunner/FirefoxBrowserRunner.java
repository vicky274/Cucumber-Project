package MyRunner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import gherkin.formatter.model.Scenario;


@RunWith(Cucumber.class)
//for separate feature file remove "/" before src
@CucumberOptions(
        features = "src/test/resources/features/FirefoxLogin.feature",
        glue = {"stepDefinitions","TestUtilityHooks"},
        tags = {"@firefox"},
        dryRun=false,
        monochrome=true,
        strict=true,
        plugin = {
                "pretty",
                "html:target/1/Cucumber_maven_Report/cucumber-pretty",
                "rerun:target/1/Cucumber_maven_Report/cucumber-rerun/rerun.txt",
                "com.cucumber.listener.ExtentCucumberFormatter:target/1/cucumber-reports/report.html"
        })
public class FirefoxBrowserRunner {
   
	/* @AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File("./Cucumber-Project/src/main/resources/extent-config.xml"));
	 }*/
    
}