package cucumberHooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import log4j.LoggerLoad;
import stepDefinition.BaseClass;
import utilities.ConfigReader;
import utilities.DriverFactory;

public class DSalgoHooks extends BaseClass {
	
	@BeforeAll

	public static void before() throws Throwable {

	//Get browser Type from config file

	LoggerLoad.info("Loading Config file");

//	ConfigReader.loadConfig();

	String browser = ConfigReader.getBrowserType();

	//Initialize driver from driver factory

	DriverFactory driverfactory = new DriverFactory();

	driver = driverfactory.initializeDrivers(browser);

	LoggerLoad.info("Initializing driver for : "+browser);

	}
	
	
//	@BeforeAll
//	@Test
//	@Parameters({"browser"})
//	public static void beforeAll(String browserName) {
//		if(getDriver() == null) {
//			if(browserName.equalsIgnoreCase("safari"))
//				setDriver(new SafariDriver());
//			else if(browserName.equalsIgnoreCase("chrome"))
//				setDriver(new ChromeDriver());
//		}
//		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		getDriver().manage().window().maximize();
////		}
//	}
//
	@AfterAll
	public static void after() {
		if (getDriver() != null) {
			getDriver().quit();
		}
	}

}