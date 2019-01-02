import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import com.cucumber.listener.Reporter;
import com.bangtail.core.FileReaderManager;




@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\BangtailRepo\\BangtailAutoBDDNew\\src\\test\\Feature\\Sessions\\TreatmentSessions.feature",
		glue = {"com.bangtail.core","com.bangtail.impl"},
		plugin =  { "pretty","html:test-output","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome=true,//display the console output in a proper readable format
		strict = true//it will check if any step is not defined in step definition file
		//dryRun = true	//to check the mapping is proper between feature file and step def file	
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
		
		)
public class TestRunner2 {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(FileReaderManager.getInstance().getConfigFileReader().getReportConfigPath());
		Reporter.setSystemInfo("User name", System.getProperty("user.name"));
		Reporter.setSystemInfo("TimeZone", System.getProperty("user.timeZone"));
		Reporter.setSystemInfo("Machine", 	"Windows 10" +" "+ "64 Bit");
		Reporter.setSystemInfo("Java Version", "1.8.0_144");
		Reporter.setSystemInfo("chrome", " 71.0.3578.98 ");
		
	}

}




