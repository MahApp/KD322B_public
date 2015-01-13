package se.mah.k3.pfi2vt15;

import javax.swing.JPanel;
import javax.swing.JButton;

public class MyPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MyPanel() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(47, 61, 89, 23);
		add(btnNewButton);

	}

}
