package Multitest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHovering {

	@Test
	public void MHovering() throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver(); //RTP
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		
	WebElement accountlist = 	driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(accountlist).perform();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='Your Account']")).click();
		

	}

}
