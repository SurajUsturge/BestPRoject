package runclasses;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature/Tester.feature",glue="stepdefination")
	
public class Runclass 
{	
	
}	