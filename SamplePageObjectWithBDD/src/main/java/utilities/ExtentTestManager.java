package utilities;
import java.util.HashMap;
import java.util.Map;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
/**
 * This class has following things:
 * An extentTestMap map is created. It holds the information of thread ids and ExtentTest instances.
 * ExtentReports instance is created by calling getReporter() method from ExtentManager.
 * At startTest() method, an instance of ExtentTest created and put into extentTestMap with current thread id.
 * At endTest() method, test ends and ExtentTest instance got from extentTestMap via current thread id.
 * At getTest() method, return ExtentTest instance in extentTestMap by using current thread id.
 * 
 * @author shailesh.kumar
 *
 */
public class ExtentTestManager {
	
	/*create an instance of HashMap class*/
    static Map<Integer, ExtentTest> extentTestMap = new HashMap<Integer, ExtentTest>();
    /*Get the instance of ExtentReports*/
    static ExtentReports extent = ExtentManager.getReporter();
 
    public static synchronized ExtentTest getTest() {
        return (ExtentTest)extentTestMap.get((int)(Thread.currentThread().getId()));
    }
 
    public static synchronized void endTest() {
        extent.endTest((ExtentTest)extentTestMap.get((int)(Thread.currentThread().getId())));
    }
 
    public static synchronized ExtentTest startTest(String testName, String desc) {
        ExtentTest test = extent.startTest(testName, desc);
        extentTestMap.put((int)(Thread.currentThread().getId()), test);
        return test;
    }
}