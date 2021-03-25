package TextCompareRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="@target/rerun.txt",
				glue= {"TextCompareStepDefinition"},
		//tags= "@Functional1 " ,
	monochrome=true,
			dryRun=false,
			//plugin= {"html:target/report.html","json:target/cucumberreport.json"}
		plugin= { "pretty", "html:target/cucumber-reports.html"}
		)
public class FailTextCompareTestRunner 
{
	

}
