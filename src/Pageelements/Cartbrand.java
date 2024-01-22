package Pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Cartbrand extends AbstractMethods {
	WebDriver driver;

	public Cartbrand(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/products']")
	WebElement products;

	@FindBy(xpath = "//a[@href='/brand_products/Whoop']")
	public WebElement whoop;

	@FindBy(xpath = "//a[@href='/brand_products/Laptop']")
	public WebElement laptop;

	public void cartbrand() {
		implicitlywaitmethod();
		products.click();
		System.out.println("Brands are visible on left side bar");
		whoop.click();
		System.out.println("user is navigated to brand page and brand products are displayed");
		laptop.click();
		System.out.println("user is navigated to that brand page and can see products");

	}
}
