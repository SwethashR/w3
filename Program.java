package shrir;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Program {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\swethash\\eclipse-workspace\\shrir\\Edge\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
	     //JavascriptExecutor js =  (JavascriptExecutor) driver;
	     driver.get("https://demo.guru99.com/test/newtours/register.php");
	   //Filling Up the Details in Login Page:			
	    // driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input]")).sendKeys("Swetha");
	     //driver.findElement(By.id("login")).click();
	     //driver.findElement(By.name("lastName")).sendKeys("Shri");
	     //driver.findElement(By.name("phone")).sendKeys("6381156529");
	     //driver.findElement(By.name("userName")).sendKeys("swethash@maveric-systems.com");
	    // driver.findElement(By.name("address1")).sendKeys("15/2 Jaya krishna nagar");
	     //driver.findElement(By.name("city")).sendKeys("Chennai");
	     //driver.findElement(By.name("state")).sendKeys("Tamilnadu");
	     //driver.findElement(By.name("postalCode")).sendKeys("600125");
	    // Select dropdown = new Select(driver.findElement(By.name("country")));  
	    
	        Thread.sleep(3000);
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Swetha");
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")).sendKeys("Shri");
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input")).sendKeys("6381156529");
	driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("swethash@maveric-systems.com");
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys("Porur");
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input")).sendKeys("Chennai");
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")).sendKeys("Tamilnadu");
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input")).sendKeys("600125");
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("swethash");
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")).sendKeys("GIRIJA123");
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).sendKeys("GIRIJA123");
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")).click();
        // dropdown.selectByVisibleText("India");
	     

	   //Implicitlywait
	   				// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   				 //driver.findElement(By.id("password")).sendKeys("12345");
	   				// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   			//Filling Up the Details in Login Page:		
	   				// driver.findElement(By.id("name")).sendKeys("swethashri");

	   			//Implicitlywait
	   							 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   							// driver.findElement(By.id("password")).sendKeys("12345");
	   							// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   						//Scrolldown:
	   						//	org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
	   							//js.executeScript("window.scrollBy(0,2000)");

	   							//Selection of Dropdown
	   							//Select dropdown = new Select(driver.findElement(By.id("country")));  
	   										   //     dropdown.selectByVisibleText("India");
	   										    //    driver.findElement(By.id("address")).sendKeys("Chennai");
	   										      //  driver.findElement(By.id("email")).sendKeys("swethash@maveric-systems.com");
	   										     //   driver.findElement(By.id("phone")).sendKeys("6381156529");
	   										     //   driver.findElement(By.id("save")).click();
	   										   //Logging out the page:
	   										   //  driver.findElement(By.id("logout")).click();



	   							 


	    // js.executeScript("window.scrollBy(0,700)"); 
		
		//System.setProperty("webdriver.edge.driver","C:\\Users\\swethash\\eclipse-workspace\\shrir\\Edge\\msedgedriver.exe");
		
		//WebDriver driver=new EdgeDriver();
		
		//driver.get("https://www.youtube.com/"); 
	     //C:\Users\swethash\Downloads\geckodriver-v0.31.0-win64-firefox
		
	//driver.manage().window().maximize();
	//driver.findElement(By.name("search_query")).sendKeys("selenium tutorials");
	//driver.findElement(By.id("search-icon-legacy")).click();
	//File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   //FileHandler.copy(scrfile, new File ("Screenshot.png"));
	//Thread.sleep(1500);
	//driver.close();
	//System.setProperty("webdriver.edge.driver","C:\\Users\\swethash\\eclipse-workspace\\shrir\\Edge\\msedgedriver.exe");
	     //WebDriver driver=new EdgeDriver();
	    //driver.get("https://askomdch.com/");
	   // driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[1]/div/div/div/div/div[1]/a")).click();
	   // driver.findElement(By.xpath("//*[@id=\"woocommerce-product-search-field-0\"]")).sendKeys("Blue Tshirt");
	   // driver.findElement(By.xpath("//*[@id=\"woocommerce_product_search-1\"]/form/button")).click();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));-implicit
	// Explicity wait-
    //WebDriverWait wait = new WebDriverWait(driver, 10);
   //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"place_order\"]")));
    
	}
	
}
