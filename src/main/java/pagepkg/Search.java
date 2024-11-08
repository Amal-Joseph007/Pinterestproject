package pagepkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
WebDriver driver;
@FindBy(xpath = "//*[@id=\"searchBoxContainer\"]/div/div/div[2]/input")
WebElement searchfield;
@FindBy(xpath = "//*[@id=\"SuggestionGroup-Option-0-0\"]/a/div/div/div/div")
WebElement searchclick;

public Search(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void searchh()
{
	searchfield.sendKeys("wallpapper",Keys.ENTER);
	//searchclick.click();
}
}
