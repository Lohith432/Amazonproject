package Pageelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.AbstractMethods;

public class Signin extends AbstractMethods{
	WebDriver driver;

	public Signin(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
     @FindBy (xpath = "//input[@id='ap_email']")
     WebElement email;
     
     @FindBy (xpath = "//input[@id='continue']")
     WebElement continu;
     
     @FindBy (xpath = "//a[@id='auth-fpp-link-bottom']")
     WebElement forgetpassword;
     
     @FindBy (xpath = "//input[@id='ap_password']")
     WebElement password;
     
     @FindBy (xpath = "//input[@id='signInSubmit']")
     WebElement submit;
     
     
      public void Signin () {
    	  implicitlywaitmethod();
    	  email.sendKeys("nanilohith4444@gmail.com");
    	  System.out.println("User is able to enter email");
    	  continu.click();
    	  System.out.println("User is able to click continue button");
    	  forgetpassword.sendKeys();
    	  System.out.println("forget password is visible");
    	  password.sendKeys("nanijaya");
    	  System.out.println("User is entered password succesfully");
    	  submit.sendKeys(Keys.ENTER);
      }
}
    	  