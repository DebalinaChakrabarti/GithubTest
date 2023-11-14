package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepDefinition.BaseClass;

public class AlgoPortalHome extends BaseClass {
//    public AlgoPortalHome(WebDriver driver) {
//	}

	By getStartedbtn = By.xpath("//button[text()='Get Started']");
	By drpDwn = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By getStartd = By.xpath("//div[3]/div[1]/div/div/a");
	By array = By.xpath("//a[text()='Arrays']");
	By signIn = By.xpath("//a[text()='Sign in']");
	By regstr = By.xpath("//a[text()='Register!']");

	public void clickGetStartedbtn() {
		driver.findElement(getStartedbtn).click();
	}
	public void ClickDrpdwn()  {
		driver.findElement(drpDwn).click();
	}

	public void ClickArray() {
		driver.findElement(array).click();
	}

	public void VerifyAlertMsg1() {
	}

	public void ClickGetstartd()  {
		driver.findElement(getStartd).click();
	}

	public void VerifyAlertMsg2() {
	}

	public void ClickSignin() {
		driver.findElement(signIn).click();
	}

	public void ClickRegistr() {
		driver.findElement(regstr).click();
	}

}
