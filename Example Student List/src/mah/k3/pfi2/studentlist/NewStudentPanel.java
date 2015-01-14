package mah.k3.pfi2.studentlist;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 * Composite JPanel, describes all the fields we need to enter for our new
 * Students.
 * 
 * @author andreas
 * 
 */
public class NewStudentPanel extends JPanel {
	private JTextField firstName;
	private JTextField lastName;
	private JTextField adress;
	private JTextField phonenumber;

	/**
	 * Create the panel.
	 */
	public NewStudentPanel() {
		setBackground(new Color(179, 179, 179));
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null,
				null), "Student information", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(51, 51, 51)));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 75, 115, 0 };
		gridBagLayout.rowHeights = new int[] { 18, 18, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblFirstName = new JLabel("First name");
		GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
		gbc_lblFirstName.anchor = GridBagConstraints.EAST;
		gbc_lblFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstName.gridx = 0;
		gbc_lblFirstName.gridy = 0;
		add(lblFirstName, gbc_lblFirstName);

		firstName = new JTextField();
		GridBagConstraints gbc_firstName = new GridBagConstraints();
		gbc_firstName.insets = new Insets(0, 0, 5, 0);
		gbc_firstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_firstName.gridx = 1;
		gbc_firstName.gridy = 0;
		add(firstName, gbc_firstName);
		firstName.setColumns(10);
								
										JLabel lblLastName = new JLabel("Last name");
										GridBagConstraints gbc_lblLastName = new GridBagConstraints();
										gbc_lblLastName.anchor = GridBagConstraints.EAST;
										gbc_lblLastName.insets = new Insets(0, 0, 5, 5);
										gbc_lblLastName.gridx = 0;
										gbc_lblLastName.gridy = 1;
										add(lblLastName, gbc_lblLastName);
						
								lastName = new JTextField();
								GridBagConstraints gbc_lastName = new GridBagConstraints();
								gbc_lastName.insets = new Insets(0, 0, 5, 0);
								gbc_lastName.fill = GridBagConstraints.HORIZONTAL;
								gbc_lastName.gridx = 1;
								gbc_lastName.gridy = 1;
								add(lastName, gbc_lastName);
								lastName.setColumns(10);
								
								
								
								JLabel lblAdress = new JLabel("Adress");
								GridBagConstraints gbc_lblAdress = new GridBagConstraints();
								gbc_lblAdress.anchor = GridBagConstraints.EAST;
								gbc_lblAdress.insets = new Insets(0, 0, 5, 5);
								gbc_lblAdress.gridx = 0;
								gbc_lblAdress.gridy = 2;
								add(lblAdress, gbc_lblAdress);
						
								adress = new JTextField();
								GridBagConstraints gbc_adress = new GridBagConstraints();
								gbc_adress.insets = new Insets(0, 0, 5, 0);
								gbc_adress.fill = GridBagConstraints.HORIZONTAL;
								gbc_adress.gridx = 1;
								gbc_adress.gridy = 2;
								add(adress, gbc_adress);
								adress.setColumns(10);
								
								
								
								
								
								JLabel lblPhonenumber = new JLabel("Phonenumber");
								GridBagConstraints gbc_lblPhonenumber = new GridBagConstraints();
								gbc_lblPhonenumber.anchor = GridBagConstraints.EAST;
								gbc_lblPhonenumber.insets = new Insets(0, 0, 5, 5);
								gbc_lblPhonenumber.gridx = 0;
								gbc_lblPhonenumber.gridy = 4;
								add(lblPhonenumber, gbc_lblPhonenumber);
						
								phonenumber = new JTextField();
								GridBagConstraints gbc_phonenumber = new GridBagConstraints();
								gbc_phonenumber.insets = new Insets(0, 0, 5, 0);
								gbc_phonenumber.fill = GridBagConstraints.HORIZONTAL;
								gbc_phonenumber.gridx = 1;
								gbc_phonenumber.gridy = 4;
								add(phonenumber, gbc_phonenumber);
								phonenumber.setColumns(10);

	}

	public JTextField getFirstName() {
		return firstName;
	}

	public JTextField getLastName() {
		return lastName;
	}
	
	public JTextField getAdress() {
		return adress;
	}
	
	public JTextField getPhonenumber() {
		return phonenumber;
	}
}
