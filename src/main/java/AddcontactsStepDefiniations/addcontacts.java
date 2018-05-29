package AddcontactsStepDefiniations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class addcontacts {

	WebDriver driver;

	@When("^the user opens the browser and enter url$")
	public void the_user_opens_the_browser_and_enter_url() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/");

	}

	@Then("^the user should be on homepage$")
	public void the_user_should_be_on_homepage() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);

	}

	@Then("^the user enters username and password$")
	public void the_user_enters_username_and_password(DataTable data) {
		List<List<String>> details = data.raw();
		driver.findElement(By.name("username")).sendKeys(details.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(details.get(0).get(1));

	}

	@Then("^user clicks on loginbutton$")
	public void user_clicks_on_loginbutton() {
		WebElement locator=driver.findElement(By.xpath("//input[@class='btn btn-small']"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", locator);
		
		
	}

	@Then("^user clicks on addcontacts button$")
	public void user_clicks_on_addcontacts_button() {
		driver.switchTo().frame("mainpanel");
		WebElement moveto = driver.findElement(By.xpath("//a[@title='Contacts']"));

		Actions action = new Actions(driver);

		action.moveToElement(moveto).build().perform();
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();

	}

	@Then("^user enters all required info$")
	public void user_enters_all_required_info(DataTable info) throws Exception  {

		List<List<String>> values = info.raw();
	
		Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id='contactForm']/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/select")).sendKeys("Mrs");
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(values.get(0).get(0));
		driver.findElement(By.xpath("//input[@id='surname']")).sendKeys(values.get(0).get(1));
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys(values.get(0).get(2));
		driver.findElement(By.xpath("//*[@id='contactForm']/table/tbody/tr[1]/td/input[2]")).click();
		
	}
	
	@Then("^user closes the browser$")
	public void user_closes_the_browser() {

		driver.quit();

	}

}
