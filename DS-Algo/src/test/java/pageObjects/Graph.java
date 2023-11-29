package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import stepDefinition.BaseClass;

public class Graph  extends BaseClass {
	By loginUserName = By.id("id_username");
	By loginPassword = By.id("id_password");
	By loginButton = By.xpath("//input[@value='Login']");
	By  GetStarted = By.xpath("//div[2]/div[7]/div/div/a");
	By  Graph = By.xpath("//div[2]/ul[2]/a");
	By GraphRepresentation = By.xpath("//div[2]/ul[3]/a");
	By TryHere = By.linkText("Try here>>>");
    By editor = By.id("editor");
    By runButton = By.xpath("//*[@id='answer_form']/button");
	By Practicequestions  = By.linkText("Practice Questions");
    
    public void userNa(String Uname){
    	driver.findElement(loginUserName).sendKeys(Uname);
    	
    }
    public void userPw(String Userpw) {
    	driver.findElement(loginPassword).sendKeys(Userpw);
    }
    public void Clickloginbutton() {
   driver.findElement(loginButton).click();
    }
    public void ClickGetstarted() {
    	driver.findElement(GetStarted).click();
    }
    public void Clickgraph() {
    	driver.findElement(Graph).click();
    }
    public void Clickgraphrepresentatio() {
    	driver.findElement(GraphRepresentation).click();
}
    public void Clicktryhere() {
    	driver.findElement(TryHere).click();
    }
    public void Clickeditor() {
    	driver.findElement(editor).click();
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
    public void Clickrunbutton() {
    	BaseClass.getDriver().findElement(runButton).click();
}
  public void Practicequestions () {
	  driver.findElement(Practicequestions).click();  
  }
}