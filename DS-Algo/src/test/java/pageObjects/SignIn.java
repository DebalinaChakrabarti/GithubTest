package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	
//	public WebDriver driver;
//
//	public SignIn(WebDriver driver) {
////		this.driver = driver;
//	}
		
	
	By loginUserName = By.id("id_username");
	By loginPassword = By.id("id_password");
	By loginButton = By.xpath("//input[@value='Login']");
	By alertMsg = By.xpath("//div[@role='alert']");
	By signOut = By.xpath("//a[text()='Sign out']");
//	By alertMsg = By.xpath("//div[@role='alert']");


	
	public WebElement getUserName()
	{
		 return stepDefinition.BaseClass.driver.findElement(loginUserName);
	}
	public WebElement getPassword()
	{
		return stepDefinition.BaseClass.driver.findElement(loginPassword);
	}
	public void clickLoginButton()
	{
		stepDefinition.BaseClass.driver.findElement(loginButton).click();
	}
	public WebElement getAlertMsg()
	{
		return stepDefinition.BaseClass.driver.findElement(alertMsg);
	}
	public void clickSignOut()
	{
		stepDefinition.BaseClass.driver.findElement(signOut).click();
	}

}
