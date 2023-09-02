package net.seamlessly.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html"
                ,"me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt"
                },
        features = "src/test/resources/features",
        glue = "net/seamlessly/step_definitions",
        dryRun = true,
        tags = "",
        publish = true
)
public class CukesRunner {
}
