public class Toaster {
		//instansvariabler
		private int timeLeft;
		private int nbrOfBreads;
		
		//konstruktor
		public Toaster(int nbrOfBreads){
			 this.nbrOfBreads = nbrOfBreads;
			 this.timeLeft = 0;				
		}
		//metoder
		public int getTimeLeft(){
			return this.timeLeft;
		}
		public void setTimeLeft(int time){
			this.timeLeft = time;
		}
		public void toastBread(){
			//not implemented
		}
}

