package utilities;
import com.relevantcodes.extentreports.ExtentReports;
/**
 * @author shailesh.kumar
 *Objective: ExtentReports extent instance created here. That instance can be reachable by getReporter() method.
 */

public class ExtentManager {
	
	/*create an instance of ExtendRrports*/
	  private static ExtentReports extent;
	/**
	 * this method will help us to set your ExtentReports report HTML file location
	 * @return extent
	 */
	  public synchronized static ExtentReports getReporter(){
	      if(extent == null){
	          /*Set HTML reporting file location*/
	          String workingDir = System.getProperty("user.dir");
	          extent = new ExtentReports(workingDir+"\\ExtentReports\\ExtentReportResults.html", true);
	      }
	      return extent;
	  }
}
