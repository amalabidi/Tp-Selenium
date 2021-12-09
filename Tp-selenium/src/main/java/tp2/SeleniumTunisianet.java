package tp2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;




public class SeleniumTunisianet {

		public static void main(String args[]) throws InterruptedException {
			
	    	 WebDriverManager.chromedriver().setup();
	    	 WebDriver driver = new ChromeDriver();
	    	 
	    	 // Enter your Email and password of your account Tunisianet in the place of AAAA 
	    	 String email = "AAAA";
	    	 String password = "AAAA";
	    	 String productName = "PC portable MacBook M1 13.3";
	    	 
	    	 driver.get("https://www.tunisianet.com.tn/");
	    	 
	    	 // Open the connection page 
	    	
	    	 Thread.sleep(2000);
	    	 WebElement userIcon = driver.findElement(By.cssSelector("#_desktop_user_info > div > div > svg"));
	    	 userIcon.click();
	    	 Thread.sleep(500);
	    	 WebElement connection = driver.findElement(By.cssSelector(".user-down > li > a > span"));
	    	 connection.click();
	    	 
	    	 
	    	 //authentification
	    	 Thread.sleep(500);
	    	 WebElement userEmail = driver.findElement(By.name("email"));
	    	 userEmail.sendKeys(email);
	    	 Thread.sleep(500);
	    	 WebElement userPassword = driver.findElement(By.name("password"));
	    	 userPassword.sendKeys(password);
	    	 
	    	 Thread.sleep(2000);
	    	 WebElement connectionButton = driver.findElement(By.id("submit-login"));
	    	 connectionButton.click();
	    	 
	    	 //Search for the product
	    	 Thread.sleep(500);
	    	 WebElement SearchedProduct = driver.findElement(By.name("s"));
	    	 SearchedProduct.sendKeys(productName);
	    	 
	    	 Thread.sleep(1000);
	    	 WebElement SearchButton = driver.findElement(By.cssSelector(".button-search > svg "));
	    	 SearchButton.click();
	    	 
	    	 
	    	 Thread.sleep(1000);
	         List<WebElement> products = driver.findElements(By.className("product-title"));
	         products.get(0).click();
	    	 
	         // Add the product to cart
	    	 Thread.sleep(1000);
	    	 WebElement addToCartButton = driver.findElement(By.cssSelector(".add > button"));
	    	 addToCartButton.click();
	    	 
	    	  // Order the product
	    	  Thread.sleep(2000);
	    	  WebElement commandButton = driver.findElement(By.cssSelector(".cart-content-btn > a"));
	    	  commandButton.click();   	 
	    	 
	    	 Thread.sleep(1500);
	    	 driver.quit();
	    	 
	    	 
		}

	

}
