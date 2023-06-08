package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/home/addweb/LeadsM/src/test/java/Feature"},
        glue = {"Steps"}
        //plugin = {"pretty", "html:Report1.html"}
        //dryRun = true
        //monochrome = true
        //tags = "@Project"
        //name = {"TimeLog"}
)

public class TestRunner
{

}
