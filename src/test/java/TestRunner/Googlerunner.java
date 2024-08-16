package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class Googlerunner {
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sultan\\eclipse-workspace\\cucumberFW_selenium\\src\\test\\resources\\feature\\google.feature",glue="stepdef")
public class googlerunner {
}
}
