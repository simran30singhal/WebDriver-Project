package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20000,TimeUnit.MILLISECONDS);
		

		WebElement UserName=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement Password=driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement Loginbtn=driver.findElement(By.xpath("//button[@name='login']"));
		
		
		UserName.sendKeys("abc@xyz.com");
		Password.sendKeys("Abc@1234");
		Loginbtn.click();
		
		
	}

}
