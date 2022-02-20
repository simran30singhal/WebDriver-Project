package test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		/*WebElement newWindow=driver.findElement(By.xpath("//button[text()='New Window']"));
		newWindow.click();
		
		String ParentWin=driver.getWindowHandle();
		
		Set<String> handle=driver.getWindowHandles();
		Iterator<String> itr=handle.iterator();
		
		while(itr.hasNext()) {
			
			String currentVal=itr.next();
			if (!currentVal.equals(ParentWin)) {
				
				driver.switchTo().window(currentVal);
				
			}
		}
		
		WebElement ele=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(ele.getText());
		
		//driver.close();
		driver.switchTo().window(ParentWin);*/
		
		WebElement newTab=driver.findElement(By.xpath("//button[text()='New Tab']"));
		newTab.click();
		
		String ParentWin=driver.getWindowHandle();
		
		Set<String> handle=driver.getWindowHandles();
		Iterator<String> itr=handle.iterator();
		
		while(itr.hasNext()) {
			
			String currentVal=itr.next();
			if (!currentVal.equals(ParentWin)) {
				
				driver.switchTo().window(currentVal);
				
			}
		}
		
		WebElement ele=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(ele.getText());
	}

}
