package Pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.AbstractMethods;

public class Searchbar extends AbstractMethods{
	WebDriver driver;
	

	public Searchbar(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (xpath = "//select[@id='searchDropdownBox']")
	WebElement dropdownbox;
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchbar;
	
	@FindBy (xpath = "//input[@id='nav-search-submit-button']")
	WebElement submitbutton;
	
	 public void Searchbar() {
		 implicitlywaitmethod();
		 dropdownbox.click();
		 System.out.println("Dropdown button is working");
		 searchbar.click();
		 System.out.println("User is able to search the products in searchbar");
		 submitbutton.click();
		 System.out.println("User is able to click on submitbutton");
	 }
}
