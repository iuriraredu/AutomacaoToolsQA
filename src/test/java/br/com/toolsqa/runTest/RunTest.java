package br.com.toolsqa.runTest;

import br.com.toolsqa.settings.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        glue = {"br.com.toolsqa.web", "br.com.toolsqa.settings"},
        plugin = {
                "pretty",
                "json:test-output/json/cucumber.json",
                "html:test-output/html/cucumber-reports.html"
        },
        tags = "@WebTables"
)
public class RunTest extends BaseTest {
}