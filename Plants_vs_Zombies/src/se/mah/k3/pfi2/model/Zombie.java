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
	private boolean dead;
	private float wobble = (float) Math.random();
	private int row;
	public static int killed=0; 
	public static int spawned=0; 
	public static boolean gameoverFlag=false;
	
	public Zombie(int _positionX, int _positionY, ZombieType _type) {		
		this.positionX = _positionX; // start posX
		this.positionY = _positionY; // start PosY
		this.type = _type;
		spawned++;
		switch (_type) {
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
	public void hit(float _damage){
		if(!this.dead){
		this.health-=_damage;
		blink();
		checkDeath();
		checkDegradation();
		}
	}
	
	
	private void blink() {
		// flashing graphics
		
	}
	private void checkDegradation() {

		
	}
	private void checkDeath() {
		if(this.health<0){
			this.dead=true;
			try {
				this.finalize();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}	
		
	}
	public int getPositionX() {
		return (int)positionX;
	}

	public int getPositionY() {
		return (int)positionY;
	}
	
	/**This makes the zoombie walk forward*/
	public void walk(){
		float w=(float)( 1*Math.sin(wobble)+1);
		wobble+=0.03;
		this.positionX+=w*velocityX;
		
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
		this.checkIfReachGoal();
	}

	private void checkIfReachGoal() {
		if(this.positionX<0){
			gameoverFlag=true;
			System.out.println("Game over , the zombie has reached the house!!");
		}
	}
	@Override
	public Image getImage() {
		return this.image;
	}

	@Override
	public void setPositionX(int _x) {

		this.positionX=_x;
	}

	@Override
	public void setPositionY(int _y) {

		this.positionY=_y;
	}
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}

	/** dumping element when not used*/
	protected void finalize() throws Throwable{
		killed++;
	 System.out.println("zombie is removed from memory");
	}
}
