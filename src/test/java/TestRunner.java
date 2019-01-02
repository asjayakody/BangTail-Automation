import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\BangtailRepo\\BangtailAutoBDDNew\\src\\test\\Feature\\AdminLogin\\AdminLogin.feature",
		glue = {"com.bangtail.core","com.bangtail.impl"},
		plugin={"pretty","html:test-output"},
		monochrome=true,//display the console output in a proper readable format
		strict = true//it will check if any step is not defined in step definition file
		//dryRun = true	//to check the mapping is proper between feature file and step def file	
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
		
		)
public class TestRunner {



}




