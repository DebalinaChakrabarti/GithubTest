package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import stepDefinition.BaseClass;

public class LinkdList extends BaseClass {
	// WebDriver driver;
	
	By getStrtedButton = By.xpath("//div[3]//div//div//a");
	By Introduction = By.linkText("Introduction");
	By creatngLnkdLst = By.linkText("Creating Linked LIst");
	By typesofLnkdLst = By.linkText("Types of Linked List");
	By implemntLnkdLstinPython = By.linkText("Implement Linked List in Python");
	By Traversal = By.linkText("Traversal");
	By Insertion = By.linkText("Insertion");
	By Deletion = By.linkText("Deletion");
	By practiceQue = By.linkText("Practice Questions");
	By tryHere = By.linkText("Try here>>>");

	public void clickGetStrtdBtn() {
		driver.findElement(getStrtedButton).click();
	}

	public void clickIntroductn() {
		driver.findElement(Introduction).click();
	}

	public void clickCreatngLL() {
		driver.findElement(creatngLnkdLst).click();
	}

	public void clickTypesofLL() {
		driver.findElement(typesofLnkdLst).click();
	}

	public void clickImplemntLLinPython() {
		driver.findElement(implemntLnkdLstinPython).click();
	}

	public void clickTraversal() {
		driver.findElement(Traversal).click();
	}

	public void clickInsertion() {
		driver.findElement(Insertion).click();
	}

	public void clickDeletion() {
		driver.findElement(Deletion).click();
	}

	public void clickPracticeQue() {
		driver.findElement(practiceQue).click();
	}

	public void clickTryHere() {
		driver.findElement(tryHere).click();
	}

	public void getExcelData() {
		XLUtility Util = new XLUtility("src/test/resources/DSalgo.xlsx");
		int rowCount = Util.getRowCount("Sheet1");
		for (int rownum = 2; rownum <= rowCount; rownum++) {
			String Code = Util.getCellData("Sheet1", "Program Code", rownum);
			String Status = Util.getCellData("Sheet1", "Running Status", rownum);
			WebElement element = driver.findElement(By.xpath("//div[5]//div//pre"));
			Actions act = new Actions(driver);
			act.sendKeys(element, Code).build().perform();
			driver.findElement(By.xpath("//button[@type='button']")).click();

			if (Status.equalsIgnoreCase("Failure")) {
				Alert alert = driver.switchTo().alert();
				alert.accept();
			}
		}
	}

}
