package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ohrms_Test {
	WebDriver driver;
	public void Browser(){
		System.setProperty("webdriver.chrome.driver","E://seleniumdrivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	public void Login(){
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	}
	public void admin() throws Exception{
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a/b")).click();
		/*adding new user*/
		driver.findElement(By.id("btnAdd")).click();
		new Select(driver.findElement(By.id("systemUser_userType"))).selectByVisibleText("ESS");
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("hema");
		driver.findElement(By.id("systemUser_userName")).sendKeys("hemanthi");
		new Select(driver.findElement(By.id("systemUser_status"))).selectByVisibleText("Enabled");
		driver.findElement(By.id("systemUser_password")).sendKeys("960312970");
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("960312970");
		driver.findElement(By.id("btnSave")).click();
		
	}
		 public void logout() throws InterruptedException
		 {
		driver.findElement(By.id("welcome")).click();
		//Thread.sleep(9000);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Logout")).click();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Ohrms_Test o=new Ohrms_Test();
		o.Browser();
		o.Login();
		o.admin();
        o.logout();
	}

}
