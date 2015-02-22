package se.mah.k3.pfi2.lecture6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Listener extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField result;
	private JButton btnInnerClass;
	private JButton btnAnonymousInne;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listener frame = new Listener();
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
	public Listener() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 177);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("Class implements interface");
		btn1.setBounds(10, 39, 149, 23);
		btn1.addActionListener(this);
		contentPane.add(btn1);
		
		result = new JTextField();
		result.setBounds(246, 74, 86, 20);
		contentPane.add(result);
		result.setColumns(10);
		
		btnInnerClass = new JButton("Inner class");
		btnInnerClass.setBounds(10, 11, 89, 23);
		contentPane.add(btnInnerClass);
		
		btnAnonymousInne = new JButton("Anonymous inner");
		btnAnonymousInne.setBounds(10, 73, 167, 23);
		btnAnonymousInne.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("Clicked Anonymous");
			}
			});
		contentPane.add(btnAnonymousInne);
		
	}

	//Implement interface
	@Override
	public void actionPerformed(ActionEvent e) {
		result.setText("Clicked implements");
		
	}
	
	//Inner class
	private class Handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			result.setText("Clicked Inner class");
		}
	}

}
