package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static WebDriver driver;
	

	@Given("user need to launch the URL browser")
	public void user_need_to_launch_the_URL_browser() {
		WebDriverManager.firefoxdriver().setup();
	    driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com/");
	    
	}

	@When("user enter the username")
	public void user_enter_the_username() {
	    driver.findElement(By.id("email")).sendKeys("abd@gmail.com");
	}

	@When("user enter the password")
	public void user_enter_the_password() {
	    driver.findElement(By.id("pass")).sendKeys("pass123");
	}

	@Then("user need to click the login button to be successful")
	public void user_need_to_click_the_login_button_to_be_successful() {
	    driver.findElement(By.name("login")).submit();
	    WebElement close=driver.findElement(By.xpath("//button[text()='Yes, Continue']"));
	    close.click();
	}



}
