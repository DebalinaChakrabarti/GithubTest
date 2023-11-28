package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.BaseClass;

public class Tree extends BaseClass {
	
	By UserName = By.id("id_username");
	By PassWord = By.xpath("//input[@type='password']");
	By drpDwn = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By getStartd = By.xpath("//div[2]/div[6]/div/div/a");
	By signIn = By.linkText("Sign in");
	By loginButton = By.xpath("//input[@value='Login']");
    By OverviewofTrees = By.linkText("Overview of Trees");
	By Terminologies = By.linkText("Terminologies");
	By TypesofTrees	 = By.linkText("Types of Trees");
	By TreeTraversals = By.linkText("Tree Traversals");
	By TraversalsIllustration = By.linkText("Traversals-Illustration");
	By BinaryTrees  = By.linkText("Binary Trees");
	By TypesofBinaryTrees = By.linkText("Types of Binary Trees");
	By ImplementationinPython = By.linkText("Implementation in Python");
	By BinaryTreeTraversals = By.linkText("Binary Tree Traversals");
	By ImplementationofBinaryTrees = By.linkText("Implementation of Binary Trees");
	By ApplicationsofBinarytrees = By.linkText("Applications of Binary trees");
	By BinarySearchTrees = By.linkText("Binary Search Trees");
	By ImplementationOfBST = By.linkText("Implementation Of BST");
	By practicequestions = By.linkText("Practice Questions");
	By Tryhere = By.linkText("Try here>>>");
	By editor = By.xpath("//div[5]//div//pre");
	By Run = By.xpath("//*[@id='answer_form']/button");
	public WebElement drpDwn() {
	return driver.findElement(drpDwn);

}
	public void clickGetStartd() {
		 driver.findElement(getStartd).click();
	}
		public WebElement DrpDwn() {
			return driver.findElement(drpDwn);
			 
		}
		public void enterUsername(String Uname) {
			driver.findElement(UserName).sendKeys(Uname);
		}

		public void enterPassword(String Pwd) {
			driver.findElement(PassWord).sendKeys(Pwd);
			
		}
		public void clickSignin() {
			driver.findElement(signIn).click();
			
		}
		public void clickLogin() {
			driver.findElement(loginButton).click();
		}
		public void clickoverviewofTrees() {
			 driver.findElement(OverviewofTrees).click();

		}
		
	
	public void terminologies() {
		driver.findElement(Terminologies).click();

	}
	public void typesoftrees() {
	 driver.findElement(TypesofTrees).click();

	}
	
	public void treetraversals() {
		 driver.findElement(TreeTraversals).click();

	}
	public void traversalsillustration() {
	    driver.findElement(TraversalsIllustration).click();

	}
	public void binarytrees() {
		 driver.findElement(BinaryTrees).click();

	}
	public void typesofbinarytrees() {
		 driver.findElement(TypesofBinaryTrees).click();

	}
	public void implementationinPython() {
		driver.findElement(ImplementationinPython).click();

	}
    public  void binarytreetraversals() {
		driver.findElement(BinaryTreeTraversals).click();

	}
	public void implementationofbinarytrees() {
		driver.findElement(ImplementationofBinaryTrees).click();

	}	
	public void  applicationsofbinarytrees() {
		driver.findElement(ApplicationsofBinarytrees).click();

	}				
	public void binarysearchtrees() {
		driver.findElement(BinarySearchTrees).click();

	}
	public void implementationofBST() {
		 driver.findElement(ImplementationOfBST).click();

	}
	
	public void practicequestions() {
		driver.findElement(practicequestions).click();;

	}
	public void tryhere() {
		 driver.findElement(Tryhere).click();

	}
	public void editor() {
		driver.findElement(editor);
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
	public void Run () {
		driver.findElement(Run).click();
	}
	}
	