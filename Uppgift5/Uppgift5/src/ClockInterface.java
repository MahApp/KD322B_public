import java.text.SimpleDateFormat;
import java.util.Calendar;

abstract class ClockInterface {
	static void update(int hours, int minute, int second){
    	Calendar cal = Calendar.getInstance();
    	cal.getTime();
    	SimpleDateFormat hour = new SimpleDateFormat("HH");
    	hours = Integer.parseInt(hour.format(cal.getTime()));
    	
    	SimpleDateFormat min = new SimpleDateFormat("mm");
    	minute = Integer.parseInt(min.format(cal.getTime()));
    	
    	SimpleDateFormat sec = new SimpleDateFormat("ss");
    	second = Integer.parseInt(sec.format(cal.getTime()));
	}
}
