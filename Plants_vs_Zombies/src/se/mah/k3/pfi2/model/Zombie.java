package se.mah.k3.pfi2.model;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Arrays;

import se.mah.k3.pfi2.control.GameItem;

public class Zombie implements GameItem {
	Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/se/mah/k3/pfi2/images/zombie.png"));
	private float positionX;
	private float positionY;
	private float health; //zombie hitpoints
	private ArrayList <Float> degrade; // when health reach threshold appearance change
	private float velocityX,velocityY;
	public enum ZombieType {NORMAL,FLAG,CONEHEAD}; 
	private ZombieType type;
	private ZombieType transform=null; 
	
	public static int killed=0; 
	public static int spawned=0; 
	
	public Zombie(int positionXIn, int positionYIn, ZombieType typeIn) {		
		this.positionX = positionXIn; // start posX
		this.positionY = positionYIn; // strat PosY
		this.type = typeIn;
		spawned++;
		switch (typeIn) {
		case NORMAL:
			image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/se/mah/k3/pfi2/images/zombie.png"));
			this.health= (float) 9.25;
			this.velocityX= (float)-0.3;
			this.degrade= new ArrayList <Float>(Arrays.asList((float)5));
			break;
		case FLAG:
			image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/se/mah/k3/pfi2/images/flag.png"));
			this.health= (float) 9.5;
			this.velocityX= (float)-0.4;
			this.degrade= new ArrayList <Float>(Arrays.asList((float)4.75));
			break;
		case CONEHEAD:
			 image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/se/mah/k3/pfi2/images/zombie.png"));
			this.health= (float) 28 ;
			this.velocityX= (float)-0.3;
			this.degrade= new ArrayList <Float>(Arrays.asList((float)7,(float)13,(float)19,(float)23));
			transform=type.NORMAL; // transform into type after degradation
			break;
			
		default:
			this.health= (float) 9.25;
			this.velocityX= (float)-0.3;
			this.degrade= new ArrayList <Float>(Arrays.asList((float)5));
			break;
			}
		}
	public void eat(){
		// damage flowers
		
		
	}
	public void hit(float damage){
		this.health-=damage;
		checkDegradation();
	}
	
	
	private void checkDegradation() {

		
	}
	public int getPositionX() {
		return (int)positionX;
	}

	public int getPositionY() {
		return (int)positionY;
	}
	
	/**This makes the zoombie walk forward*/
	public void walk(){
		this.positionX+=velocityX;
		//HÄr kommer en switch på de olika ZombieTyperna
//		switch (type) {
//		case NORMAL:
//			this.positionX+=velocityX;
//			break;
//		case FLAG:
//			this.positionX+=velocityX;
//			break;
//		case CONEHEAD:
//			this.positionX+=velocityX;
//			break;
//		default:
//			break;
//		}	
	}

	@Override
	public void doYourThing() {
		this.walk();
		
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		
		return this.image;
	}

	@Override
	public void setPositionX(int x) {
		// TODO Auto-generated method stub
		this.positionX=x;
	}

	@Override
	public void setPositionY(int y) {
		// TODO Auto-generated method stub
		this.positionY=y;
	}

	/** dumping element when nt used*/
	protected void finalize() throws Throwable{
		killed++;
	 System.out.println("zombie is removed from memory");
	}
}
