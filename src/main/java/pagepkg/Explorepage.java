package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Explorepage {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"HeaderContent\"]/div/div/div[2]/div/div/div/div[3]/a/div")
	WebElement explore;
	@FindBy(xpath = "//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/div")
	WebElement exploreoptclick;
	@FindBy(xpath = "//*[@id=\"HeaderContent\"]/div/div/div[2]/div/div/div/div[2]/a/div/div")
	WebElement home;
	public Explorepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void exploreclick()
	{
		explore.click();
	}
	public void exploreclick1()
	{
		exploreoptclick.click();
	}

	public void homeoptclick()
	{
		home.click();
	}

}
