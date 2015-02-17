public class ClockThread implements Runnable {
	private int hours, minutes, seconds;
	int i = 0;
	
	public ClockThread(ClockInterface ci){
		(new Thread(new ClockThread(ci))).start();
	}

    public void run() {
    	
    	while(i<1337){
        ClockInterface.update(hours, minutes, seconds);
        try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    }

 

}
