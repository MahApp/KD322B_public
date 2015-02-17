


public class ClockLogic extends ClockInterface {
	private int alarmHour;
	private int alarmMinute;
	

	ClockLogic(DigitalClockGUI clockIn){
			ClockThread hej = new ClockThread(null);
	}
	
	void setAlarm(int h, int m){
		alarmHour = h;
		alarmMinute = m;
	}
	
	void clearAlarm(){
		alarmHour = 0;
		alarmMinute = 0;
	}
	


}
