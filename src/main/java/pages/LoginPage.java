package pages;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	@FindBy(xpath = "//*[name()='path' and contains(@d,'M256 288c7')]")
	WebElement signinlogo;

	@FindBy(xpath = "//a[@class='text-center underline']")
	WebElement SignuptextDonthveacnt;

	@FindBy(xpath = "//div[@class='col-md-6 col-12']//div[1]//div[1]//input[1]")
	WebElement name;

	@FindBy(xpath = "//div[2]//div[1]//input[1]")
	WebElement Email;

	@FindBy(xpath = "//div[3]//div[1]//input[1]")
	WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Sign Up']")
	WebElement signupBTN;
	
	@FindBy(xpath = "(//*[@id='outlined-basic'])[1]")
	WebElement emailsignin;
	
	@FindBy(xpath = "(//*[@id='outlined-basic'])[2]")
	WebElement passwordsignin;
	
	@FindBy(xpath ="//button[normalize-space()='Sign In']")
	
	WebElement signinbutton;
	
	

	public LoginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public String gettile() {

		String titlehome = driver.getTitle();

		return titlehome;
	}

	public void clickonsigninlogo() {

		signinlogo.click();

	}

	public void clickDnthvact() {

		SignuptextDonthveacnt.click();

	}

	public void signup() throws Exception  {
        
		Thread.sleep(1000);
		name.sendKeys("Prashant");
		}
		
	public void sendemail() throws Exception {
	    Thread.sleep(1000);
		Email.sendKeys("elec.prashant@yahoo.com");
		}
		
	public void sendpass() throws Exception {
	    Thread.sleep(1000);
		password.sendKeys("phondekar");
		}
	
	public void signupbtn() {
	   signupBTN.click();
	   }
		
		
	

	public String confirmmsg() {

		String msg = driver.findElement(By.xpath("//*[text()='Email Already Registered']")).getText();

		return msg;
	}

	public void navtologin() {

		signinlogo.click();
	}

	public void userlogin() {

		emailsignin.sendKeys("elec.prashant@yahoo.com");

		passwordsignin.sendKeys("pbhondekar");
	}
	
	public void clickonsignin() {
		
		signinbutton.click();
	}
	
	public String loginsuccesful() {
		
		
		String titalactual = driver.getTitle();
		
		return titalactual;
	}

}

