package com.gmail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gmail.base.Base;

public class HomePage extends Base{
		
	@FindBy(xpath ="//*[@id='identifierId']")
	private static WebElement email;
	
	@FindBy(xpath="//*[@id='identifierNext']//button/span")
	private static WebElement emailNextBtn;
	
	@FindBy(xpath="//*[@id='password']//input")
	private static WebElement password;
	
	@FindBy(xpath="//*[@id=\'passwordNext\']//span")
	private static WebElement passNextBtn;
	
	@FindBy(xpath="//*[@class='T-I T-I-KE L3']")
	private static WebElement composeBtn;
	
	@FindBy(id="//*[@id=':nd']")
	private static WebElement newMessage;
	
	@FindBy(id="//*[@id=':rv']")
	private static WebElement attch;

	/*
	 * public boolean isUserOnHomePage() { String actualTitle = driver.getTitle();
	 * String expectedTitle =
	 * "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
	 * ; return actualTitle.equals(expectedTitle); }
	 * 
	 * public boolean haveUserClickedOnMobilesMenu() { return false; }
	 */

	public boolean loginToGmail() {
		System.out.println(email);
		email.sendKeys("pandeynavin95");
		emailNextBtn.click();
		password.sendKeys("Navin@3008");
		passNextBtn.click();
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
