package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;
public class DateUtility {
	
	public static String getRequiredDateBasedOnNumberOfDays(String format,int numberOfDays) {
		 
		Calendar cal  = Calendar.getInstance();	    
	    cal.add(Calendar.DATE, numberOfDays);
	    SimpleDateFormat s = new SimpleDateFormat(format);
	    return s.format(new Date(cal.getTimeInMillis()));
	}
	
	public static String getRequiredDateBasedOnNumberOfMonths(String format,int numberOfMonths) {
		 
		Calendar cal  = Calendar.getInstance();	    
	    cal.add(Calendar.MONTH, numberOfMonths);
	    SimpleDateFormat s = new SimpleDateFormat(format);
	    return s.format(new Date(cal.getTimeInMillis()));
	}
	
	public static String getRequiredDateBasedOnNumberOfYears(String format,int numberOfYears) {
		 
		Calendar cal  = Calendar.getInstance();	    
	    cal.add(Calendar.YEAR, numberOfYears);
	    SimpleDateFormat s = new SimpleDateFormat(format);
	    return s.format(new Date(cal.getTimeInMillis()));
	}
	
	public static String getRequiredDateTimeBasedOnNumberOfDays(String format,int numberOfDays) {
		 
		Calendar cal  = Calendar.getInstance();	    
	    cal.add(Calendar.DATE, numberOfDays);
	    SimpleDateFormat s = new SimpleDateFormat(format);
	    return s.format(new Date(cal.getTimeInMillis()));
	}
	
	@Test
	public void testCase() {
		System.out.println(getRequiredDateTimeBasedOnNumberOfDays("dd-M-yyyy hh:mm:ss", 0));
	}
	

}
