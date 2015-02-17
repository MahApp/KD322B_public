import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	
	ClockLogic clockLogic = new ClockLogic(null);
	
	public DigitalClockGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(78, 31, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(78, 82, 134, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Set alarm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SETALARM
				//setAlarm(Integer.parseInt(textField.getText()), Integer.parseInt(textField_1.getText()));
			}
		});
		btnNewButton.setBounds(272, 32, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnClearAlarm = new JButton("Clear alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CLEARALARM
			}
		});
		btnClearAlarm.setBounds(272, 83, 117, 29);
		contentPane.add(btnClearAlarm);
		
		JLabel lblHour = new JLabel("Hour:");
		lblHour.setBounds(41, 37, 35, 16);
		contentPane.add(lblHour);
		
		JLabel lblMinute = new JLabel("Minute:");
		lblMinute.setBounds(29, 88, 47, 16);
		contentPane.add(lblMinute);
	}
}
