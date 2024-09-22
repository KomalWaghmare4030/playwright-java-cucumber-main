package testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Rerun failed tests from rerun.txt file
        features = {"src/test/resources/features/"},
        glue = {"stepdefinitions", "hooks"},
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/rerun.txt"  // Save Failed test scenarios in rerun.txt file
        }
)

public class TestRunner {
}


D:\JavaProjects\playwright-java-testng\extent-config.xml

MediaEntityBuilder.createScreenCaptureFromPath(DriverFactory.takeScreenshot())

D:\JavaProjects\playwright-java-testng/test-output/screenshots/1727014169919.png

D:\JavaProjects\playwright-java-testng/test-output/screenshots/1727014169919.png