package se.mah.k3.pfi2.lecture7;

import java.util.Comparator;


public class Walnut implements Comparable<Walnut> {
	private int life;
	public Walnut(int life) {
		this.life = life;
	}
	public int getLife() {
		return this.life;
	}
	@Override
	public int compareTo(Walnut w) {
		int returnvalue =0;
		if(this.life > w.life){
			returnvalue = 1;
		}else if(this.life == w.life){
			returnvalue = 0;
		}else if(this.life < w.life){
			returnvalue = -1;
		}
		return returnvalue;
	}
}
