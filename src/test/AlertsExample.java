package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		
		//Alert Accept
		WebElement ele=driver.findElement(By.xpath("//button[@id='alertButton']"));
		ele.click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();
		
		//Alert Cancel	
		WebElement ele1=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		ele1.click();
		
		Alert alert2=driver.switchTo().alert();
		System.out.println(alert2.getText());
		
		alert2.dismiss();
		
		//Alert Message
		WebElement ele2=driver.findElement(By.xpath("//button[@id='promtButton']"));
		ele2.click();
		
		Alert alert3=driver.switchTo().alert();
		alert3.sendKeys("Some Text");
		System.out.println(alert3.getText());
		alert2.accept();
		
	}

}
