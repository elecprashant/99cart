package execution;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import qa.DriverFactory;

public class SignupSteps {

	//public static WebDriver driver;
	LoginPage pge = new LoginPage(DriverFactory.getDriver());

	@Given("Open the browser")
	public void open_the_browser() {
       System.out.println("Browser ");
	}

	@Given("Enter the Url")
	public void enter_the_url() {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.99bookscart.com/");
	}

	@Given("Create new user")
	public void create_new_user() {
		
        pge.clickonsigninlogo();
        pge.clickDnthvact();
	}

	@Given("Enter the valid personal details and click signup")
	public void enter_the_valid_personal_details() throws Exception {
		System.out.println("STAR SIGNUP");
        pge.signup();
        pge.sendemail();
        pge.sendpass();
        pge.signupbtn();;
	}

	
	@Then("registration succesful {string} msg validate")
	public void registration_succesful_msg_validate(String msgfromfeat) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Asstertion Start");
		
		String systemmsg = pge.confirmmsg();
		
		boolean ispresent = systemmsg.contains(msgfromfeat);

        Assert.assertTrue(ispresent);
		
        System.out.println("code execute");

	}

	@When("the user navigates to the login page")
	public void the_user_navigates_to_the_login_page() {

		//driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M256 288c7')]")).click();
         pge.navtologin();
	}

	@When("the user enters valid login credentials")
	public void the_user_enters_valid_login_credentials() throws Exception {
		Thread.sleep(3000);
		pge.userlogin();
		
		pge.clickonsignin();
		
	}

	@Then("the user logged in successfully")
	public void the_user_should_be_logged_in_successfully() throws Exception {
		
		Thread.sleep(2000);
		
		String Acttitle = pge.loginsuccesful();
		
	    String expected = "99bookscart";
		
		System.out.println(Acttitle);
		
		boolean exp  = Acttitle.contains(expected);
		
		Assert.assertTrue(exp);
		
	}

}
	
	

