package Pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.AbstractMethods;

public class Selectlanguage extends AbstractMethods{
	WebDriver driverhere;

	public Selectlanguage(WebDriver driverhere) {
		super(driverhere);
		this.driverhere = driverhere;
		PageFactory.initElements(driverhere, this);
		
	}
      @FindBy (xpath = "//body/div[@id='a-page']/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]")
      WebElement language1;
      
      @FindBy (xpath = "//body/div[@id='a-page']/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]/div[1]/label[1]/i[1]")
      WebElement language2;
      
      @FindBy (xpath = "//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]/div[1]/label[1]/i[1]")
      WebElement language3;
      
      @FindBy (xpath = "//body/div[@id='a-page']/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]/div[1]/label[1]/i[1]")
      WebElement language4;
      
      @FindBy (xpath = "//span[contains(text(),'$ - USD - US Dollar (Default)')]")
      WebElement Dollar;
      
      @FindBy (xpath = "//body/div[@id='a-page']/div[1]/div[1]/span[2]/span[1]/input[1]")
      WebElement savechanges;
      
      @FindBy (xpath = "//body/div[@id='a-page']/div[@id='rhf']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")
      WebElement starthere;
      
      @FindBy (xpath = "//body/div[@id='a-page']/div[@id='rhf']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]")
      WebElement signin;
      
      
      public void Selectlanguage() {
    	  implicitlywaitmethod();
    	  language1.click();
    	  System.out.println("User is able to select one language");
    	  language2.click();
    	  System.out.println("User is able to select another language ");
    	  language3.click();
    	  System.out.println("User is able to select language");
    	  language4.click();
    	  System.out.println("User is able to select fourth language");
    	  
      }
}
