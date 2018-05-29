package stepDefiniations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;

	@When("^user need to enter the url$")
	public void user_need_to_enter_the_url() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		 //driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.southwest.com/");

	}

	@Then("^user will be on homepage$")
	public void user_will_be_on_homepage() {
		String htitle = driver.getTitle();
		System.out.println(htitle);

	}

	@Then("^user enter the \"([^\"]*)\"  and \"([^\"]*)\" field$")
	public void user_enter_the_required_field(String from,String to) {
		driver.findElement(By.id("trip-type-one-way")).click();
		driver.findElement(By.id("air-city-departure")).sendKeys(from);
		driver.findElement(By.id("air-city-arrival")).sendKeys(to);
		driver.findElement(By.id("air-date-departure")).sendKeys("03/30");
	}

	@Then("^users clicks on searchbutton$")
	public void users_clicks_on_searchbutton() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Then("^user shloud move to another page$")
	public void user_shloud_move_to_another_page() {
		System.out.println(driver.getTitle());
	}

	
	@Then("^user need to close the app$")
	public void user_need_to_close_the_app(){
		driver.quit();
	   
	}
}
