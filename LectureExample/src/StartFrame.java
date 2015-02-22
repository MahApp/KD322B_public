import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;


public class StartFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame frame = new StartFrame();
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
	public StartFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(304, 27, 89, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.orange);
		panel.setForeground(Color.RED);
		panel.setBounds(75, 100, 232, 129);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(119, 32, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(43, 35, 46, 14);
		panel.add(lblName);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(92, 95, 89, 23);
		panel.add(btnNewButton_1);
		minKod();
		minAndraKod();
		
		//Deklarera en Toastervariabel
		Toaster myRedLittleToaster; 
		//Instansiera (skapa) en toaster med plats för ett bröd
		myRedLittleToaster = new Toaster(1); 
		myRedLittleToaster.setTimeLeft(135); //ange sekunder rosttid
		myRedLittleToaster.toastBread(); //Rosta ett bröd
		int timeLeft = myRedLittleToaster.getTimeLeft(); //Hämta ut tid kvar
		System.out.println("Tid kvar: " + timeLeft); //Skriv ut hur mycket tid som är kvar
	}

	private void minAndraKod() {
		//Deklarera och skapa en array med plats för 50 brödrostar
		int size = 50;
		Toaster[] myToasters = new Toaster[size];

		//Tilldela första och 5:e platsen i arrayen en toaster:
		myToasters[0] = new Toaster(2);
		myToasters[5] = new Toaster(4);
		
		//Ställ in tid på dessa 
		myToasters[0].setTimeLeft(175);
		myToasters[5].setTimeLeft(200);
		
		//Rosta 
		myToasters[0].toastBread();
		myToasters[5].toastBread();
				
		//Loopa igenom hela arrayen och skriv tid kvar för alla Toaster 
		//platser som inte är tomma:
		for(int i=0; i< myToasters.length; i++){
			if(myToasters[i]!=null){
				System.out.println("Tid kvar: "+myToasters[i].getTimeLeft());
			}
		}

		
	}

	private void minKod() {
		int i = 10;
		String[] sA = new String[12];
		for (int j = 0; j < sA.length; j++) {
			int k = 24;	
		}
		
	}
}
