package stepDefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import PageObject.SwagPOM;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import resource.BaseClass;

public class swagTestSD extends BaseClass {
	
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		driver = initializeDriver(); //initialize the browser
		Thread.sleep(2000);

	}

	@And("^Open the Site Url \"([^\"]*)\" for Login$")
	public void open_the_site_url_something_for_login(String url) throws Throwable {
		driver.get(url); //get the url 
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	@When("^User copy the user name and password enters details and log in$")
	public void user_copy_the_user_name_and_password_enters_details_and_log_in() throws Throwable {
		SwagPOM sw = new SwagPOM(driver);
		String username = sw.UserName().getText();//get all user name 
		String[] User = username.split("\n");    // split all user name 
		String pwd = sw.Password().getText();
		String[] password = pwd.split("\n");     //get password
		Thread.sleep(1000);
		sw.UserNameField().sendKeys(User[3]);   //enters the user name
		sw.PwdField().sendKeys(password[1]);    //enters the password
		sw.LoginBtn().click();
	}

	@Then("^verify the user is successfully logged with page title \"([^\"]*)\"$")
	public void verify_the_user_is_successfully_logged_with_page_title_something(String HomepageTitle)
			throws Throwable {
		SwagPOM sw = new SwagPOM(driver);
		System.out.println(sw.PageTitle().getText());
		Assert.assertEquals(HomepageTitle, sw.PageTitle().getText()); // verify the home page title

	}

	@And("^add the product (.+) to cart$")
	public void add_the_product_to_cart(String proname) throws Throwable {
		SwagPOM sw = new SwagPOM(driver);
		Thread.sleep(2000);
		List<WebElement> pro = sw.productName(); 
		for (int j = 0; j < pro.size(); j++) {     //  check the product name and click add to cart button
			List<WebElement> btn = sw.AddCartBtn();
			for (int i = 0; i < btn.size(); i++) {
				Thread.sleep(1000);
				if (pro.get(j).getText().equals(proname)) {
					Thread.sleep(000);
					btn.get(j).click();
					break;
				}
			}
		}

	}

	@And("^go to the cart page and verify that product (.+)$")
	public void go_to_the_cart_page_and_verify_that_product(String proname) throws Throwable {
		SwagPOM sw = new SwagPOM(driver);
		sw.CartBtn().click();
		Assert.assertEquals(proname, sw.CartProText().getText());  // verify the product name 
		Thread.sleep(1000);
	}

	@Then("^checkout the product and enters the (.+) , (.+) and (.+) and click continue$")
	public void checkout_the_product_and_enters_the_and_and_click_continue(String firstname, String lastname,
			String postalcode) throws Throwable {
		SwagPOM sw = new SwagPOM(driver);   // enters the user details   
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		sw.CheckoutBtn().click();
		Thread.sleep(1000);
		sw.FirstName().sendKeys(firstname);
		sw.Lastname().sendKeys(lastname);
		sw.PostalCode().sendKeys(postalcode);
		sw.Continue().click();
	}

	@And("^verify that product and clicks finish$")
	public void verify_that_product_and_clicks_finish() throws Throwable {
		SwagPOM sw = new SwagPOM(driver);
		sw.Finishbtn().click();
	}

	@Then("^verify tha success message \"([^\"]*)\"$")
	public void verify_tha_success_message_something(String msg) throws Throwable {
		SwagPOM sw = new SwagPOM(driver);
		Assert.assertEquals(msg, sw.SuccessMsg().getText());  // verify the success message
	}

	@And("^close the browser$")
	public void close_the_browser() throws Throwable {
		Thread.sleep(1000);
		driver.close();
	}

	@After("@takescreenshot")
	public void killBrowser(Scenario scenario) {
		if (scenario.isFailed()) {
			log.fatal("Some error happened");
			scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
			driver.close();
			driver.quit();
		}
	}

	@And("^Get all the product lists and check the particular product (.+) is available$")
	public void get_all_the_product_lists_and_check_the_particular_product_is_available(String proname)
			throws Throwable {
		SwagPOM sw = new SwagPOM(driver);  // verify the product is displayed or not
		Thread.sleep(1000);
		List<WebElement> Proname = sw.productName();
		for (WebElement orderlist : Proname) {
			if (orderlist.getText().equalsIgnoreCase(proname)) {
				System.out.println("Product Name id Displayed");
				break;

			} else {
				throw new Exception("Product Name is not Displayed");
			}
		}
	}

	@When("^User enters the (.+) and (.+) and clicks login$")
	public void user_enters_the_and_and_clicks_login(String username, String password) throws Throwable {
		SwagPOM sw = new SwagPOM(driver);
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(1000);
		sw.UserNameField().sendKeys(username);
		sw.PwdField().sendKeys(password);
		sw.LoginBtn().click();
	}

	@Then("^verify the error message \"([^\"]*)\"$")
	public void verify_the_error_message_something(String msg) throws Throwable {
		SwagPOM sw = new SwagPOM(driver);
		System.out.println(sw.ErrorMsg().getText());
		Assert.assertTrue(sw.ErrorMsg().getText().contains(msg));  // check the error message
	}

    @And("^get all product price in the list$")
    public void get_all_product_price_in_the_list() throws Throwable {
    	SwagPOM sw = new SwagPOM(driver);
		List<WebElement> price=sw.ProPrice();
		for (WebElement pricelist:price)
		{
			String a= pricelist.getText().replace("$", ""); // remove the dollar symbol
			System.out.println(a);
		}
		
    }
    @Then("^clicks the particular product (.+) and verify that product name and price$")
    public void clicks_the_particular_product_and_verify_that_product_name_and_price(String proname) throws Throwable {
    	SwagPOM sw = new SwagPOM(driver);
    	Thread.sleep(2000);
    	String OutPrice=sw.ProPrice().get(2).getText();
		sw.Proctname(proname).click();
		Assert.assertEquals(OutPrice, sw.priceInd().getText()); // check the price details
		
		
		
    	
    }
    

}
