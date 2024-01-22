package Pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.AbstractMethods;

public class Proceedcheckout extends AbstractMethods{
	WebDriver driver;

	public Proceedcheckout(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
       @FindBy (xpath = "//body/div[@id='Proceed_to_checkout']/div[1]/div[4]/div[4]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/span[1]/span[1]/span[1]/input[1]")
       WebElement checkout;
       
       @FindBy (xpath = "//body/div[@id='Shipping_address']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]/h3[1]")
       WebElement shippingaddress;
       
       @FindBy (xpath = "//body/div[@id='Add_id_for_customs']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]/h3[1]")
       WebElement idcustoms;
       
       @FindBy (xpath = "//body/div[@id='Payment_method']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]/h3[1]")
       WebElement methodpayment;
       
       
       public void Proceedcheckout() {
    	   implicitlywaitmethod();
    	   checkout.click();
    	   System.out.println("User is able to click on checkout button");
    	   shippingaddress.click();
    	   System.out.println("Shipping address is visible");
    	   idcustoms.click();
    	   System.out.println("Add ID customs is visible");
    	   methodpayment.click();
    	   System.out.println("Payment method option is visible");
       }
       
}
