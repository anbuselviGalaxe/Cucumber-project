package TextCompareRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/TextCompareCucumbernewFeatures",
		glue= {"TextCompareStepDefinition"},
		//tags= "@functional11" ,
	monochrome=true,
			dryRun=false,
			//plugin= {"html:target/report.html","json:target/cucumberreport.json"}
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/rerun.txt"  }
		
		
		)
public class TestRunner {

}
