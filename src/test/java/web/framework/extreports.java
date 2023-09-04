package web.framework;

import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extreports {
	
	public static ExtentReports getreportobject()
	{
		String path = System.getProperty("user.dir")+"\\target\\Reports\\index.html";
	ExtentSparkReporter	reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("TestStatus");
	reporter.config().setDocumentTitle("TestOutcome");
	
	ExtentReports extrep = new ExtentReports();
	extrep.attachReporter(reporter);
	extrep.setSystemInfo("Tester", "TeamSiemens");
	return extrep;	
	}

}
