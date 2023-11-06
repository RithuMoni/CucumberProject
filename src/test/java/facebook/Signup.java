package facebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	BaseClass ba=new BaseClass();
	
	public Signup()
	{
	PageFactory.initElements(ba.driver, this);
	}
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement  username;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname ;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='reg_email__']")
private WebElement Email;
	
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")
	private WebElement mail;
	
	@FindBy(xpath="//input[@id='password_step_input']")
	private WebElement password;
	
	
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getMail() {
		return mail;
	}
	public WebElement getPassword() {
		return password;
	}
	
	/*@FindBy(id="day")
	private WebElement selectbyvalue;
	
	@FindBy(id="month")
	private WebElement select;
	
	@FindBy(id="year")
	private WebElement index;
	
	@FindBy(xpath="//*[text()='Female']")
	private WebElement gender;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement submit/*
	

	/*public WebElement getSelectbyvalue() {
		return selectbyvalue;
	}
	public WebElement getSelect() {
		return select;
	}
	public WebElement getIndex() {
		return index;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getSubmit() {
		return submit;
	}*/

	
	



}
