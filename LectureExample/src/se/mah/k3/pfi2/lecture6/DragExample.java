package se.mah.k3.pfi2.lecture6;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

//import com.sun.corba.se.impl.orbutil.RepIdDelegator_1_3_1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

public class DragExample extends JFrame {

	private JPanel contentPane;
	boolean dragPea = false;
	MyPanel panel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DragExample frame = new DragExample();
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
	public DragExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new MyPanel();
		panel.setBounds(10, 156, 516, 229);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 516, 106);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println(e.getX()+" : "+e.getY());
				panel.drawIt(e.getX(),e.getY());
			}
		});

		lblNewLabel.setIcon(new ImageIcon(DragExample.class.getResource("/se/mah/k3/pfi2/images/Peashooter1.png")));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(DragExample.class.getResource("/se/mah/k3/pfi2/images/Sunflower1.png")));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(DragExample.class.getResource("/se/mah/k3/pfi2/images/Wall-nut1.png")));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(DragExample.class.getResource("/se/mah/k3/pfi2/images/Cherry_Bomb1.png")));
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(DragExample.class.getResource("/se/mah/k3/pfi2/images/Potato_Mine1.png")));
		panel_1.add(lblNewLabel_4);
	}
	
	private class MyPanel extends JPanel implements MouseListener{
		
		int x =10;
		int y=10;
		boolean putItHere = true;
		public MyPanel() {
			addMouseListener(this);
		}
		public void drawIt(int x2, int y2) {
			putItHere = true;
			x = x2;
			y = y2;
			repaint();
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			System.out.println("Painting");
			if(putItHere){
				g.drawImage(Toolkit.getDefaultToolkit().getImage(DragExample.class.getResource("/se/mah/k3/pfi2/images/Potato_Mine1.png")),x-45,y-150,null);
			}
		}		
		@Override
		public void mouseReleased(MouseEvent arg0) {
			putItHere = false;			
		}
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub		
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub		
		}
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub		
		}
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub	
		}
	}
}
