package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[1]/div/div[2]/div[2]/button/div/div")
	WebElement loginclick;
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement loginemail;
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement loginpassword;
	@FindBy(xpath = "//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div[2]/div/div/div/div/div/div[4]/div[1]/form/div[7]/button/div/div/div")
	WebElement loginbutton;
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void loginn()
	{
		loginclick.click();
	}
	
	public void values()
	{
		loginemail.sendKeys("rogthor7447@gmail.com");
		loginpassword.sendKeys("amal12345678");
	}
	public void loginbuttonclick()
	{
		loginbutton.click();
	}
}
