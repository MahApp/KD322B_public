package se.mah.k3.pfi2.lecture6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.SystemColor;

import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.border.LineBorder;

import java.awt.Color;

public class JPanelExample extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel outerInner;
	private JPanel anotherPanel;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTextField txtAText;
	private JPanel dragDropPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPanelExample frame = new JPanelExample();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public JPanelExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		anotherPanel = new JPanel();
		anotherPanel.setVisible(false);
		anotherPanel.setBorder(new TitledBorder(null, "Another JPanel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		anotherPanel.setBackground(SystemColor.inactiveCaption);
		anotherPanel.setBounds(91, 50, 128, 142);
		contentPane.add(anotherPanel);
		anotherPanel.setLayout(null);
		
		txtAText = new JTextField();
		txtAText.setText("A text");
		txtAText.setBounds(10, 21, 86, 20);
		anotherPanel.add(txtAText);
		txtAText.setColumns(10);
		
		btnNewButton_2 = new JButton("ShowMessage");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(JPanelExample.this, "Show a text: "+txtAText.getText());
			}
		});
		btnNewButton_2.setBounds(10, 52, 89, 23);
		anotherPanel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("DragDrop");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				anotherPanel.setVisible(false);
				dragDropPanel.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(7, 86, 89, 23);
		anotherPanel.add(btnNewButton_3);
		
		outerInner = new JPanel();
		outerInner.setBackground(SystemColor.activeCaptionBorder);
		outerInner.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Outer + Inner class", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		outerInner.setBounds(10, 11, 120, 114);
		contentPane.add(outerInner);
		outerInner.setLayout(null);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Thread t = new InnerClass();
				t.start();
			}
		});
		btnNewButton.setBounds(10, 21, 89, 23);
		outerInner.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(13, 55, 86, 20);
		outerInner.add(textField);
		textField.setColumns(10);
		
		JButton btnHideThis = new JButton("Hide this");
		btnHideThis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(JPanelExample.this, "Vill du gå vidare?");
				if (i == JOptionPane.YES_OPTION){
					outerInner.setVisible(false);
					anotherPanel.setVisible(true);
				}
			}
		});
		btnHideThis.setBounds(10, 86, 89, 23);
		outerInner.add(btnHideThis);
		
		dragDropPanel = new JPanel();
		dragDropPanel.setVisible(false);
		dragDropPanel.setBorder(new TitledBorder(null, "MouseListener", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		dragDropPanel.setBackground(SystemColor.inactiveCaptionBorder);
		dragDropPanel.setBounds(10, 11, 494, 250);
		contentPane.add(dragDropPanel);
	}
	
	//Inner class thread
	private class InnerClass extends Thread{
		private int timeBetweenRepaint = 1000; //in Millisec so seconds here
		private int clicks=0;
		private long timer = System.currentTimeMillis();
		@Override
		public void run() {
			while (true){
				if (System.currentTimeMillis() - timer > timeBetweenRepaint) { 
					   timer = timer + timeBetweenRepaint;
					   clicks = clicks+1;
					   //Access the outer class like this
					   JPanelExample.this.textField.setText("Like this: "+clicks);
					   //or like this
					   textField.setText("Or like this: "+clicks);
				 }
			}
		}
	}
}
