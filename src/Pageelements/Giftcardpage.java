package Pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.AbstractMethods;

public class Giftcardpage extends AbstractMethods{
	WebDriver driver;

	public Giftcardpage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (xpath = "//header/div[@id='navbar']/div[@id='nav-main']/div[2]/div[2]/div[1]/a[4]")
	WebElement giftpage;
	
	@FindBy (xpath = "//a[contains(text(),'Amazon Gift Cards')]")
	WebElement amazongifts;
	
	@FindBy (xpath = "//a[contains(text(),'Specialty Gift Cards')]")
	WebElement specialgifts;
	
	@FindBy (xpath = "//a[contains(text(),'Redeem Amazon gift cards')]")
	WebElement redeemgift;
	
	@FindBy (xpath = "//a[contains(text(),'View your balance')]")
	WebElement balanceview;
	
	@FindBy (xpath = "//a[contains(text(),'Amazon Reload')]")
	WebElement reload;
	
	public void Giftcardpage() {
		implicitlywaitmethod();
		giftpage.click();
		System.out.println("User is able to open gift page");
		amazongifts.click();
		System.out.println("Amazon gift option is visible");
		specialgifts.click();
		System.out.println("Special gift option is visible");
		redeemgift.click();
		System.out.println("Redeem gift option is visible");
		balanceview.click();
		System.out.println("Balance view option is visible");
		reload.click();
		System.out.println("Amazon reload option is visible");
	}
}
