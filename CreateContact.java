package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class CreateContact {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");	
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("akash");
		driver.findElement(By.id("lastNameField")).sendKeys("anandhan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("gladson");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("william");
		driver.findElement(By.name("departmentName")).sendKeys("BCA");
		driver.findElement(By.name("description")).sendKeys("Computer Application");
		driver.findElement(By.name("primaryEmail")).sendKeys("akash007@gmail.com");
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state1 = new Select(state);
		state1.selectByVisibleText("United Kingdom");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.partialLinkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Personal");
		driver.findElement(By.xpath("//input[@name ='submitButton']")).click();
		System.out.println("Page title is : \n\t" + driver.getTitle());
	    driver.close();

	}

}
