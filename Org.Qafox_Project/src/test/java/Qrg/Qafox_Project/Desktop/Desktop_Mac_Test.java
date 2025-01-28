package Qrg.Qafox_Project.Desktop;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import GenericUtility.BaseConfiguration;
import Org.Qafox_Project.PageRepositry.CartPage;
import Org.Qafox_Project.PageRepositry.Desktop_MacPage;
import Org.Qafox_Project.PageRepositry.HomePage;


/**
 * @author Jaheer
 */

public class Desktop_Mac_Test extends BaseConfiguration {
	
	public Desktop_Mac_Test() {
		report = new ExtentReports();
	}
	@Test
	public void addProduct_Desktop_Mac() {
		// Create the test information
		ExtentTest test = super.report.createTest("AddProduct_Desktop_Mac");

		HomePage homepageObj = new HomePage(webdriverobj.driver);
		Desktop_MacPage macObj = new Desktop_MacPage(webdriverobj.driver);
		CartPage cartObj=new CartPage(webdriverobj.driver);

		// perform mouse hover action
		webdriverobj.mouseHouseToElement(homepageObj.getDesktop_header());
		test.log(Status.PASS, "Step1:Perform Mouse House Action_Desktop");

		javaUtilityobj.pause(2000);

		// perform mouse hover action
		webdriverobj.mouseHouseToElement(homepageObj.getDesktop_header_Mac());
		test.log(Status.PASS, "Step2.1:Perform Mouse House Action_Desktop_Mac");

		homepageObj.getDesktop_header_Mac().click();
		test.log(Status.PASS, "Step2.2:Perform Click Action_Desktop_Mac");

		javaUtilityobj.pause(2000);
		test.log(Status.INFO, "Desktops_Mac_Product Added Sucessfull");

		macObj.getImac().click();
		javaUtilityobj.pause(2000);

		String productTitle = macObj.getProduct_Title().getText();
		Reporter.log(productTitle, true);
		javaUtilityobj.pause(2000);

		String productBrand = macObj.getProduct_Brand().getText();
		Reporter.log(productBrand, true);
		javaUtilityobj.pause(2000);

		String productCode = macObj.getProduct_Code().getText();
		Reporter.log(productCode, true);
		javaUtilityobj.pause(5000);

		String productAvailability = macObj.getProduct_Availability().getText();
		Reporter.log(productAvailability, true);
		javaUtilityobj.pause(5000);

		String productActualPrice = macObj.getProduct_ActualPrice().getText();
		Reporter.log(productActualPrice, true);
		javaUtilityobj.pause(2000);

		String productDiscountPrice = macObj.getProduct_DiscountPrice().getText();
		Reporter.log(productDiscountPrice, true);
		javaUtilityobj.pause(2000);

		macObj.getProduct_Qty().sendKeys("5");
		Reporter.log("QTY is entered sucessfully",true);
		javaUtilityobj.pause(2000);

		macObj.getProduct_AddToCart().click();
		Reporter.log("add cart button click sucessfully ",true);
		javaUtilityobj.pause(2000);

		String productHeadingMessage = macObj.getProduct_heading_message().getText();
		Reporter.log(productHeadingMessage, true);
		javaUtilityobj.pause(2000);

		String productDescription = macObj.getProduct_Description().getText();
		Reporter.log(productDescription, true);
		javaUtilityobj.pause(2000);

		cartObj.getProduct_Cart().click();
		Reporter.log("shopping cart button click sucessfull", true);
		javaUtilityobj.pause(2000);

		cartObj.getView_Cart().click();
		Reporter.log("view cart button click sucessfull");
		javaUtilityobj.pause(2000);

		macObj.getProduct_CheckOut().click();
		Reporter.log("check out button click sucessfull");
		javaUtilityobj.pause(2000);

		productHeadingMessage = macObj.getProduct_heading_message().getText();
		Reporter.log(productHeadingMessage, true);
		javaUtilityobj.pause(2000);
	}

}
