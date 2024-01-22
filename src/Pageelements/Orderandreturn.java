package Pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.AbstractMethods;

public class Orderandreturn extends AbstractMethods{
	WebDriver driver;

	public Orderandreturn(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (xpath = "//input[@id='searchOrdersInput']")
	WebElement orderinput;
	
	@FindBy (xpath = "//body/div[@id='a-page']/section[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/span[1]/span[1]/input[1]")
	WebElement searchbutton;
	
	@FindBy (xpath = "//li[contains(text(),'Orders')]")
	WebElement orders;
	
	@FindBy (xpath = "//body/div[@id='a-page']/section[1]/div[1]/div[3]/ul[1]/li[2]/a[1]")
	WebElement buyagain;
	
	@FindBy (xpath = "//span[contains(text(),'Cancelled Orders')]")
	WebElement cancelledorder;
	
	@FindBy (xpath = "//span[contains(text(),'Not Yet Shipped')]")
	WebElement notshipped;
	
	@FindBy (xpath = "//a[contains(text(),'Digital Orders')]")
	WebElement digitalorder;
	
	
	public void Orderandreturn() {
		implicitlywaitmethod();
		orderinput.click();
		System.out.println("order option is shown");
		searchbutton.click();
		System.out.println("searchbutton is able to click");
		buyagain.click();
		System.out.println("buy again option is visible");
		cancelledorder.click();
		System.out.println("cancel order option is visible");
		notshipped.click();
		System.out.println("not shipped option is visible");
		digitalorder.click();
		System.out.print("digital order option is visible");
	}

}
