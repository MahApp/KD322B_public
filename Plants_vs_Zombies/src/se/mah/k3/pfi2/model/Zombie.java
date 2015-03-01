package se.mah.k3.pfi2.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.ImageIcon;

import se.mah.k3.pfi2.control.GameItem;
import se.mah.k3.pfi2.control.Controller;

public class Zombie implements GameItem {

	Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/se/mah/k3/pfi2/images/zombie.png"));
	public Image finalImage;
	Image cone = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/se/mah/k3/pfi2/images/cone1.png"));
	private float positionX;
	private float positionY;
	private int width;
	private int height;
	private float health; //zombies hitpoints
	private ArrayList <Float> degrade; // when health reach certain threshold , zombies appearance change
	private float velocityX,velocityY;
	public enum ZombieType {RANDOM,NORMAL,FLAG,CONEHEAD }; 
	private ZombieType type;
	private static final int totalTypes = ZombieType.values().length;
	private ZombieType transform=null; 
	private ArrayList <ZombiePart> parts= new ArrayList <ZombiePart>();
	private boolean dead;
	private boolean eating;
	private float wobble = (float) Math.random();
	public static final int MAX_ROWS=10,MAX_COLUMNS=5; 
	private int row;
	private int column;
	private boolean [][]onSquare =new boolean [MAX_ROWS][MAX_COLUMNS]; 
	private int[] square=new int[2];
	public static int killed=0; 
	public static int spawned=0; 
	public static boolean gameoverFlag;
	 private float degree=0;

	public Zombie(int _positionX, int _positionY, ZombieType _type) {		
		this.positionX = _positionX; // start posX
		this.positionY = _positionY; // start PosY
		spawned++;
		if(_type== ZombieType.RANDOM){ 
			ZombieType[] Z = ZombieType.values();
			_type=Z[(int)(Math.random()*totalTypes)];
		}
		this.type = _type;

		switch (_type) {
		case NORMAL:
			image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/se/mah/k3/pfi2/images/zombie.png"));
			this.health= (float) 9.25;
			this.velocityX= (float)-0.3;
			this.degrade= new ArrayList <Float>(Arrays.asList((float)5));
			this.width=115;
			this.height=185;
			break;
		case FLAG:
			image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/se/mah/k3/pfi2/images/flag.png"));
			this.health= (float) 9.5;
			this.velocityX= (float)-0.4;
			this.degrade= new ArrayList <Float>(Arrays.asList((float)4.75));
			this.width=135;
			this.height=225;
			//combineImage();
			break;
		case CONEHEAD:
			image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/se/mah/k3/pfi2/images/zombie.png"));
			this.health= (float) 28 ;
			this.velocityX= (float)-0.3;
			this.degrade= new ArrayList <Float>(Arrays.asList((float)7,(float)13,(float)19,(float)23));
			//this.parts.add();
			this.width=115;
			this.height=225;
			transform=type.NORMAL; // transform into type after degradation
			combineImage();
			break;

		default:
			this.health= (float) 9.25;
			this.velocityX= (float)-0.3;
			this.degrade= new ArrayList <Float>(Arrays.asList((float)5));
			this.width=115;
			this.height=185;
			break;
		}
		//ImageRotate(); // rotera innan den visas

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

	public void combineImage(){
		// load source images
		Image overlay=cone;
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		InputStream fis ;
		BufferedImage combined ;
		try { // slow loading need preload
			//overlay =  Toolkit.getDefaultToolkit().getImage(getClass().getResource("/se/mah/k3/pfi2/images/cone1.png"));
			//base  = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/se/mah/k3/pfi2/images/zombie.png"));
			combined = new BufferedImage(this.width, this.height, BufferedImage.TYPE_INT_ARGB);
			Graphics g = combined.getGraphics();
			g.drawImage(image, 0, 40, null);
			g.drawImage(overlay, 0, 0, null);


			//ByteArrayOutputStream os = new ByteArrayOutputStream();
			ImageIO.write(combined,"png", os); 
			fis = new ByteArrayInputStream(os.toByteArray());
			this.image=ImageIO.read(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}


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
	private void ImageRotate() { // !!!! ändra här  !!!  för rotering
		//Image rotatedImage= this.image; 
		InputStream fis ;
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		degree+=0.1;
		
	//	ImageIcon zombieIcon = new ImageIcon(this.image);
	//	BufferedImage rotatedZombie = new BufferedImage(zombieIcon.getIconWidth(), zombieIcon.getIconHeight(), BufferedImage.TYPE_INT_ARGB); 
		BufferedImage rotatedZombie = new BufferedImage(this.width*1, this.height*1, BufferedImage.TYPE_INT_ARGB);
	//	Graphics g = rotatedZombie.getGraphics();
		Graphics2D g2 = (Graphics2D)rotatedZombie.getGraphics();
		
		
		
		AffineTransform old = g2.getTransform();
	//	g2.setColor(new Color(255,255,255,50));
	//	g2.fillRect(0, 0, rotatedZombie.getWidth(), rotatedZombie.getHeight());
		g2.translate(rotatedZombie.getWidth()/2,rotatedZombie.getHeight()/2);
		g2.rotate(Math.toRadians(2.5*Math.sin(degree)));
		g2.drawImage(this.image,-this.image.getWidth(null)/2,-this.image.getHeight(null)/2, null);
		g2.setTransform(old);
	//	g2.rotate(Math.toRadians(90), zombieIcon.getIconHeight() / 2, zombieIcon.getIconWidth());
	
		// tilldelar samma image till rotatedImage
		/* skriv er kod här för att ändra rotatdImage
		 //först rekomenderas att göra om image till Graphic2d instans

		float grader=0; // i radianer

		//förslag på rotation:
		AffineTransform tx = AffineTransform.getRotateInstance(rotationRequired, locationX, locationY);
		AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);

		System.out.println(Math.sin(grader));
		 */
		
		try {
		ImageIO.write(rotatedZombie,"png", os);
		fis = new ByteArrayInputStream(os.toByteArray());
		this.finalImage=ImageIO.read(fis);  
		//this.image= rotatedImage; // skriv över bilden med er roterade resultat image
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	

	}
	@Override
	public Image getImage() {
		 ImageRotate();
		return this.finalImage;
	}

	@Override
	public void setPositionX(int _x) {

		this.positionX=_x;
	}

	@Override
	public void setPositionY(int _y) {

		this.positionY=_y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int _row) {
		this.row = _row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int _column) {
		this.column = _column;
	}

	public boolean isOnSquare(int _row, int _column) {
		if (square[0]==_row &&square[1]==_column ){
			return true;
		}else{
			return false;}
	}
	public boolean isOnSquare(int _square[]) {
		return onSquare[_square[0]][_square[1]];
	}

	public int [] getSquare() {
		return square;
	}

	public void setToSquare(int _row, int _column){
		square[0]=_row;
		square[1]=_column;
		onSquare=new boolean[MAX_ROWS][MAX_COLUMNS];
		onSquare[_row][_column]=true;	
	}
	public void setToSquare(int _square[]){
		square=_square;
		onSquare=new boolean[MAX_ROWS][MAX_COLUMNS];
		onSquare[_square[0]][_square[1]]=true;	
	}
	public boolean isEating(){
		return eating;
	}
	/** dumping element when not used*/
	protected void finalize() throws Throwable{
		killed++;
		System.out.println("zombie is removed from memory");
	}
}
