package mah.k3.pfi2.studentlist;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Color;

/**
 * A JDialog in which we can enter information for a new student in our list.
 * 
 * @author andreas
 * 
 */
public class NewStudentDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private NewStudentPanel addStudentPanel;

	/**
	 * Create the dialog.
	 * 
	 * We've now added a parameter "MainWindow parent" to this default
	 * constructor, this is so we can link to the parent frame.
	 */
	public NewStudentDialog(final MainWindow parent) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewStudentDialog.class.getResource("/mah/k3/pfi2/studentlist/images/logo_small.png")));

		setModal(true);
		setTitle("Add New Student");
		setResizable(false);
		setBounds(200, 200, 295, 254);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(179, 179, 179));
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			addStudentPanel = new NewStudentPanel();
			contentPanel.add(addStudentPanel);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(179, 179, 179));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Save");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						/* Save the new student in the parent (MainWindow) */
						parent.addStudent(getAddStudentPanel().getFirstName()
								.getText(), getAddStudentPanel().getLastName()
								.getText(), getAddStudentPanel().getAdress().getText(), getAddStudentPanel().getPhonenumber().getText());
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						/* Exit the dialog, don't save anything */
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}

		this.pack();
	}

	public NewStudentPanel getAddStudentPanel() {
		return addStudentPanel;
	}
}
