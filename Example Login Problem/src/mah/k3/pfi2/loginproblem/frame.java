package mah.k3.pfi2.loginproblem;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Toolkit;


public class frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
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
	public frame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\anders\\workspace\\Copy of The Login Problem\\images\\program-icon.png"));
		setTitle("About");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 268, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
		);
		
		JLabel lblCompanyLtd = new JLabel("Copyright \u00A9 2010 Larmen Software");
		lblCompanyLtd.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCompanyLtd.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblWwwcompanyltdcom = new JLabel("For more info please visit www.companyltd.com");
		lblWwwcompanyltdcom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblEmployeeManagingSoftware = new JLabel("Employee managing software for Company Ltd.");
		lblEmployeeManagingSoftware.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblVersion = new JLabel("Version");
		lblVersion.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblWebsite = new JLabel("Website");
		lblWebsite.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblWwwlarmencom = new JLabel("www.larmen.com");
		lblWwwlarmencom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel label_2 = new JLabel("1.0");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblLarmenSoftware = new JLabel("Larmen Software");
		lblLarmenSoftware.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEmployeeManagingSoftware)
						.addComponent(lblWwwcompanyltdcom)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblAuthor)
							.addGap(18)
							.addComponent(lblLarmenSoftware))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblWebsite)
								.addComponent(lblVersion))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_2)
								.addComponent(lblWwwlarmencom)))
						.addComponent(lblCompanyLtd))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addComponent(lblEmployeeManagingSoftware)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblWwwcompanyltdcom)
					.addGap(40)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAuthor)
						.addComponent(lblLarmenSoftware))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblVersion)
						.addComponent(label_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblWebsite)
						.addComponent(lblWwwlarmencom))
					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
					.addComponent(lblCompanyLtd)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setIcon(new ImageIcon("C:\\Users\\anders\\workspace\\Copy of The Login Problem\\images\\Untitled-3.png"));
		
		JSeparator separator = new JSeparator();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
					.addGap(147))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
