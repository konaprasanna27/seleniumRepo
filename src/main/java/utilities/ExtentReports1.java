package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReports1 {
	static ExtentReports extentReport;
	
public static ExtentReports getExtentReport() {
	String extentReportPath=System.getProperty("user.dir")+"\\reports\\extentreport.html";
	ExtentSparkReporter reporter=new ExtentSparkReporter(extentReportPath);
	reporter.config().setReportName("Itilite Automation Results ");
	reporter.config().setDocumentTitle("Test Results");
	
	extentReport=new ExtentReports();
	extentReport.attachReporter(reporter);
	extentReport.setSystemInfo("Operating System","Windows 11");
	extentReport.setSystemInfo("Tested by","k.prasanna");
	
	return extentReport;
}
}
