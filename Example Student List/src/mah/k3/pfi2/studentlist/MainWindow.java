package mah.k3.pfi2.studentlist;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Dimension;

/**
 * The application main window.
 * 
 * @author andreas
 * 
 */
public class MainWindow extends JFrame implements ListSelectionListener {

	private JPanel contentPane;
	/* The custom panels */
	private StudentListPanel studentListPanel;
	private ShowStudentPanel showStudentPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/mah/k3/pfi2/studentlist/images/logo_small.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 442);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmNew = new JMenuItem("New Student");
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewStudentDialog dialog = new NewStudentDialog(MainWindow.this);
				dialog.setVisible(true);
			}
		});
		mnFile.add(mntmNew);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/* Close the JFrame */
				dispose();
			}
		});
		mnFile.add(mntmExit);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/* Show the about dialog */
				AboutDialog aboutDialog = new AboutDialog();
				aboutDialog.setVisible(true);
			}
		});
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(179, 179, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		studentListPanel = new StudentListPanel(MainWindow.this);
		studentListPanel.setMinimumSize(new Dimension(200, 200));
		studentListPanel.setMaximumSize(new Dimension(200, 200));
		studentListPanel.setPreferredSize(new Dimension(200, 200));

		showStudentPanel = new ShowStudentPanel();
		
		JLabel label = new JLabel("");
		label.setBackground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("C:\\Users\\anders\\workspace\\Copy of Student List\\images\\MAH_SVE_RGB_72dpi_copy.jpg"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(studentListPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addComponent(showStudentPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(studentListPanel, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(showStudentPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);

		pack();
	}

	/**
	 * Returns the panel that contains a list of all the current students
	 * 
	 * @return the StudentListPanel
	 */
	public StudentListPanel getStudentListPanel() {
		return studentListPanel;
	}

	/**
	 * Returns the information panel that shows the name of the selected student
	 * 
	 * @return ShowStudentPanel
	 */
	public ShowStudentPanel getShowStudentPanel() {
		return showStudentPanel;
	}

	/*
	 * We use this variable when creating new students in the list, as a unique
	 * identifier for each student object. By calling id++ in the constructor
	 * for the Student object we automatically increase the value of ID every
	 * time we add a new Student.
	 */
	private static int id = 0;

	/**
	 * Add a student with the first name fname and the lastname lname
	 * 
	 * @param fname
	 * @param lname
	 * @param padress
	 */
	public void addStudent(String fname, String lname, String padress, String sPhonenumber) {
		getStudentListPanel().addStudent(new Student(id++, fname, lname, padress, sPhonenumber));
	}

	/**
	 * The ListSelectionEventListener method, this method is called every time
	 * the selection inside the list changes.
	 */
	@Override
	public void valueChanged(ListSelectionEvent evt) {
		/*
		 * Here we have to do some "magic". The item we get from the JList with
		 * ".getSelectedValue()" returns an arbitrary Object type, so we need to
		 * cast that item to a "Student" object. But before we can get that
		 * selected value we need to find the JList that contains it.
		 * 
		 * ((JList) evt.getSource()) - gives us the JList **********************
		 * (Student) JList.getSelectedValue() - gives us the Student object ****
		 * getShowStudentPanel().setSelection( Student ) - updates the infopanel
		 */
		getShowStudentPanel().setSelection(
				(Student) ((JList) evt.getSource()).getSelectedValue());
	}
}
