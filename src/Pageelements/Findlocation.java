package Pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.AbstractMethods;

public class Findlocation extends AbstractMethods{
	WebDriver driver;

	public Findlocation(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
  @FindBy (xpath = "//span[@id='glow-ingress-line1']")
  WebElement deliver;
  
  @FindBy (xpath = "//span[@id='glow-ingress-line2']")
  WebElement location;
  
  @FindBy (xpath = "//div[@id='nav-packard-glow-loc-icon']")
  WebElement icon;
  
  
  public void Findlocation() {
	  implicitlywaitmethod();
	  deliver.click();
	  System.out.println("deliver is visible");
	  location.click();
	  System.out.println("location is visible side of location icon");
	  icon.click();
	  System.out.println("icon symbol is visible");
  }
  
  
}
