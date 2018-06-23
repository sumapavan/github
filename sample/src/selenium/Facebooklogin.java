package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooklogin {
	WebDriver driver;
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver","E://seleniumdrivers//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("chhemanthi48@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sai@960372");
		driver.findElement(By.id("loginbutton")).click();
	

			
			   driver.switchTo().alert().accept();

	}
	public void logout()
	{
		new Select(driver.findElement(By.id("userNavigationLabel"))).selectByVisibleText("Log Out");
	}

	public static void main(String[] args) {
		Facebooklogin f=new Facebooklogin();
		f.browser();
		f.login();
        f.logout();
	}

}
