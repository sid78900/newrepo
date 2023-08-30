package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/main/resources/features/Facebook.feature"},
glue= {"classpath:StepDef"},
monochrome = true,
plugin= {"html:target/cu_html_report"}
)
public class FacebookRunner {

}
