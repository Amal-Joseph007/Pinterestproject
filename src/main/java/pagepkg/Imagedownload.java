package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Imagedownload {
WebDriver driver;
@FindBy(xpath = "//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div/div[1]/a/div/div[1]/div/div/div/div/div/img")
WebElement image;
@FindBy(xpath = "//*[@id=\"gradient\"]/div/div/div[2]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div/div[1]/div[1]/div/div/div/div/div")
WebElement like;
@FindBy(xpath = "//*[@id=\"gradient\"]/div/div/div[2]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div/div/button/div/div/svg")
WebElement share;
@FindBy(xpath = "//*[@id=\"gradient\"]/div/div/div[2]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div/div[3]/div/div/div/div/div/div/div/div/div/button/div/div")
WebElement downloadimage;
@FindBy(xpath = "//*[@id=\"pin-action-dropdown-item-0\"]/div/div/div[1]/div/div/span")
WebElement dimage;
@FindBy(xpath = "//*[@id=\"gradient\"]/div/div/div[2]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/div/div/div/div[2]/button/div")
WebElement save;
@FindBy(xpath = "//*[@id=\"gradient\"]/div/div/div[2]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div/div[1]/div/div[1]/a/div/div/div/div/div[1]/div/img")
WebElement uploaderprofile;
@FindBy(xpath = "//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div/div/div/div[1]/div/div/div[4]/div/div/div[2]/div/div[2]/div/div/button/div")
WebElement follow;
public Imagedownload(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void imgagedetails()
{
	image.click();
	
	
}
public void downloadimagee()
{
	downloadimage.click();
	dimage.click();
	save.click();
	like.click();
	
	
	
	
}
//public void imagesave()
//{
//	
//}
//public void uploaderprofilee()
//{
//	
//	uploaderprofile.click();
//	follow.click();
//}
//public void like()
//{
//	
//}


	



}
