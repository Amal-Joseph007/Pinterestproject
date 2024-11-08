package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"HeaderContent\"]/div/div/div[2]/div/div/div/div[6]/div[5]/div/div/button/div/div")
	WebElement logoutdropdown;
	@FindBy(xpath = "//*[@id=\"HeaderAccountOptionsFlyout-item-13\"]/div/div/div[1]")
	WebElement logoutbutton;
	public Logout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void logoutt()
	{
		logoutdropdown.click();
	}
	public void logoutclick()
	{
		logoutbutton.click();
	}
}
