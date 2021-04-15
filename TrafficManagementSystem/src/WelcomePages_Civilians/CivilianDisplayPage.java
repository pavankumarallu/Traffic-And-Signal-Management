package WelcomePages_Civilians;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import db_connections.ChallanModel;
import db_connections.Challan_db;
import db_connections.Trafficwarns;

import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class CivilianDisplayPage extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTable table;
	JLayeredPane layeredPane;

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CivilianDisplayPage frame = new CivilianDisplayPage();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public void switchPanels(JPanel jPanel)
	{
		layeredPane.removeAll();
		layeredPane.add(jPanel);
		layeredPane.repaint();
		layeredPane.revalidate();

	}
	
	public CivilianDisplayPage(String Vehicle) {
		
		ArrayList<ChallanModel> cmeach = new ArrayList<ChallanModel>();
		Challan_db cdb = new Challan_db();
		cmeach = cdb.fetchEach(Vehicle);
		
		Trafficwarns tw = new Trafficwarns();
		ArrayList<String> warns = new ArrayList<String>();
		warns = tw.gw(Vehicle);
				
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1230, 734);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(88,88,215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(new Color(37,37,112));
		panel.setBounds(0, 0, 1234, 130);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		btnBack.setBackground(new Color(86, 86, 211));
		btnBack.setBounds(1091, 44, 93, 41);
		panel.add(btnBack);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 126, 1216, 561);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel Trafficrulespanel = new JPanel();
		Trafficrulespanel.setBackground(new Color(88,88,215));
		layeredPane.add(Trafficrulespanel, "name_43889333257000");
		Trafficrulespanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Do follow these rules");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 37));
		lblNewLabel_1.setBounds(350, 10, 471, 59);
		Trafficrulespanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("I->");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(116, 168, 28, 31);
		Trafficrulespanel.add(lblNewLabel);
		
		JLabel lblDoNotDrink = new JLabel("Do Not Drink and Drive. ");
		lblDoNotDrink.setForeground(Color.WHITE);
		lblDoNotDrink.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 23));
		lblDoNotDrink.setBounds(154, 168, 452, 31);
		Trafficrulespanel.add(lblDoNotDrink);
		
		JLabel lblNewLabel_2 = new JLabel("I->");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		lblNewLabel_2.setBounds(116, 222, 28, 31);
		Trafficrulespanel.add(lblNewLabel_2);
		
		JLabel lblAlwaysOwnValid = new JLabel("Always Own Valid Car Insurance Policy.");
		lblAlwaysOwnValid.setForeground(Color.WHITE);
		lblAlwaysOwnValid.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 23));
		lblAlwaysOwnValid.setBounds(154, 222, 452, 31);
		Trafficrulespanel.add(lblAlwaysOwnValid);
		
		JLabel lblNewLabel_2_1 = new JLabel("I->");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		lblNewLabel_2_1.setBounds(116, 277, 28, 31);
		Trafficrulespanel.add(lblNewLabel_2_1);
		
		JLabel lblWearYourSeatbelt = new JLabel("Wear your seatbelt while Driving a Car.");
		lblWearYourSeatbelt.setForeground(Color.WHITE);
		lblWearYourSeatbelt.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 23));
		lblWearYourSeatbelt.setBounds(154, 277, 452, 31);
		Trafficrulespanel.add(lblWearYourSeatbelt);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("I->");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		lblNewLabel_2_1_1.setBounds(116, 332, 28, 31);
		Trafficrulespanel.add(lblNewLabel_2_1_1);
		
		JLabel lblDoNotDrink_2_1 = new JLabel("Do Not Ride a Two-Wheeler without a Helmet On.");
		lblDoNotDrink_2_1.setForeground(Color.WHITE);
		lblDoNotDrink_2_1.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 23));
		lblDoNotDrink_2_1.setBounds(154, 332, 590, 31);
		Trafficrulespanel.add(lblDoNotDrink_2_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("I->");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		lblNewLabel_2_1_1_1.setBounds(116, 385, 28, 31);
		Trafficrulespanel.add(lblNewLabel_2_1_1_1);
		
		JLabel lblDoNotDrink_2_1_1 = new JLabel("Do Not Over Speed");
		lblDoNotDrink_2_1_1.setForeground(Color.WHITE);
		lblDoNotDrink_2_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 23));
		lblDoNotDrink_2_1_1.setBounds(806, 222, 452, 31);
		Trafficrulespanel.add(lblDoNotDrink_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("I->");
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		lblNewLabel_2_1_1_1_1.setBounds(754, 168, 28, 31);
		Trafficrulespanel.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblDoNotJump = new JLabel("Do Not Jump the Red Light.");
		lblDoNotJump.setForeground(Color.WHITE);
		lblDoNotJump.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 23));
		lblDoNotJump.setBounds(806, 168, 452, 31);
		Trafficrulespanel.add(lblDoNotJump);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("I->");
		lblNewLabel_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		lblNewLabel_2_1_1_1_1_1.setBounds(754, 222, 28, 31);
		Trafficrulespanel.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNeverDoThe = new JLabel("Never do the Multitask While Walking on Roads");
		lblNeverDoThe.setForeground(Color.WHITE);
		lblNeverDoThe.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 23));
		lblNeverDoThe.setBounds(154, 385, 529, 31);
		Trafficrulespanel.add(lblNeverDoThe);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("I->");
		lblNewLabel_2_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(754, 277, 28, 31);
		Trafficrulespanel.add(lblNewLabel_2_1_1_1_1_1_1);
		
		JLabel lblDoNotDrink_2_1_1_1 = new JLabel("Always Use Sidewalk");
		lblDoNotDrink_2_1_1_1.setForeground(Color.WHITE);
		lblDoNotDrink_2_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 23));
		lblDoNotDrink_2_1_1_1.setBounds(806, 277, 452, 31);
		Trafficrulespanel.add(lblDoNotDrink_2_1_1_1);
		
		JPanel PenaltiesPanel = new JPanel();
		PenaltiesPanel.setBackground(new Color(88, 88, 215));
		layeredPane.add(PenaltiesPanel, "name_43926459139100");
		PenaltiesPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 259, 790, 266);
		PenaltiesPanel.add(scrollPane);
		
		table = new JTable();
		DefaultTableModel model = new DefaultTableModel();
		Object [] column = {"S.no.","Date","Offense","Fine"};
		model.setColumnIdentifiers(column);
		table.setModel(model);
		final Object[] row = new Object[4];
		int k =1;
		for (int i = cmeach.size()-1; i >=0; i--) {
			row[0] = k;
			row[1] = cmeach.get(i).getDate();
			row[2] = cmeach.get(i).getOffense();
			row[3] = cmeach.get(i).getFine();
			model.addRow(row);
			k++;
		}
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(86, 29, 170, 39);
		PenaltiesPanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Vehicle No. ");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(86, 76, 170, 27);
		PenaltiesPanel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Phone Number");
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(86, 112, 170, 39);
		PenaltiesPanel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel(":");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(266, 36, 45, 25);
		PenaltiesPanel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel(":");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_2_2_1.setBounds(266, 77, 45, 25);
		PenaltiesPanel.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel(":");
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_2_2_2.setBounds(266, 119, 45, 25);
		PenaltiesPanel.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel(cmeach.get(0).getName());
		lblNewLabel_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_3.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_1_1_3.setBounds(321, 35, 315, 27);
		PenaltiesPanel.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel(cmeach.get(0).getVehicleno());
		lblNewLabel_1_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_1_4.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_1_1_4.setBounds(321, 76, 170, 27);
		PenaltiesPanel.add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel(cmeach.get(0).getPhoneNumber());
		lblNewLabel_1_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_1_5.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_1_1_5.setBounds(321, 112, 170, 39);
		PenaltiesPanel.add(lblNewLabel_1_1_5);
		
		JButton btnPayPenalty = new JButton("Pay Penalty");
		btnPayPenalty.setForeground(Color.WHITE);
		btnPayPenalty.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		btnPayPenalty.setBackground(new Color(37, 37, 113));
		btnPayPenalty.setBounds(875, 383, 280, 47);
		PenaltiesPanel.add(btnPayPenalty);
		
		JLabel lblNewLabel_1_2 = new JLabel("Penalty records  :");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 26));
		lblNewLabel_1_2.setBounds(38, 202, 252, 47);
		PenaltiesPanel.add(lblNewLabel_1_2);
		
		JPanel warningspanel = new JPanel();
		warningspanel.setBackground(new Color(88, 88, 215));
		layeredPane.add(warningspanel, "name_43929978727900");
		warningspanel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.WHITE);
		textArea.setFont(new Font("Tempus Sans ITC", Font.BOLD, 21));
		textArea.setLineWrap(true);
		textArea.setBackground(new Color(88,88,215));
		textArea.setBounds(183, 121, 875, 346);
		for (String object : warns) {
			textArea.append("|->  "+object+"\n");
			
		}
		warningspanel.add(textArea);
		
		JLabel lblNewLabel_3 = new JLabel("Warnings");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 28));
		lblNewLabel_3.setBounds(508, 30, 221, 45);
		warningspanel.add(lblNewLabel_3);
		
		
		JButton btnRules = new JButton("Rules");
		btnRules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Trafficrulespanel);
			}
			
		});
		btnRules.setForeground(Color.WHITE);
		btnRules.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		btnRules.setBackground(new Color(86, 86, 211));
		btnRules.setBounds(61, 44, 219, 41);
		panel.add(btnRules);
		
		JButton btnFines = new JButton("Fines");
		btnFines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(PenaltiesPanel);
			}
		});
		btnFines.setForeground(Color.WHITE);
		btnFines.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		btnFines.setBackground(new Color(86, 86, 211));
		btnFines.setBounds(394, 44, 219, 41);
		panel.add(btnFines);
		
		JButton btnWarnings = new JButton("Warnings");
		btnWarnings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(warningspanel);
			}
		});
		btnWarnings.setForeground(Color.WHITE);
		btnWarnings.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		btnWarnings.setBackground(new Color(86, 86, 211));
		btnWarnings.setBounds(723, 44, 219, 41);
		panel.add(btnWarnings);
	}
}
