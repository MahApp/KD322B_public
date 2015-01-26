package se.mah.k3.pfi2;

public class Controller {
	public Controller() {
		GamePanel gamePanel = new GamePanel ();
		gamePanel.setVisible(true);
		// TODO Auto-generated constructor stub
		Zombie testZombie= new Zombie("Zombie1", 50, 100, "NormalZombie");
		Zombie testZombie2= new Zombie("Zombie2", 30, 120, "MrZombie");
		
		String s = testZombie.getName();
		System.out.println("Namnet på zombien är "+ s);
		
		s = testZombie2.getName();
		System.out.println("Namnet på zombien är "+ s);
		
	}

}
