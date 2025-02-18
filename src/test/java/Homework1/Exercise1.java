package Homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise1 extends Hooks {
	
	public static void main (String args[]) throws InterruptedException {
		
		
		setUp("edge");
		
		//navigate to the page 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		//Username Field
		
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("admin");
		
		Thread.sleep(2000);
		
		//Password Field
		
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("admin123");
		
		Thread.sleep(2000);
		
		//Locate the login button 
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginButton.click();
		
		Thread.sleep(2000);
		
		//Verify the Header is DashBoard
		
		String heardText = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]")).getText();
		boolean isTextDashboard;
		
		
		if(heardText.contains("Dashboard")) {
			isTextDashboard = true;
		}else {
			isTextDashboard = false;
		}
		System.out.println("Text in the Dashboard " + isTextDashboard);
	
				
				tearDown();
				
		
		
	}

	
		
	}


