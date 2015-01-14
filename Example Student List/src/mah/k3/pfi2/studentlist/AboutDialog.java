package mah.k3.pfi2.studentlist;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

/**
 * A basic "About dialog".
 * 
 * @author andreas
 * 
 */
public class AboutDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public AboutDialog() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AboutDialog.class.getResource("/mah/k3/pfi2/studentlist/images/logo_small.png")));
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 450, 222);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(179, 179, 179));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel label = new JLabel("");
		label.setBackground(new Color(179, 179, 179));
		label.setIcon(new ImageIcon(AboutDialog.class.getResource("/mah/k3/pfi2/studentlist/images/logo.png")));
		label.setSize(new Dimension(150, 150));
		label.setPreferredSize(new Dimension(150, 150));
		JLabel lblStudentListApplication = new JLabel(
				"Student List Application");
		lblStudentListApplication.setFont(new Font("Dialog", Font.BOLD, 18));
		JLabel lblOneSentenceDescription = new JLabel(
				"<html>One sentence description of the <br>application and it's core functionality.</html>");
		lblOneSentenceDescription.setFont(new Font("Dialog", Font.PLAIN, 12));

		JLabel lblAuthor = new JLabel("Author");

		JLabel lblVersion = new JLabel("Version");

		JLabel lblWebsite = new JLabel("Website");

		JLabel lblmalmUniversity = new JLabel("http://www.mah.se");
		lblmalmUniversity.setFont(new Font("Dialog", Font.PLAIN, 12));

		JLabel label_2 = new JLabel("1.0");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 12));

		JLabel lblMyNameOr = new JLabel("Mr Nobody");
		lblMyNameOr.setFont(new Font("Dialog", Font.PLAIN, 12));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel
				.setHorizontalGroup(gl_contentPanel
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPanel
										.createSequentialGroup()
										.addComponent(label,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addGroup(
												gl_contentPanel
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblStudentListApplication,
																GroupLayout.DEFAULT_SIZE,
																256,
																Short.MAX_VALUE)
														.addComponent(
																lblOneSentenceDescription,
																GroupLayout.PREFERRED_SIZE,
																256,
																Short.MAX_VALUE)
														.addGroup(
																gl_contentPanel
																		.createSequentialGroup()
																		.addGroup(
																				gl_contentPanel
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								lblAuthor)
																						.addComponent(
																								lblVersion)
																						.addComponent(
																								lblWebsite))
																		.addGroup(
																				gl_contentPanel
																						.createParallelGroup(
																								Alignment.TRAILING)
																						.addGroup(
																								gl_contentPanel
																										.createSequentialGroup()
																										.addGap(18)
																										.addComponent(
																												lblmalmUniversity,
																												GroupLayout.DEFAULT_SIZE,
																												199,
																												Short.MAX_VALUE))
																						.addGroup(
																								Alignment.LEADING,
																								gl_contentPanel
																										.createSequentialGroup()
																										.addGap(16)
																										.addGroup(
																												gl_contentPanel
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																lblMyNameOr,
																																Alignment.TRAILING,
																																GroupLayout.DEFAULT_SIZE,
																																201,
																																Short.MAX_VALUE)
																														.addComponent(
																																label_2,
																																GroupLayout.DEFAULT_SIZE,
																																201,
																																Short.MAX_VALUE))))))
										.addContainerGap()));
		gl_contentPanel
				.setVerticalGroup(gl_contentPanel
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPanel
										.createSequentialGroup()
										.addGroup(
												gl_contentPanel
														.createParallelGroup(
																Alignment.LEADING,
																false)
														.addComponent(
																label,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																gl_contentPanel
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				lblStudentListApplication)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				lblOneSentenceDescription)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addGroup(
																				gl_contentPanel
																						.createParallelGroup(
																								Alignment.BASELINE)
																						.addComponent(
																								lblAuthor)
																						.addComponent(
																								lblMyNameOr))
																		.addGap(8)
																		.addGroup(
																				gl_contentPanel
																						.createParallelGroup(
																								Alignment.BASELINE)
																						.addComponent(
																								lblVersion)
																						.addComponent(
																								label_2))
																		.addGap(8)
																		.addGroup(
																				gl_contentPanel
																						.createParallelGroup(
																								Alignment.BASELINE)
																						.addComponent(
																								lblWebsite)
																						.addComponent(
																								lblmalmUniversity))))
										.addGap(2)));
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(179, 179, 179));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						/* Exit the dialog when we press OK */
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
