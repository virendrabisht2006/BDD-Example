package feature.salary;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {
                "json:target/cucumber/Salary.json",
                "html:target/cucumber/Salary.html",
                "pretty"
        },
        tags = {"~@ignored"}
)
public class SalaryCukeTest {
}
