package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/features",
glue= {"classpath:StepDef"},
monochrome = true,
plugin = {"pretty","html:target/cu_html_report"}
)
public class LoginRunner{


}
