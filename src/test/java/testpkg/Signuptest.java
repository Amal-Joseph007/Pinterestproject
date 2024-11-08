package testpkg;

import java.time.Duration;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Signup;

public class Signuptest extends Baseclass{
	@Test
	public void signupvalues()
	{
		Signup ob=new Signup(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ob.signupp();
		ob.signupvalues();
		ob.createaccountclick();
	}

}
