package Multitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgScripts {

	WebDriver driver;

	@BeforeClass
	public void Initalization() {
		driver = new ChromeDriver(); // RTP

		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
	}

	@Test(priority = 1)
	public void DropDown() {

		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

		Select sel = new Select(dropdown);

		sel.selectByIndex(3); //

		sel.selectByValue("search-alias=apparel");

		sel.selectByVisibleText("Electronics"); //

	}

	@Test(priority = 2)

	public void AdvanceDropDown() {

		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

		Select sel = new Select(dropdown);

		List<WebElement> li = sel.getOptions();

		System.out.println(li.size());

		for (int i = 0; i < li.size(); i++) // 0 0<42
		{
			li.get(i).click();
			System.out.println(li.get(i).getText()); // all-watc - get(0).ge
		}

		// try to click in reverse order and print in reverese order
	}

	@AfterClass
	public void CleanUp() {
		driver.quit();
	}

}
