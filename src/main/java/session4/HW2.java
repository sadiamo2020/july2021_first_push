package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class HW2 {
	
		WebDriver driver;

		@Before
		public void init() {

			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.techfios.com/billing/?ng=login/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

		@Test
		public void login() {
			String Country ="Bahamas";

			By userNameField = By.xpath("//input[@id='username']");
			By passwordField = By.xpath("//input[@id='password']");
			By signinButtonField = By.xpath("//button[@type='submit']");
			By dashBoardHearderField = By.xpath("//h2[contains(text(),'Dashboard')]");
			By customerField = By.xpath("//span[contains(text(),'Customers')]");
			By addCustomerField = By.xpath("//a[contains(text(),'Add Customer')]");
			
			By contactsField = By.xpath("//h2[@style='color: #2F4050; font-size: 16px; font-weight: 400; margin-top: 18px'])");
			By fullNameField = By.xpath("//input[@id='account']");
			By companyField = By.xpath("//select[@id='cid']");
			By emailField = By.xpath("//input[@id='email']");
			By phoneField = By.xpath("//input[@id='phone']");
			By addressField = By.xpath("//input[@id='address']");
			By cityField = By.xpath("//input[@id='city']");
			By stateField = By.xpath("//input[@id='state']");
			By zipCodeField = By.xpath("//input[@id='zip']");
			By countryField = By.xpath("//select[@id='country']");
			By saveButton =By.xpath("//button[@id='submit']");
			
			
			
			
			driver.findElement(userNameField).sendKeys("demo@techfios.com");
			driver.findElement(passwordField).sendKeys("abc123");
			driver.findElement(signinButtonField).click();
			Assert.assertTrue("wrong page", driver.findElement(dashBoardHearderField).isDisplayed());
			driver.findElement(customerField).click();
			driver.findElement(addCustomerField).click();
			driver.findElement(fullNameField).sendKeys("Sara 123");
			
			Select sel = new Select(driver.findElement(companyField));
			sel.selectByVisibleText("Techfios");
			driver.findElement(emailField).sendKeys("sara17@gmail.com");
			driver.findElement(phoneField).sendKeys("97456457587");
			driver.findElement(addressField).sendKeys("987 Parklane");
			driver.findElement(cityField).sendKeys("dallas");
			driver.findElement(stateField).sendKeys("texas");
			driver.findElement(zipCodeField).sendKeys("74653");
			driver.findElement(countryField).sendKeys(Country);
			driver.findElement(saveButton).click();
			
		}
			
}

