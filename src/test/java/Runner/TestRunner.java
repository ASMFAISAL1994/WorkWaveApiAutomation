package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;



        @CucumberOptions(
                features = {
                        "src/test/resources/ApiFeatures",
//                        "src/test/resources/AppFeatures",
//                        "src/test/resources/WebFeatures"
                },
                glue = {"Stepdefinition"},
                tags ="@smoke",
                monochrome = true,
                dryRun = false,
                plugin = {
                        "pretty",
                        "html:build/reports/feature.html"
                })
        @Test
        public class TestRunner extends AbstractTestNGCucumberTests {
        }



