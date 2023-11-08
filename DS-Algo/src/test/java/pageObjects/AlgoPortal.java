package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlgoPortal {
	public WebDriver driver;

	public AlgoPortal(WebDriver driver) {
		this.driver = driver;
	}

	By getStartedbtn = By.xpath("//button[text()='Get Started']");

	public void clickGetStartedbtn() {
		driver.findElement(getStartedbtn).click();

	}

}
