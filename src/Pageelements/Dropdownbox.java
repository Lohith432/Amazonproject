package Pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.AbstractMethods;

public class Dropdownbox extends AbstractMethods{
	WebDriver driver;

	public Dropdownbox(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
   @FindBy (xpath = "//select[@id='searchDropdownBox']")
   WebElement dropdown;
   
    public void Dropdownbox() {
    	implicitlywaitmethod();
    	dropdown.click();
    	System.out.println("Dropdownlist is clickable");
    	
    }
}
