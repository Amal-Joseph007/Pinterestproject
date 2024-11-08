package pagepkg;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Profilepage {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"HeaderContent\"]/div/div/div[2]/div/div/div/div[6]/div[4]/div/div/div/a/div/div")
	WebElement profile;
	@FindBy(xpath = "//*[@id=\"_created-profile-tab\"]/a/div/div")
	WebElement createdpost;
	@FindBy(xpath = "//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div/div/div/div[1]/div/div/div[4]/div/div/div[2]/div/div/div/button/div")
	WebElement editpr;
	@FindBy(xpath = "//*[@id=\"first_name\"]")
	WebElement fname;
	@FindBy(xpath = "//*[@id=\"last_name\"]")
	WebElement lname;
	@FindBy(xpath = "//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/button/div")
	WebElement profilesave;
	@FindBy(xpath = "//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/button/div")
	WebElement changeprofile;
	@FindBy(xpath = "/html/body/div[5]/div/div/div/div[2]/div/div[2]/form/div/div/button/div")
	WebElement choosephoto;
	
	public Profilepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void userprofile()
	{
		profile.click();
	}
	public void createdpostt()
	{
		createdpost.click();
	}
	public void editprofile()
	{
		editpr.click();
			}
	public void editprofilevalues()
	{
		
		fname.sendKeys(Keys.CONTROL + "a"); 
		fname.sendKeys(Keys.BACK_SPACE);

		lname.sendKeys(Keys.CONTROL + "a"); 
		lname.sendKeys(Keys.BACK_SPACE); 
		

	}
	public void givenvalues()
	{
		fname.sendKeys("rogx");
		lname.sendKeys("kratos");
		
	}
	public void changephoto()
	{
		changeprofile.click();
		choosephoto.click();
		
	}
	public void savepr()
	{
		profilesave.click();
	}
	
}
