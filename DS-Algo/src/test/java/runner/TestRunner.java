package runner;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ConfigReader;

//@RunWith(Cucumber.class) //JUnit execution

@CucumberOptions(
		plugin = {"pretty", "html:target/test-output",
				"json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
				}, //reporting purpose
//		plugin = {"pretty", 
//				  "html:target/MyReports" , 
//				  "json:target/MyReports/cucumber.json",
////				  "junit:target/MyReports/junitReport.xml"
//				  }, //reporting purpose
//		publish=true,
		monochrome=true,  //console output color
		//tags = "  @tag1", //tags from feature file
		features= {"src/test/resources/features"},
		glue= {"stepDefinition"
				,"cucumberHooks"
				}, //location of step definition files
		dryRun=false
		)

public class TestRunner  extends AbstractTestNGCucumberTests {
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
	return super.scenarios();  
	}
	
//	@BeforeTest
//	@Parameters({"browser"})
//	public void defineBrowser(String browser) throws Throwable {
//
//		System.out.println("browser is" +browser);
//		ConfigReader.setBrowserType(browser);
//	}
}
