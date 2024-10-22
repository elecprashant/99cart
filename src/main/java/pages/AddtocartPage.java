package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
	
	WebDriver driver;
	@FindBy(xpath = "//a[@name='search']//*[name()='svg']")
	WebElement searchicon;

	@FindBy(xpath = "//input[@placeholder='Title,Author & ISBN']")
	WebElement searchbar;

	@FindBy(xpath = "//div[@class='product-grid-size col-lg-1.5 col-md-4 col-sm-6 col-4']//button[@type='button'][normalize-space()='Add']")
	WebElement book1result;
	
	@FindBy(xpath = "//div[@class='product-grid-size col-lg-1.5 col-md-4 col-sm-6 col-4']//button[@type='button'][normalize-space()='Add']")
	WebElement book1cart;
	
	@FindBy(xpath = "//body/div[@id='mainroot']/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/button[1]")
	WebElement redsearch;

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
	
	@FindBy(xpath ="//a[@name='cart']//*[name()='svg']//*[name()='path' and contains(@d,'M528.12 30')]")
	
	WebElement carticon;
	
    @FindBy(xpath ="(//*[@class='cart-productPrice'])[9]")    	
	WebElement carttotalprice;
    
    @FindBy(xpath ="(//*[@class='cart-productPrice'])[10]")    	
	WebElement finalcarttotalprice;
	public AddtocartPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this); 
		
	}
	
	public void searchbooks(String book1) throws Exception {
		
		searchicon.click();	
		searchbar.click();
		searchbar.sendKeys(book1);
		Thread.sleep(2000);
		redsearch.click();
		Thread.sleep(5000);	
		book1cart.click();	
	}
	
	public void carticonclick() throws Exception {
		Thread.sleep(2000);
		carticon.click();
	}
	
	public double checktotalcartprice() throws InterruptedException {
		Thread.sleep(3000);
		Double cartTotal = Double.parseDouble(carttotalprice.getText().replace("₹",""));
		
		return cartTotal;
	}
    
	public void addbook6(String book2) throws Exception {
		Thread.sleep(3000);
		searchicon.click();	
		Thread.sleep(2000);
		searchbar.click();
		Thread.sleep(2000);
		searchbar.sendKeys(book2);
		Thread.sleep(2000);
		redsearch.click();
		Thread.sleep(2000);
		book1cart.click();
		Thread.sleep(3000);
		carticon.click();
		Thread.sleep(3000);
		
				
	}
	public double checktotalfinalcartprice() throws InterruptedException {
		Thread.sleep(5000);
		Double cartTotal2 = Double.parseDouble(finalcarttotalprice.getText().replaceAll("[₹]", ""));
		
		return cartTotal2;
	}
}
