package AddDealStepDefiniations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealsPage {
	
	WebDriver driver;
	
	@When("^the user opens the browser and enter url$")
	public void the_user_opens_the_browser_and_enter_url()  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/");
	   
	}

	@Then("^the user should be on homepage$")
	public void the_user_should_be_on_homepage()  {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
	    
	}

	@Then("^the user enters username and password$")
	public void the_user_enters_username_and_password(DataTable arg1)  {
		for(Map<String, String> details : arg1.asMaps(String.class, String.class)){
		driver.findElement(By.name("username")).sendKeys(details.get("username"));
		driver.findElement(By.name("password")).sendKeys(details.get("password"));
	    
	}
	}

	@Then("^user clicks on loginbutton$")
	public void user_clicks_on_loginbutton()  {
		
WebElement locator=driver.findElement(By.xpath("//input[@class='btn btn-small']"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", locator);
		
	  
	}

	@Then("^user clicks on addcontacts button$")
	public void user_clicks_on_addcontacts_button()  {
		driver.switchTo().frame("mainpanel");
		WebElement moveto = driver.findElement(By.xpath("//a[@title='Contacts']"));

		Actions action = new Actions(driver);

		action.moveToElement(moveto).build().perform();
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
	   
	}

	@Then("^user enters all required info$")
	public void user_enters_all_required_info(DataTable arg2) throws Exception {
		
		
		Thread.sleep(3000);
	for(	Map<String,String > values : arg2.asMaps(String.class, String.class)){
		Thread.sleep(3000);
		
     driver.findElement(By.xpath("//*[@id='contactForm']/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/select")).sendKeys(values.get("Title"));
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(values.get("Name"));
		driver.findElement(By.xpath("//input[@id='surname']")).sendKeys(values.get("surname"));
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys(values.get("department"));
		driver.findElement(By.xpath("//*[@id='contactForm']/table/tbody/tr[1]/td/input[2]")).click();
		
		
		Thread.sleep(3000);
		
		//driver.switchTo().frame("mainpanel");
		WebElement moveto = driver.findElement(By.xpath("//a[@title='Contacts']"));

		Actions action = new Actions(driver);
		action.moveToElement(moveto).build().perform();
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
		
	}
	}

	@Then("^user closes the browser$")
	public void user_closes_the_browser()  {
		
		driver.quit();
	 
	}


}
