package Pageelements;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Addproduct extends AbstractMethods {
	WebDriver driver;

	public Addproduct(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/products']")
	WebElement products;

	@FindBy(xpath = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]/div[1]/img[1]")
	WebElement firstproduct;

	@FindBy(xpath = "//button[@id='a-autoid-1-announce']")
	WebElement addtocart1;

	@FindBy(xpath = "//button[text()='Continue Shopping']")
	WebElement continueshopping;

	@FindBy(xpath = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]/div[1]/img[1]")
	WebElement secondproduct;

	@FindBy(xpath = "//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='similarities_feature_div']/div[@id='sims-consolidated-1_feature_div']/div[@id='sims-consolidated-1_feature_div']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/span[1]/span[1]/input[1]")
	WebElement cartbtn2;

	@FindBy(xpath = "//body/div[@id='a-page']/div[@id='sw-full-view-container']/div[@id='sw-full-view']/div[@id='sw-atc-confirmation']/div[@id='sw-atc-actions']/div[@id='sw-atc-buy-box']/span[@id='sw-gtc']/span[1]/a[1]")
	WebElement viewcart;

	public void addcart() {
		implicitlywaitmethod();
		products.click();
	}

	public void addproductincart() {
		
		 Actions actions = new Actions(driver);
		 actions.moveToElement(firstproduct).perform();
		 addtocart1.click();
		 continueshopping.click();
		 actions.moveToElement(secondproduct).perform();
		 cartbtn2.click();
		 viewcart.click();
		System.out.println("Verify their prices, quantity and total price");
	}

}
