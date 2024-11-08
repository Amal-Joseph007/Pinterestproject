package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[1]/div/div[2]/div[3]/button/div/div")
	WebElement signupclick;
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement signupemail;
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement signuppassword;
	@FindBy(xpath = "//*[@id=\"birthdate\"]")
	WebElement signupdate;
	@FindBy(xpath = "//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div[2]/div/div/div/div/div[1]/div[5]/div/div[1]/form/div[8]/button/div/div/div")
	WebElement crbutton;
	public Signup(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signupp()
	{
		signupclick.click();
	}

	public void signupvalues()
	{
		signupemail.sendKeys("rogthor7447@gmail.com");
		signuppassword.sendKeys("amal12345678");
		signupdate.sendKeys("31-01-2004");
	}
	public void createaccountclick()
	{
		crbutton.click();
	}

}
