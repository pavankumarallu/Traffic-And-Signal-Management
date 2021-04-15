package FinePackage;

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

import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SeachPage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	

	/**
	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SeachPage frame = new SeachPage();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public SeachPage(String vehicle) {
		
		Trafficwarns tw = new Trafficwarns();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1230, 734);
		ArrayList<ChallanModel> cmeach = new ArrayList<ChallanModel>();
		Challan_db cdb = new Challan_db();
		cmeach = cdb.fetchEach(vehicle);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(88,88,215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1237, 108);
		panel.setBackground(new Color(37,37,112));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Searching for "+vehicle);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(373, 38, 466, 46);
		panel.add(lblNewLabel);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back(e);
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		btnBack.setBackground(new Color(86, 86, 211));
		btnBack.setBounds(38, 38, 110, 41);
		panel.add(btnBack);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		textArea.setLineWrap(true);
		textArea.setBounds(752, 172, 388, 123);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("Set a Warning for the driver  :");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(752, 114, 287, 48);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(65, 147, 170, 48);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Vehicle No. ");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(65, 200, 170, 48);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Phone Number");
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(65, 258, 170, 48);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_2 = new JLabel(":");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(245, 159, 45, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel(":");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(245, 212, 45, 25);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel(":");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(245, 270, 45, 25);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel(cmeach.get(0).getName());
		lblNewLabel_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_3.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_1_1_3.setBounds(301, 147, 346, 48);
		contentPane.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel(vehicle);
		lblNewLabel_1_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_1_4.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_1_1_4.setBounds(300, 200, 170, 48);
		contentPane.add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel(cmeach.get(0).getPhoneNumber());
		lblNewLabel_1_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_1_5.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_1_1_5.setBounds(300, 258, 170, 48);
		contentPane.add(lblNewLabel_1_1_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(65, 424, 1099, 232);
		contentPane.add(scrollPane);
		
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
		
		JLabel lblPreviousRecord = new JLabel("Previous Record     :");
		lblPreviousRecord.setHorizontalAlignment(SwingConstants.LEFT);
		lblPreviousRecord.setForeground(Color.WHITE);
		lblPreviousRecord.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblPreviousRecord.setBounds(62, 363, 293, 46);
		contentPane.add(lblPreviousRecord);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tw.sw(vehicle, textArea.getText());
				textArea.setText("");
				
			}
		});
		btnSend.setForeground(Color.WHITE);
		btnSend.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		btnSend.setBackground(new Color(37, 37, 118));
		btnSend.setBounds(752, 318, 144, 41);
		contentPane.add(btnSend);
	}

	protected void back(ActionEvent e) {
		// TODO Auto-generated method stub
		FineDisplayPage fdp = new FineDisplayPage();
		fdp.setVisible(true);
		this.dispose();
	}
}
