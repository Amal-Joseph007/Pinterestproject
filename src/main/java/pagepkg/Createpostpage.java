package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createpostpage {

	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"HeaderContent\"]/div/div/div[2]/div/div/div/div[4]/div/a/div/div")
	WebElement create;
	@FindBy(xpath = "//*[@id=\"storyboard-upload-input\"]")
	WebElement photoupclick;
	@FindBy(xpath = "//*[@id=\"storyboard-selector-title\"]")
	WebElement posttitle;
	@FindBy(xpath = "//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div/div/div/div[2]/div[3]/div/div/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/div")
	WebElement postdiscription;
	@FindBy(xpath = "//*[@id=\"WebsiteField\"]")
	WebElement postlink;
	@FindBy(xpath = "//*[@id=\"storyboard-selector-interest-tags\"]")
	WebElement posttags;
	@FindBy(xpath = "//*[@id=\"HeaderContent\"]/div/div/div[2]/div/div/div/div[2]/a/div/div")
	WebElement homeclick;
	
	
	public Createpostpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createclick()
	{
		create.click();
	}
	public void photoupload(String filepath)
	{
		photoupclick.sendKeys(filepath);
	}
	public void createpostvalues()
	{
		posttitle.sendKeys("Mobile wallpapper");
//		postdiscription.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//		postlink.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//		posttags.sendKeys("wallpapper");
	}
	public void clickhome()
	{
		homeclick.click();
	}
}
