package mah.k3.pfi2.studentlist;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import java.awt.Color;

/**
 * Information panel, read-only composite JPanel.
 * 
 * @author andreas
 * 
 */
public class ShowStudentPanel extends JPanel {
	private JLabel firstname;
	private JLabel lastname;
	private JLabel lblId;
	private JLabel id;
	private JLabel adress;
	private JLabel phonenumber;

	/**
	 * Create the panel.
	 */
	public ShowStudentPanel() {
		setBackground(new Color(179, 179, 179));
		
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null,
				null), "Student", TitledBorder.LEADING, TitledBorder.TOP, null,
				null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 100, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		lblId = new JLabel("id");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.WEST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		add(lblId, gbc_lblId);

		id = new JLabel("...");
		id.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_id = new GridBagConstraints();
		gbc_id.anchor = GridBagConstraints.EAST;
		gbc_id.insets = new Insets(0, 0, 5, 0);
		gbc_id.gridx = 1;
		gbc_id.gridy = 0;
		add(id, gbc_id);

		JLabel lblFirstName = new JLabel("First Name");
		GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
		gbc_lblFirstName.anchor = GridBagConstraints.WEST;
		gbc_lblFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstName.gridx = 0;
		gbc_lblFirstName.gridy = 1;
		add(lblFirstName, gbc_lblFirstName);

		firstname = new JLabel("...");
		firstname.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_firstname = new GridBagConstraints();
		gbc_firstname.anchor = GridBagConstraints.EAST;
		gbc_firstname.insets = new Insets(0, 0, 5, 0);
		gbc_firstname.gridx = 1;
		gbc_firstname.gridy = 1;
		add(firstname, gbc_firstname);

		JLabel lblLastName = new JLabel("Last Name");
		GridBagConstraints gbc_lblLastName = new GridBagConstraints();
		gbc_lblLastName.anchor = GridBagConstraints.WEST;
		gbc_lblLastName.insets = new Insets(0, 0, 0, 5);
		gbc_lblLastName.gridx = 0;
		gbc_lblLastName.gridy = 2;
		add(lblLastName, gbc_lblLastName);

		lastname = new JLabel("...");
		lastname.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lastname = new GridBagConstraints();
		gbc_lastname.anchor = GridBagConstraints.EAST;
		gbc_lastname.gridx = 1;
		gbc_lastname.gridy = 2;
		add(lastname, gbc_lastname);
		
		
		
		JLabel lblAdress = new JLabel("Adress");
		GridBagConstraints gbc_lblAdress = new GridBagConstraints();
		gbc_lblAdress.anchor = GridBagConstraints.WEST;
		gbc_lblAdress.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdress.gridx = 0;
		gbc_lblAdress.gridy = 3;
		add(lblAdress, gbc_lblAdress);

		adress = new JLabel("...");
		adress.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_adress = new GridBagConstraints();
		gbc_adress.anchor = GridBagConstraints.EAST;
		gbc_adress.gridx = 1;
		gbc_adress.gridy = 3;
		add(adress, gbc_adress);
		
		
		
		
		
		JLabel lblPhonenumber = new JLabel("Phone number");
		GridBagConstraints gbc_lblPhonenumber = new GridBagConstraints();
		gbc_lblPhonenumber.anchor = GridBagConstraints.WEST;
		gbc_lblPhonenumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhonenumber.gridx = 0;
		gbc_lblPhonenumber.gridy = 4;
		add(lblPhonenumber, gbc_lblPhonenumber);

		phonenumber = new JLabel("...");
		phonenumber.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_phonenumber = new GridBagConstraints();
		gbc_phonenumber.anchor = GridBagConstraints.EAST;
		gbc_phonenumber.gridx = 1;
		gbc_phonenumber.gridy = 4;
		add(phonenumber, gbc_phonenumber);
		

	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id.setText(id);
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname.getText();
	}

	/**
	 * @param firstname
	 *            the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname.setText(firstname);
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname.getText();
	}

	/**
	 * @param lastname
	 *            the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname.setText(lastname);
	}
	
	public void setAdress(String adress) {
		this.adress.setText(adress);
	}

	
	public void setPhonenumber(String phonenumber) {
		this.phonenumber.setText(phonenumber);
	}
	
	/**
	 * Change the contens of the JLabels that describe the selected student.
	 * 
	 * @param student
	 */
	public void setSelection(Student student) {
		setId(Integer.toString(student.getId()));
		setFirstname(student.getFirstName());
		setLastname(student.getLastName());
		setAdress(student.getAdress());
		setPhonenumber(student.getPhonenumber());
	}
}
