package feature.book;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {
                "json:target/cucumber/BookSearch.json",
                "html:target/cucumber/BookSearch.html",
                "pretty"
        },
        tags = {"~@ignored"}
)
public class BookSearchCukeTest {
}
