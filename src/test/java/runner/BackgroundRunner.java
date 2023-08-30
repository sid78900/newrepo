package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/main/resources/Background/Background.feature"},
glue= {"backgrounP"},
monochrome = true,
plugin= {"html:target/back_html_report"}
)
public class BackgroundRunner {

}
