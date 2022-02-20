package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20000,TimeUnit.MILLISECONDS);
		
		WebElement CreateAccount= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		CreateAccount.click();
		
		WebElement FirstName= driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement LastName= driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement Mobile= driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement Password= driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		//WebElement SignUp= driver.findElement(By.xpath("//button[@name='websubmit']"));
		FirstName.sendKeys("Simran");
		LastName.sendKeys("Singhal");
		Mobile.sendKeys("1234567890");
		Password.sendKeys("Abc@123433");
		
		//dynamic xpath for gender
		String strGender= "Female";
		 //input[@value='1']
        //input[@value='2']
        //input[@value='-1']
        
        //label[text()='Male']/following-sibling::input
        //label[text()='Female']/following-sibling::input
        //label[text()='Custom']/following-sibling::input
		
		String GenPath= "//label[text()='" + strGender + "']/following-sibling::input";
		WebElement Gender=driver.findElement(By.xpath(GenPath));
		Gender.click();
		
		List<WebElement> Months = driver.findElements(By.xpath("//select[@title='Month']/option"));
        
        for(WebElement elm : Months) {
            
            System.out.println(elm.getText());
        }
		//SignUp.click();
        
        WebElement CurrMonth = driver.findElement(By.xpath("//select[@title='Month']/option[@selected='1']"));
		
		System.out.println("Current Month " + CurrMonth.getText());

		
		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		Select dropdown=new Select(day);
		dropdown.selectByVisibleText("30");
		
		WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
		Select dropdown1=new Select(month);
		dropdown1.selectByVisibleText("Apr");
		
		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		Select dropdown2=new Select(year);
		dropdown2.selectByVisibleText("1997");
		
		
	}

}
