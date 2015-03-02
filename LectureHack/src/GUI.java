import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;


public class GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(47, 79, 79));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblRainImage = new JLabel("");
		lblRainImage.setIcon(new ImageIcon(GUI.class.getResource("/images/rain.png")));
		lblRainImage.setBounds(-80, 22, 357, 323);
		panel.add(lblRainImage);
		
		JLabel lblPlaceName = new JLabel("ORTSNAMN");
		lblPlaceName.setForeground(new Color(255, 255, 255));
		lblPlaceName.setFont(new Font("Century Gothic", Font.BOLD, 70));
		lblPlaceName.setBounds(10, 11, 404, 67);
		panel.add(lblPlaceName);
		
		JLabel lblSunImage = new JLabel("");
		lblSunImage.setIcon(new ImageIcon(GUI.class.getResource("/images/sun Copy.png")));
		lblSunImage.setBounds(-139, 11, 492, 444);
		panel.add(lblSunImage);
		
		JLabel labelTemperature = new JLabel("00");
		labelTemperature.setForeground(new Color(255, 255, 255));
		labelTemperature.setFont(new Font("Century Gothic", Font.BOLD, 99));
		labelTemperature.setBounds(176, 68, 191, 160);
		panel.add(labelTemperature);
		
		JLabel lblCelsius = new JLabel("\u00B0C");
		lblCelsius.setForeground(new Color(255, 255, 255));
		lblCelsius.setFont(new Font("Century Gothic", Font.BOLD, 90));
		lblCelsius.setBounds(287, 67, 157, 168);
		panel.add(lblCelsius);
		
		JLabel lblMolnImage = new JLabel("New label");
		lblMolnImage.setIcon(new ImageIcon(GUI.class.getResource("/images/moln.png")));
		lblMolnImage.setBounds(-54, 50, 331, 266);
		panel.add(lblMolnImage);
	}
}
