package com.training.sanity.tests;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.pom.southernKarnatakaCircuitPOM;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sothernKarnatakaCircuitTest {
	private WebDriver driver;
	private String baseUrl;
	private southernKarnatakaCircuitPOM skcPOM;
	private static Properties properties;

	@BeforeTest
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		skcPOM = new southernKarnatakaCircuitPOM(driver);
		baseUrl = properties.getProperty("baseURL"); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(priority = 1)
	public void TC_001() {
		skcPOM.TourAndTravelOperatorsUIUX(); 
	}
	
	@Test(priority = 2)
	public void TC_002() {
		skcPOM.TourAndTravelOperatorsFunctionality(); 
	}
	
	@Test(priority = 3)
	public void TC_003() {
		skcPOM.ClickHereAshokToursAndTravelsbtnUIUX(); 
	}
	
	@Test(priority = 4)
	public void TC_004() {
		skcPOM.ClickHereAshokToursAndTravelsbtnFunctionality(); 
	}
	
	@Test(priority = 5)
	public void TC_005() {
		skcPOM.WebsiteLinkOfSSResidencybtnUIUX(); 
	}
	
	@Test(priority = 6)
	public void TC_006() {
		skcPOM.WebsiteLinkOfSSResidencybtnFunctionality(); 
	}
	
	@Test(priority = 7)
	public void TC_007() {
		skcPOM.MysuruZooLinkFunctionality(); 
	}
	
	@Test(priority = 8)
	public void TC_008() {
		skcPOM.SriMalaiMahadeshwaraSwamyTempleLinkFunctionality();
	}
	
	@Test(priority = 9)
	public void TC_009() {
		skcPOM.ChamundiTempleLinkFunctionality(); 
	}
	
	@Test(priority = 10)
	public void TC_010() {
		skcPOM.SanmanResidencyLinkFunctionality(); 
	}
}
