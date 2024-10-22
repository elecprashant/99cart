package execution;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddtocartPage;
import qa.DriverFactory;

public class AddtocartSteps {

	AddtocartPage add = new AddtocartPage(DriverFactory.getDriver());

	@Given("the user is logged in")
	public void the_user_is_logged_in() {

		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.99bookscart.com/");
	}

	@When("the user searches for {string} and adds it to the cart")
	public void the_user_searches_for_and_adds_it_to_the_cart(String book1) throws Exception {

		add.searchbooks(book1);

	}

	@When("the user checks the cart total")
	public void the_user_checks_the_cart_total() throws Exception {
		add.carticonclick();
	}

	
	@Then("the total price should be {double}")
	public void the_total_price_should_be_(Double exptotal) throws InterruptedException {
		 
		double act = add.checktotalcartprice();
		
		assertEquals(act, exptotal);
		
	}

	@When("the user add {string} priced at {double}")
	public void the_user_add_priced_at(String book2, Double double1) throws Exception {
		
		add.addbook6(book2);	
	}
	
	@Then("the total price {double}")
	public void the_total_price(Double exptotal2) throws InterruptedException {
        double act = add.checktotalfinalcartprice();
        System.out.println(act);
		
		assertEquals(act, exptotal2);
		
		System.out.println("FINAL ASSERTION");  
	}
}
