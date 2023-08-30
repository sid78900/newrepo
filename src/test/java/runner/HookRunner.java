package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/main/resources/HookFeature/Hook.feature"},
glue= {"HookStepDef"},
plugin= {"json:target/cucumber.json"}

		)
public class HookRunner {

}
