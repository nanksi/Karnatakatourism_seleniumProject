package com.training.pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class southernKarnatakaCircuitPOM {
private WebDriver driver; 
	
	public southernKarnatakaCircuitPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[@class='item_text'])[20]")
	private WebElement SKCbtn;
	
	@FindBy(linkText = "Tour & Travel Operators")
	private WebElement TTObtn;
	
	@FindBy(linkText = "Accept")
	private WebElement popUpbtn;
	
	@FindBy(linkText = "Mysuru")
	private WebElement MysuruTTObtn;
	
	@FindBy(linkText = "Click Here")
	private WebElement ClickHereAshokTTbtn;
	
	@FindBy(linkText = "Accommodation")
	private WebElement Accommodationbtn;
	
	@FindBy(linkText = "Beluru")
	private WebElement BeluruAccbtn;
	
	@FindBy(linkText = "www.ssresidency.co.in")
	private WebElement WebsiteSSRbtn;
	
	@FindBy(linkText = "Ticket Booking")
	private WebElement TicketBookingbtn;
	
	@FindBy(css = "a[href$='book-ticket']")
	private WebElement MysuruZoo;
	
	@FindBy(css = "a[href='https://mmhillsreservation.org/']")
	private WebElement SMMSTemple;
	
	@FindBy(css = "a[href$='Bookticket.aspx']")
	private WebElement ChamundiTemple;
	
	@FindBy(xpath = "//tr[7]/td[5]/a[1]")
	private WebElement SanmanResidency;
	
	
	public void TourAndTravelOperatorsUIUX() {
		this.popUpbtn.click();
		this.SKCbtn.click();
		Assert.assertEquals(this.TTObtn.getText(), "Tour & Travel Operators");
//		System.out.println("UI/UX - Tour & Travel Operators button is present.");
	}
	
	public void TourAndTravelOperatorsFunctionality() {
		this.TTObtn.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://karnatakatourism.org/skc-tour-travel-operators/");
//		System.out.println("Functionality - Redirected to the page Tour & Travel Operators.");
	}
	
	public void ClickHereAshokToursAndTravelsbtnUIUX() {
		this.MysuruTTObtn.click();
		Assert.assertEquals(this.ClickHereAshokTTbtn.getText(), "Click Here");
	}
	
	public void ClickHereAshokToursAndTravelsbtnFunctionality() {
		this.ClickHereAshokTTbtn.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.tourtravelworld.com/travel-agents/ashok-tours-travels10-358240/contact.htm");
	}
	
	public void WebsiteLinkOfSSResidencybtnUIUX() {
		driver.navigate().to("https://karnatakatourism.org/southern-karnataka-circuit/");
		this.Accommodationbtn.click();
		this.BeluruAccbtn.click();
		Assert.assertEquals(this.WebsiteSSRbtn.getText(), "www.ssresidency.co.in");
	}
	
	public void WebsiteLinkOfSSResidencybtnFunctionality() {
		this.WebsiteSSRbtn.click();
		Set<String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		Assert.assertEquals(driver.getCurrentUrl(), "https://ssresidency.co.in/");
		driver.close();
		driver.switchTo().window(parentId);
	}
	
	public void MysuruZooLinkFunctionality() {
		driver.navigate().to("https://karnatakatourism.org/southern-karnataka-circuit/");
		this.TicketBookingbtn.click();
		this.MysuruZoo.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.mysuruzoo.info/book-ticket");
	}
	
	public void SriMalaiMahadeshwaraSwamyTempleLinkFunctionality() {
		driver.navigate().back();
		this.SMMSTemple.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://mmhillsreservation.org/");
	}
	
	public void ChamundiTempleLinkFunctionality() {
		driver.navigate().back();
		this.ChamundiTemple.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://chamundeshwaritemple.in/Bookticket.aspx");
	}
	
	public void SanmanResidencyLinkFunctionality() {
		driver.navigate().to("https://karnatakatourism.org/southern-karnataka-circuit/");
		this.Accommodationbtn.click();
		this.BeluruAccbtn.click();
		this.SanmanResidency.click();
		Assert.assertNotEquals(driver.getCurrentUrl(), "https://karnatakatourism.org/skc-acc-beluru/");
	}

}
