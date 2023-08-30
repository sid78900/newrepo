package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Tagfeatures/Tag.feature",
glue= {"StepDef"},
tags= "@login and not @regression "   //OR yavdre ondh iddidu excute //And yardu irbeku



)
public class TagRunner {

}
