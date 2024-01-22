package Pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.AbstractMethods;

public class Musiclibrary extends AbstractMethods{
	WebDriver driver;

	public Musiclibrary(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
    @FindBy (xpath = "//span[contains(text(),'Music Library')]")
    WebElement music;
    
    @FindBy (xpath = "//body/div[@id='dropdown_list']/div[1]/div[2]/div[1]/div[3]/span[1]/span[1]/span[1]/span[1]/span[1]")
    WebElement dropdown;
    
    @FindBy (xpath = "//body[1]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/input[1]")
    WebElement next;
    
    @FindBy (xpath = "//a[contains(text(),'Cancel')]")
    WebElement cancel;
    
    @FindBy (xpath = "//input[@id='address-ui-widgets-enterAddressFullName']")
    WebElement firstandlastname;
    
    @FindBy (xpath = "//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
    WebElement phonenumber;
    
    @FindBy (xpath = "//input[@id='address-ui-widgets-enterAddressLine1']")
    WebElement address;
    
    @FindBy (xpath = "//input[@id='address-ui-widgets-enterAddressCity']")
    WebElement city;
    
    @FindBy (xpath = "//body/div[@id='State']/div[1]/div[2]/form[1]/span[1]/div[1]/div[7]/div[1]/div[11]/div[2]/div[2]/span[1]/span[1]/span[1]/span[1]")
    WebElement state;
    
    @FindBy (xpath = "//input[@id='address-ui-widgets-enterAddressPostalCode']")
    WebElement zipcode;
    
    @FindBy (xpath = "//body/div[@id='Add_address']/div[1]/div[2]/form[1]/span[1]/div[1]/span[3]/span[1]/span[1]/input[1]")
    WebElement addaddress;
    
    
    
    public void Musiclibrary() {
    	implicitlywaitmethod();
    	music.click();
    	System.out.println("Musicplayer is selected");
    	dropdown.click();
    	System.out.println("Dropdown is opened");
    	next.click();
    	System.out.println("Next button is visible");
    	cancel.click();
    	System.out.println("Cancel button is visible");
    	firstandlastname.click();
    	System.out.println("First and last name field is visible");
    	phonenumber.click();
    	System.out.println("Phonenumber field is visible");
    	address.click();
    	System.out.println("Address field is visible");
    	city.click();
    	System.out.println("City field is visible");
    	state.click();
    	System.out.println("state field is visible");
    	zipcode.click();
    	System.out.println("Zipcode field is visible");
    	addaddress.click();
    	System.out.println("Add Address field is visible");
    }
    
}
