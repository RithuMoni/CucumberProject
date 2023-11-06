package makemytrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import facebook.BaseClass;
import facebook.Signup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Holiday {
	BaseClass ba=new BaseClass();
	Signup si=new Signup();

	
	
	

	@Given("users  need to launch the browser")
	/*public void users_need_to_launch_the_browser() {
	    ba.browserLaunch();
	    
	   
	    
	    
	    
	}*/

	@When("user enters the username")
	public void user_enters_the_username() throws InterruptedException {
		//WebElement create=ba.driver.findElement(By.xpath("//a[text()='Create new account']"));
		ba.button(si.getUsername(), 0);
		
		//WebElement name=ba.driver.findElement(By.xpath("//*[@name='firstname']"));
		ba.button(si.getFirstname(), 0);
				ba.sendText(si.getFirstname(),"moni");
				
	    //WebElement last=ba.driver.findElement(By.xpath("//input[@name='lastname']"));
	    		
	    		ba.button(si.getLastname(), 0);
	    		ba.sendText(si.getLastname(),"veera");
	}
	@When("usr enters the email")
	public void usr_enters_the_email() {
		//WebElement Email=ba.driver.findElement(By.xpath("//input[@name='reg_email__']"));
	   ba.button(si.getEmail(), 0);
	    ba.sendText(si.getEmail(),"monica@gmail.com");
	    //WebElement mail=ba.driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	ba.button(si.getMail(), 0);
	   ba.sendText(si.getMail(),"monica@gmail.com");
	}
	
	

	@When("user enters the password")
	public void user_enters_the_password() {
		//WebElement password=ba.driver.findElement(By.xpath("//input[@id='password_step_input']"));		
		ba.button(si.getPassword());
		ba.sendText(si.getPassword(), "monica123");
	}
	    

	/*@When("user selects a dateofbirth")
	public void user_selects_a_dateofbirth() {
	    //WebElement day=ba.driver.findElement(By.id("day"));
	   ba.selectbyvalue(si.getSelectbyvalue(),"14");
	   // WebElement month=ba.driver.findElement(By.id("month"));
	   ba.selectbytext(month, "Feb");
	   //WebElement year= ba.driver.findElement(By.id("year"));
	 ba.selectbyindex(si.getIndex(), "1990");
	}

	@When("user selects a gender")
	public void user_selects_a_gender() {
	    //WebElement gender=ba.driver.findElement(By.xpath("//*[text()='Female']"));
	   ba.button(si.getGender(),0);
	}

	@Then("user needs to click a a signup")
	public void user_needs_to_click_a_a_signup() {
	   
		//WebElement close=ba.driver.findElement(By.xpath("//button[@name='websubmit']"));
	   ba.button(si.getSubmit(),0);
	}*/


	
	



}
