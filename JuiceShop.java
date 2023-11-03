package assignmentJuiceShop;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JuiceShop {

	public static WebDriver driver;

			
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		JuiceShopRegistration juiceShopRegistrationObj = new JuiceShopRegistration();
		juiceShopRegistrationObj.register();
		JuiceShopLogin juiceShopLoginObj = new JuiceShopLogin();
		juiceShopLoginObj.login();
		JuiceShopPage1Cart juiceShopPage1CartObj = new JuiceShopPage1Cart();
		juiceShopPage1CartObj.addToCart();
		JuiceShopPage2Cart juiceShopPage2CartObj = new JuiceShopPage2Cart();
		juiceShopPage2CartObj.addToCart();
		JuiceShopPage3Cart juiceShopPage3CartObj = new JuiceShopPage3Cart();
		juiceShopPage3CartObj.addToCart();
		BasketPage basketPageObj = new BasketPage();
		basketPageObj.addToCart();
//		Thread.sleep(10000);
//		driver.quit();
	}

}
