package Tests;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageelements.Addproduct;
import Pageelements.Captchacharacters;
import Pageelements.Cartbrand;
import Pageelements.Dropdownbox;
import Pageelements.Findlocation;
import Pageelements.Giftcardpage;
import Pageelements.Membershipandsubscription;
import Pageelements.Musiclibrary;
import Pageelements.Orderandreturn;
import Pageelements.Proceedcheckout;
import Pageelements.Productdetailspage;
import Pageelements.Productquantity;
import Pageelements.Recommendeditems;
import Pageelements.Registrypage;
import Pageelements.Removefromcart;
import Pageelements.Scrollupusingarrow;
import Pageelements.Searchbar;
import Pageelements.Selectlanguage;
import Pageelements.Signin;
import Pageelements.Testcasespage;
import Pageelements.Verifycartafterlogin;
import Pageelements.Viewcategory;
import Utilites.Basetest;
import pageelements.Beforecheckout;
import pageelements.Cartpage;

public class Signup {
	WebDriver driver;
	
	public Signin sn;
	public Productdetailspage pd;
	public Cartbrand cb;
	public Findlocation fl;
	public Dropdownbox db;
	public Selectlanguage sl;
	public Viewcategory vc;
	public Recommendeditems ri;
	public Searchbar sb;
	public Addproduct ap;
	public Cartpage cp;
	public Productquantity pq;
	public Removefromcart rc;
	public Registrypage rp;
	public Orderandreturn or;
	public Membershipandsubscription ms;
	public Giftcardpage gc;
	public Verifycartafterlogin vl;
	public Scrollupusingarrow sa;
	public Scrollupusingarrow su;
	public Testcasespage tp;
	public Proceedcheckout pc;
	public Beforecheckout bc;
	public Musiclibrary ml;
	
	
	
	@BeforeTest
	public WebDriver intialsebrowser() {
		
		driver = new ChromeDriver();
		return driver;
	}
	
	/*
	 * public void Launchapplication() throws IOException, InterruptedException {
	 * driver = intialsebrowser(); Thread.sleep(2000);
	 * driver.get("https://www.amazon.com/"); driver.manage().window().maximize();
	 * System.out.println("Home page is successfully visibled"); }
	 */
	 

	public class Signuppage extends Basetest {
		Signin sn;
		@Test(priority=1)
		public void Sginin() throws IOException, InterruptedException {
			driver=intialisebrowser();
			Thread.sleep(2000);
			driver.get("https://www.amazon.com/");
			Signin sn= new Signin(driver);
			sn.Signin();
			
		}
		@Test(priority=2 )
		public void Productdetailspage()throws IOException,
		InterruptedException
		{
			Productdetailspage pd = new Productdetailspage(driver);
			pd.productdetails();
		}
		
		@Test(priority=3)
		public void Cartbrand() throws IOException,
		InterruptedException
		{Cartbrand cb = new Cartbrand(driver);cb.cartbrand();
		}
		
		@Test(priority=4)
		public void Findlocation() throws IOException,
		InterruptedException
		{Findlocation fl = new Findlocation(driver);fl.Findlocation();
		}
		
		@Test(priority=5)
		public void Dropdownbox() throws IOException,
		InterruptedException
		{Dropdownbox db = new Dropdownbox(driver);db.Dropdownbox();
		}
		
		@Test(priority=6)
		public void Selectlanguage() throws IOException,
		InterruptedException
		{Selectlanguage sl = new Selectlanguage(driver);sl.Selectlanguage();
		}
		
		@Test(priority=7)
		public void Viewcategory() throws IOException,
		InterruptedException
		{Viewcategory vc = new Viewcategory(driver);vc.viewcategory();
	    }
		
		@Test(priority=8)
		public void Recommendeditems() throws IOException,
		InterruptedException
		{Recommendeditems ri = new Recommendeditems(driver);ri.Recommendeditems();
		}
		
		@Test(priority=9)
		public void Searchbar() throws IOException,
		InterruptedException
		{Searchbar sb = new Searchbar(driver);sb.Searchbar();
		}
		
		@Test(priority=10)
		public void Addproduct() throws IOException,
		InterruptedException
		{Addproduct ap = new Addproduct(driver);ap.addproductincart();
		}
		
		@Test(priority=11)
		public void Cartpage() throws IOException,
		InterruptedException
		{Cartpage cp = new Cartpage(driver);cp.subCartpage();
		}
		
		@Test(priority=12)
		public void Productquantity() throws IOException,
		InterruptedException
		{Productquantity pq = new Productquantity(driver);pq.quantity();
		}
		
		@Test(priority=13)
		public void Removefromcart() throws IOException,
		InterruptedException
		{Removefrommcart rc = new Removefromcart(driver);rc.Removefromcart();
		}
		
		@Test(priority=14)
		public void Registrypage() throws IOException,
		InterruptedException
		{Registrypage rp = new Registrypage(driver);rp.Registrypage();
		}
		
		@Test(priority=15)
		public void Orderandreturn() throws IOException,
		InterruptedException
		{Orderandreturn or = new Orderandreturn(driver);or.Orderandreturn();
		}
		
		@Test(priority=16)
		public void Membershipandsubscription() throws IOException,
		InterruptedException
		{Pageelements.Membershipandsubscription ms = new Membershipandsubscription(driver);ms.Membershipandsubscription();
		}
		
		@Test(priority=17)
		public void Giftcardpage() throws IOException,
		InterruptedException
		{Giftcardpage gc = new Giftcardpage(driver);gc.Giftcardpage();
		}
		
		@Test(priority=18)
		public void Verifycartafterlogin() throws IOException,
		InterruptedException
		{Verifycartafterlogin vl = new Verifycartafterlogin(driver);vl.cartafterlogin();
		}
		
		@Test(priority=19)
		public void Scrollupusingarrow() throws IOException,
		InterruptedException
		{Scrollupusingarrow sa = new Scrollupusingarrow(driver);sa.usingarrow();
		}
		
		@Test(priority=20)
		public void Scrollupwithoutarrow() throws IOException,
		InterruptedException
		{Scrollupwithoutarrow su = new Scrollupwithoutarrow(driver);su.Scrollupwithoutarrow();
		}
		
		@Test(priority=21)
		public void Testcasespage() throws IOException,
		InterruptedException
		{Testcasespage tp = new Testcasespage(driver);tp.testcase();
		}
		
		@Test(priority=22)
		public void Proceedcheckout() throws IOException,
		InterruptedException
		{Proccedcheckout pc = new Proccedcheckout(driver);pc.Proccedcheckout();
		}
		
		@Test(priority=23)
		public void Beforecheckout() throws IOException,
		InterruptedException
		{Beforecheckout bc = new Beforecheckout(driver);bc.beforecheckout();
		}
		
		@Test(priority=24)
		public void Musiclibrary() throws IOException,
		InterruptedException
		{Musiclibrary ml = new Musiclibrary(driver);ml.Musiclibrary();
		
		}
		
		
		@AfterClass
		public void closebrowser() {
			driver.quit();
		}
		}
		}
		


