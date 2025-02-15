package Homework1;

import utils.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Exercise22 extends Hooks{
	
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp("edge");
		
		//navigate to the page
		driver.get("https://demo.guru99.com/test/newtours/");
		
		Thread.sleep(2000);
		
		
		//Register link
		WebElement registerLink= driver.findElement(By.linkText("REGISTER"));
		registerLink.click();
		
		Thread.sleep(2000);
		
		//Verify page title Mercury Tours
		
		boolean ispageTittleMT;
		
		String pageTittle = driver.getTitle();
		
		if(pageTittle.contains("Mercury Tours")) {
			ispageTittleMT = true;
		}else {
			ispageTittleMT = false;
		}
		System.out.println("Mercury Tours " + ispageTittleMT );
		
		
		//Enter Data
		
		WebElement firstnameField = driver.findElement(By.name("firstName"));
		firstnameField.sendKeys("Eliana");
			
		Thread.sleep(2000);
		
		WebElement lastnameField = driver.findElement(By.name("lastName"));
		lastnameField.sendKeys("Tolosa");
			
		Thread.sleep(2000);
		
		WebElement phoneField = driver.findElement(By.name("phone"));
		phoneField.sendKeys("3055398135");
		
		Thread.sleep(2000);
		
		WebElement emailField = driver.findElement(By.name("userName"));
		emailField.sendKeys("carolinatolosacontreras@hotmail.com");
		
		Thread.sleep(2000);
		
		WebElement addressField = driver.findElement(By.name("address1"));
		addressField.sendKeys("3409 Cheery Garden Cir");
		
		Thread.sleep(2000);
		
		WebElement cityField = driver.findElement(By.name("city"));
		cityField.sendKeys("Lauderhill");
		
		Thread.sleep(2000);
		
		WebElement stateField = driver.findElement(By.name("state"));
		stateField.sendKeys("FL");
		
		Thread.sleep(2000);
		
		WebElement postalcodeField = driver.findElement(By.name("postalCode"));
		postalcodeField.sendKeys("33319");
		
		Thread.sleep(2000);
		
		WebElement countryField = driver.findElement(By.name("country"));
		countryField.sendKeys("UNITED STATES");
		
		Thread.sleep(2000);
		
		WebElement usernameField = driver.findElement(By.name("email"));
		usernameField.sendKeys("elicaro02");
		
		Thread.sleep(2000);
		
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Dominic1001");
		
		Thread.sleep(2000);
		
		WebElement confirmpasswordField = driver.findElement(By.name("confirmPassword"));
		confirmpasswordField.sendKeys("Dominic1001");
		
		Thread.sleep(2000);
		
		//Click Submit
		
		WebElement submitField = driver.findElement(By.name("submit"));
		submitField.click();
		
		//Retrieve confirmation
		
		String confirmationMsg = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td")).getText();
		
		if(confirmationMsg.contains("Thank you for registering.")) {
			System.out.println("TESTCASE PASSED");
		}else {
			System.out.println("TESTCASE FAILED");
				
		}
		tearDown();
		
		
		
		
	}

}
