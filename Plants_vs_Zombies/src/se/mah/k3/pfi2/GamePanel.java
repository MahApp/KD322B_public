package se.mah.k3.pfi2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

import java.awt.FlowLayout;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import java.util.ArrayList;

public class GamePanel extends JFrame {

	private JPanel contentPane;
	private JTextArea gameInfotextArea;
	/**
	 * Create the frame.
	 */
	public GamePanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 623);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "GameInfo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 380, 528, 193);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 21, 508, 161);
		panel.add(scrollPane);
		
		gameInfotextArea = new JTextArea();
		scrollPane.setViewportView(gameInfotextArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 204, 51));
		panel_1.setBorder(new TitledBorder(null, "GamePanel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 11, 528, 358);
		contentPane.add(panel_1);
		
	}
	
	public void printZombies(ArrayList<Zombie> myZombies){
		for (Zombie z : myZombies) {
			gameInfotextArea.append(z.getName()+"\n");
		}
	}
	
	public void printSuns(ArrayList<Sun> mySuns){
		for (Sun s : mySuns) {
			gameInfotextArea.append(s.getName()+"\n");
		}
	}
	public void printPlants(ArrayList<Plant> myPlants){
		for (Plant p : myPlants) {
			gameInfotextArea.append(p.getName()+"\n");
		}
	}
}
