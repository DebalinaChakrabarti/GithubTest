package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By drpDwn = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By getStartd = By.xpath("//div[3]/div[1]/div/div/a");
	By array = By.xpath("//a[text()='Arrays']");
	By signIn = By.xpath("//a[text()='Sign in']");
	By regstr = By.xpath("//a[text()='Register!']");

	public void ClickDrpdwn() throws InterruptedException {
		driver.findElement(drpDwn).click();
	}

	public void ClickArray() {
		driver.findElement(array).click();
	}

	public void VerifyAlertMsg1() {
	}

	public void ClickGetstartd() throws InterruptedException {
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
