package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Notificationandmessagepage {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"HeaderContent\"]/div/div/div[2]/div/div/div/div[6]/div[1]/div/div/div/div/div")
	WebElement notification;
	@FindBy(xpath = "//*[@id=\"5395806256564857882\"]/div/div/div/div/a/div")
	WebElement notification1;
	@FindBy(xpath = "//*[@id=\"HeaderContent\"]/div/div/div[2]/div/div/div/div[6]/div[3]/div/div/div/div/div/div")
	WebElement message;
	
	public Notificationandmessagepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void notifications()
	{
		notification.click();
		
	}
	public void insidenotification()
	{
		notification1.click();
	}
	public void messageclick()
	{
		message.click();
	}

}
