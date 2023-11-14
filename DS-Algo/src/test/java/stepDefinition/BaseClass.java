package stepDefinition;

import org.openqa.selenium.WebDriver;
import pageObjects.AlgoPortalHome;
import pageObjects.Register;
import pageObjects.SignIn;

public class BaseClass {
	public static WebDriver driver;
	public String URL="https://dsportalapp.herokuapp.com";
	public AlgoPortalHome AP;
	public Register RG; 
	public SignIn objSignIn;
	
}
