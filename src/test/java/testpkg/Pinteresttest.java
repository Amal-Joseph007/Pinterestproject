package testpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import javax.management.Notification;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Createpostpage;
import pagepkg.Explorepage;
import pagepkg.Imagedownload;
import pagepkg.Login;
import pagepkg.Logout;
import pagepkg.Notificationandmessagepage;
import pagepkg.Profilepage;
import pagepkg.Search;


public class Pinteresttest extends Baseclass {
	@Test(priority = 1)
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="Pinterest - India";
		System.out.println("Actualtitle="+actualtitle);
		System.out.println("Expectedtitlt="+expectedtitle);
		Assert.assertEquals(actualtitle, expectedtitle,"title verification");
		System.out.println("verified");
		
		
	}
	
	@Test(priority = 2)
	public void lvalues()
	{
		Login ob=new Login(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ob.loginn();
		ob.values();
		ob.loginbuttonclick();
	}
	@Test(priority = 3)
	public void schfunction() throws InterruptedException
	{
		Search ob1=new Search(driver);
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		try {
		ob1.searchh();
		}
		catch (StaleElementReferenceException e) {
			ob1.searchh();
			Thread.sleep(4000);
		}
		
		driver.navigate().back();
		//Thread.sleep(2000);
	}
	@Test(priority = 4)
	public void imgdwnld() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Imagedownload ob2=new Imagedownload(driver);
		ob2.imgagedetails();
		Thread.sleep(2000);
		ob2.downloadimagee();
		//ob2.imagesave();
		//ob2.uploaderprofilee();
		//driver.navigate().back();
		//ob2.like();
		driver.navigate().back();
		Thread.sleep(3000);
		
	}
	@Test(priority = 5)
	public void exploreOption() throws InterruptedException {
	    Explorepage ob3 = new Explorepage(driver);
	    ob3.exploreclick();
	    Thread.sleep(3000);
	    ob3.exploreclick1();	    
	    Thread.sleep(5000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
	    ob3.homeoptclick();
	    Thread.sleep(3000);
	   
	}
	@Test(priority = 6)
	public void createpostoption() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Createpostpage ob4=new Createpostpage(driver);
		ob4.createclick();
		String filepath="C:\\testdata\\Funny Silly Face wallpaper by jackvandewalle - Download on ZEDGE™ _ ce11.jpg";
		ob4.photoupload(filepath);
		Thread.sleep(3000);
		try {
		ob4.createpostvalues();
		}
		catch (StaleElementReferenceException e) {
			ob4.createpostvalues();
			Thread.sleep(3000);
		}
		ob4.clickhome();
		
	}
	@Test(priority = 7)
	public void notifiandmsg() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Notificationandmessagepage ob5=new Notificationandmessagepage(driver);
		ob5.notifications();
		Thread.sleep(3000);
		ob5.insidenotification();
		Thread.sleep(3000);
		driver.navigate().back();
		ob5.messageclick();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}
	
	@Test(priority = 8)
	public void userprfle() throws InterruptedException, AWTException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Profilepage ob6=new Profilepage(driver);
		ob6.userprofile();
		Thread.sleep(3000);
		//WebElement element = driver.findElement(By.xpath("//*[@id=\"__PWS_ROOT__\"]/div/div[1]/div/div[2]/div/div/div/div[3]/div/div[2]/div/div[3]/div/div/div/div/div[1]/div[31]/div/div/div/div/div/div/div/div[1]/a/div/div[1]/div/div/div/div/div/img"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)");
		Thread.sleep(3000);
		driver.navigate().refresh();
		ob6.createdpostt();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,650)");
		Thread.sleep(3000);
		ob6.editprofile();
		Thread.sleep(2000);
		ob6.editprofilevalues();
		Thread.sleep(5000);
		ob6.givenvalues();
		ob6.changephoto();
		//driver.navigate().back();
		fileupload("C:\\testdata\\download (16).jpg");
		
	}

	private void fileupload(String p) throws AWTException, InterruptedException {
		StringSelection strselection=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		Profilepage ob6=new Profilepage(driver);
		Thread .sleep(6000);
		ob6.savepr();
		
		driver.navigate().back();
	}
	@Test(priority = 9)
	public void logoutfunction() throws InterruptedException
	{
		Logout ob7=new Logout(driver);
		ob7.logoutt();
		Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)");
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"HeaderAccountOptionsFlyout-item-13\"]/div/div/div[1]"));

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(3000);
		ob7.logoutclick();
		Thread.sleep(10000);

	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	

}

