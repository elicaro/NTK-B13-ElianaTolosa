package Homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise3 extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		setUp("edge");
		
		//Navigate webpage
		
		driver.get("https://demo.nopcommerce.com/");
		
		Thread.sleep(2000);
		
		//Register Link
		
		WebElement registerLink = driver.findElement(By.linkText("Register"));
		registerLink.click();
		
		Thread.sleep(2000);
		
		//Verify the nopCommerce demo store. Register
		
		String nopcommerceText = driver.findElement(By.xpath("/html/body/div[6]")).getText();
		boolean isTextnopCommerce;
		
		if(nopcommerceText.contains("nopCommerce demo store. Register")) {
			isTextnopCommerce = true;
		}else {
			isTextnopCommerce = false;
		}
		System.out.println("nopCommerce demo store. Register" + isTextnopCommerce);
		
		
		tearDown();
		
		
		
		
	}

}
