package mah.k3.pfi2.studentlist;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.SystemColor;

/**
 * Composite JPanel which contains a scrollable JList
 * 
 * @author andreas
 * 
 */
public class StudentListPanel extends JPanel {

	/* Parent window, used in the JList listener */
	private MainWindow parent;

	/* JList & it's data model */
	private JList list;
	private DefaultListModel model = new DefaultListModel();

	/**
	 * Slightly modified constructor, we made a link to the MainWindow parent
	 * for this container so that we can make affect other components of the
	 * GUI.
	 * 
	 * @param parent
	 */
	public StudentListPanel(MainWindow parent) {
		setBackground(new Color(179, 179, 179));
		/* This is the only change we made really... */
		this.parent = parent;

		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null,
				null), "Student List", TitledBorder.LEADING, TitledBorder.TOP,
				null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		add(scrollPane, gbc_scrollPane);

		list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(model);
		
		/* Let the parent (MainWindow) react to changes in the JList */
		list.addListSelectionListener(parent);
	}

	/**
	 * Adds a student to the last position of the JList within this panel.
	 * 
	 * @param newStudent
	 */
	public void addStudent(Student newStudent) {
		int lastposition = getList().getModel().getSize();
		model.add(lastposition, newStudent);
	}

	/**
	 * Returns the JList component
	 * 
	 * @return JList
	 */
	public JList getList() {
		return list;
	}
}
