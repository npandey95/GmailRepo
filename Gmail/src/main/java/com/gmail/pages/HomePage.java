package com.gmail.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.gmail.base.Base;

public class HomePage extends Base{
		
	WebElement email = driver.findElement(By.xpath("//*[@id='identifierId']"));
	WebElement emailNextBtn = driver.findElement(By.xpath("//*[@id='identifierNext']//button/span"));
	WebElement password = driver.findElement(By.xpath("//*[@id='password']//input"));
	WebElement passNextBtn = driver.findElement(By.xpath("//*[@id=\'passwordNext\']//span"));
	WebElement composeBtn = driver.findElement(By.xpath("//*[@class='T-I T-I-KE L3']"));
	WebElement newMessage = driver.findElement(By.xpath("//*[@id=':nd']"));
	WebElement attch = driver.findElement(By.xpath(	"//*[@id=':rv']"));
	
	
	public boolean loginToGmail() {
		System.out.println(email);
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		email.sendKeys("pandeynavin95");
		emailNextBtn.click();
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		password.sendKeys("Navin@3008");
		passNextBtn.click();
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return composeBtn.isDisplayed();
	}

	public boolean clickOnCompose() {
		composeBtn.click();
		return true;
	}

	public boolean isDisplayedComposeMessage() {		
		return newMessage.isDisplayed();
	}

	public boolean addAttachment() {
		attch.sendKeys("C:\\Users\\Electrania.com\\Downloads\\ATUL.docx");
		String expected = attch.getAttribute("value");		
		return expected.equalsIgnoreCase("ATUL.docx");
	}
	
	

}
