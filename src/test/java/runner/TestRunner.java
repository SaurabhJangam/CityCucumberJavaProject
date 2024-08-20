package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/Feature/tagging.feature"
        ,glue = {"steps"}
        ,tags = "~@SmokeTest"
//        format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
//        monochrome = true  m,//display the console output in a proper readable forma
//        dryRun = true //to check the mapping is proper between feature file and step def file

)
public class TestRunner {
}
