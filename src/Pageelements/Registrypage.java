package Pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.AbstractMethods;

public class Registrypage extends AbstractMethods{
	WebDriver driver;

	public Registrypage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
     @FindBy (xpath = "//body/div[@id='a-page']/div[1]/nav[1]/div[1]/span[1]/span[1]/a[1]/span[1]")
     WebElement findregistry;
     
     @FindBy (xpath = "//span[contains(text(),'Create a registry or gift list')]")
     WebElement createregistry;
     
     @FindBy (xpath = "//span[contains(text(),'Help')]")
     WebElement help;
     
     @FindBy (xpath = "//body/div[@id='a-page']/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")
     WebElement searchname;
     
     @FindBy (xpath = "//span[@id='a-autoid-1-announce']")
     WebElement dropdown;
     
     @FindBy (xpath = "//body/div[@id='a-page']/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/span[1]/span[1]/input[1]")
     WebElement searchbutton;
     
        public void Registrypage() {
        	implicitlywaitmethod();
        	findregistry.click();
        	System.out.println("User is able to find the registry page");
        	createregistry.click();
        	System.out.println("User is able to create the registry");
        	help.click();
        	System.out.println("User is able to click on help button");
        	searchname.click();
        	System.out.println("User is able to search by name");
        	dropdown.click();
        	System.out.println("User is able to click on dropdown list");
        	searchbutton.click();
        	System.out.println("User is able to click on search button");
        }
}
