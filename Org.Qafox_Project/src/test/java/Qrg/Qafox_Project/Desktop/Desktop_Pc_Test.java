package Qrg.Qafox_Project.Desktop;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import GenericUtility.BaseConfiguration;
import Org.Qafox_Project.PageRepositry.HomePage;

public class Desktop_Pc_Test extends BaseConfiguration {

	public Desktop_Pc_Test() {
		report = new ExtentReports();
	}

	@Test
	public void addProduct_Desktop_Pc() {

		// Create the test information
		ExtentTest test = super.report.createTest("AddProduct_Desktop_PC");

		HomePage homepageObj = new HomePage(webdriverobj.driver);

		// perform mouse hover action
		webdriverobj.mouseHouseToElement(homepageObj.getDesktop_header());
		test.log(Status.PASS, "Step1:Perform Mouse House Action_Desktop");

		javaUtilityobj.pause(2000);

		// perform mouse hover action
		webdriverobj.mouseHouseToElement(homepageObj.getDesktop_header_Pc());
		test.log(Status.PASS, "Step2.1:Perform Mouse House Action_Desktop_PC");

		homepageObj.getDesktop_header_Pc().click();
		test.log(Status.PASS, "Step2.2:Perform Click Action on Desktop_PC ");

		javaUtilityobj.pause(2000);
		Reporter.log("Desktops_Mac_Product Added", true);
	}

}
