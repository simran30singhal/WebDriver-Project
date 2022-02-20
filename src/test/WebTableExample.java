package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		List<WebElement> Tbrows= driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Total no of rows are: "+Tbrows.size());
		
		List<WebElement> Tbrcols= driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("Total no of rows are: "+Tbrcols.size());
		
		List<WebElement> Tbrowdata= driver.findElements(By.xpath("//table[@id='customers']//tr[4]/td"));
		
		for(WebElement elm:Tbrowdata) {
		
			System.out.println(elm.getText());
		}
		
List<WebElement> Tbcoldata= driver.findElements(By.xpath("//table[@id='customers']//td[1]"));
		
		for(WebElement elm1:Tbcoldata) {
		
			System.out.println(elm1.getText());
		}
	}
	//td[text()='Island Trading']/following-sibling::td
	//td[text()='Island Trading']/parent::tr/td

}
