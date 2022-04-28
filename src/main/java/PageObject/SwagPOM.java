package PageObject;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagPOM {
	public WebDriver driver;

	public SwagPOM(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement UserName()
	{
		return driver.findElement(By.xpath("//div[@id='login_credentials']"));
	}

	public WebElement Password()
	{
		return driver.findElement(By.xpath("//div[@class='login_password']"));
	}
	public WebElement UserNameField() {
		return driver.findElement(By.xpath("//div[@class='form_group']/input[@id='user-name']"));
	}
	public WebElement PwdField() {
		return driver.findElement(By.xpath("//div[@class='form_group']/input[@id='password']"));
	}
	public WebElement LoginBtn() {
		return driver.findElement(By.xpath("//input[@id='login-button']"));
	}
	public WebElement PageTitle() {
		return driver.findElement(By.xpath("//div//span[@class='title']"));
	}
	public List<WebElement> productName() {
		return driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
	}
	public List<WebElement> AddCartBtn() {
		return driver.findElements(By.xpath("//div[@class='pricebar']/button[@class='btn btn_primary btn_small btn_inventory']"));
	}
	public WebElement CartBtn() {
		return driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	}
	public WebElement CartProText() {
		return driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
	}
	public WebElement CheckoutBtn() {
		return driver.findElement(By.xpath("//button[@id='checkout']"));
	}
	public WebElement FirstName() {
		return driver.findElement(By.xpath("//div[@class='form_group']/input[@id='first-name']"));
	}
	public WebElement Lastname() {
		return driver.findElement(By.xpath("//input[@id='last-name']"));
	}
	public WebElement PostalCode() {
		return driver.findElement(By.xpath("//input[@id='postal-code']"));
	}
	public WebElement Continue() {
		return driver.findElement(By.xpath("//input[@id='continue']"));
	}
	public WebElement Finishbtn() {
		return driver.findElement(By.xpath("//button[@id='finish']"));
	}
	public WebElement SuccessMsg() {
		return driver.findElement(By.xpath("//h2[@class='complete-header']"));
	}
	public WebElement ErrorMsg() {
		return driver.findElement(By.xpath("//h3[@data-test='error']"));
	}
	public List<WebElement> ProPrice() {
		return driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
	}
	public WebElement Proctname(String name) {
		return driver.findElement(By.xpath("//div[contains(text(),'"+name+"')]"));
	}
	public WebElement priceInd() {
		return driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
	}
	
	
	
	

}
