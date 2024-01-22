package Pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.AbstractMethods;

public class Membershipandsubscription extends AbstractMethods{
   WebDriver driver;
   
   
	public Membershipandsubscription(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
	  @FindBy (xpath = "//h1[contains(text(),'Your Memberships & Subscriptions')]")
	  WebElement membership;
	
      @FindBy (xpath = "//span[contains(text(),'Current Subscriptions")
      WebElement subscription;
      
      @FindBy (xpath = "//span[@id='a-autoid-1-announce']")
      WebElement featured;
      
      @FindBy (xpath = "//input[@id='swa-search-input']")
      WebElement searchbar;
      
      @FindBy (xpath = "//body/div[@id='Submit_button']/div[@id='a-page']/div[@id='swa-subsmgr-container']/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/input[1]")
      WebElement go;
      
      
      public void Membershipandsubscription() {
    	  implicitlywaitmethod();
    	  membership.click();
    	  System.out.println("Membership and subscription page is opend");
    	  subscription.click();
    	  System.out.println("Current subscription button is visible");
    	  featured.click();
    	  System.out.println("Featured is visible");
    	  searchbar.click();
    	  System.out.println("User is able to search on searchbar");
    	  go.click();
    	  System.out.println("Submit button is visible");
    	  
      }
      
}
