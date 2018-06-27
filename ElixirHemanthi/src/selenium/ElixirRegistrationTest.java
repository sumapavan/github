package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElixirRegistrationTest {
	WebDriver driver;


	@BeforeTest
	public void browser()
	{

		System.setProperty("webdriver.chrome.driver", "E://seleniumdrivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.elixiraid.com/index.php");

		driver.manage().window().maximize();
	}

	@Test(priority=0)
	public void login() {
		driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	}
	@Test(priority=1)
	public void setting() throws IOException {
		driver.findElement(By.xpath("//span[contains(text(),'Settings')]")).click();
		driver.findElement(By.xpath("//a[@href='/index.php/core/hospitalregistration/create']")).click();
		WebElement code= driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospital_code']"));
		code.clear();
		code.sendKeys("123");

		WebElement name=  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospitalname']"));
		name.clear();
		name.sendKeys("sai");

		WebElement loc= driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_address']"));
		loc.clear();
		loc.sendKeys("hyd");
		new Select(driver.findElement(By.xpath("//select[@id='Hospitalregistration_yearofestablishment']"))).selectByVisibleText("1996");
		WebElement country=driver.findElement(By.xpath("//input[@id='Hospitalregistration_country']"));
		country.clear();
		country.sendKeys("US");
		WebElement state= driver.findElement(By.xpath("//input[@id='Hospitalregistration_state']"));
		state.clear();		
		state.sendKeys("andhrapradesh");
		WebElement mobile=driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_phone']"));
		mobile.clear();

		mobile.sendKeys("8008873997");
		WebElement email=driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_email']"));
		email.clear();
		email.sendKeys("hemanthich3@gmail.com");
		WebElement fax= driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_fax']"));
		fax.clear();
		fax.sendKeys("asdfg");
		WebElement building=  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_noofbuildings']"));
		building.clear();
		building.sendKeys("4");
		WebElement person= driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_contactperson']"));
		person.clear();
		person.sendKeys("sham");
		WebElement promoted=  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_promotedby']"));
		promoted.clear();
		promoted.sendKeys("hema");
		driver.findElement(By.xpath("//input[@id='Hospitalregistration_logo']")).click();
		Runtime.getRuntime().exec("E:\\New folder\\elixir.exe");

	}
}
