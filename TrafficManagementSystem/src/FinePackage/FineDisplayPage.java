package FinePackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import WelcomePages_Admin.WelcomeWindow;
import db_connections.ChallanModel;
import db_connections.Challan_db;
import db_connections.FetchOffences;
import db_connections.OffenseModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;

public class FineDisplayPage extends JFrame {

	private JPanel contentPane;
	private JTextField Namefield;
	private JTextField Vehiclefiled;
	private JTextField phonefield;
	private JTextField textField_3;
	private JTable table;
	ArrayList<OffenseModel> off;
	Challan_db cdb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FineDisplayPage frame = new FineDisplayPage();
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
	public FineDisplayPage() {
		
		off = new ArrayList<OffenseModel>();
		FetchOffences fo = new FetchOffences();
		off = fo.fetchall();
		cdb = new Challan_db();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1230, 734);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(88,88,215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(66, 154, 99, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblVehicleNumber = new JLabel("Vehicle Number");
		lblVehicleNumber.setForeground(Color.WHITE);
		lblVehicleNumber.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblVehicleNumber.setBounds(66, 191, 181, 33);
		contentPane.add(lblVehicleNumber);
		
		JLabel lblOffendComitted = new JLabel("Offence Committed");
		lblOffendComitted.setForeground(Color.WHITE);
		lblOffendComitted.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblOffendComitted.setBounds(66, 236, 202, 27);
		contentPane.add(lblOffendComitted);
		
		JLabel lblFine = new JLabel("Phone Number");
		lblFine.setForeground(Color.WHITE);
		lblFine.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblFine.setBounds(68, 273, 181, 33);
		contentPane.add(lblFine);
		
		Namefield = new JTextField();
		Namefield.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		Namefield.setBounds(278, 157, 330, 27);
		contentPane.add(Namefield);
		Namefield.setColumns(10);
		
		Vehiclefiled = new JTextField();
		Vehiclefiled.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		Vehiclefiled.setColumns(10);
		Vehiclefiled.setBounds(278, 197, 330, 27);
		contentPane.add(Vehiclefiled);
		
		phonefield = new JTextField();
		phonefield.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		phonefield.setColumns(10);
		phonefield.setBounds(278, 279, 330, 27);
		contentPane.add(phonefield);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		comboBox.setBounds(278, 239, 330, 30);
		comboBox.addItem("Select the offense");
		for (int i = 0; i < off.size(); i++) {
			comboBox.addItem(off.get(i).getOffensename());
		}
		contentPane.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(37,37,112));
		panel.setBounds(0, 0, 1231, 105);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		textField_3.setBounds(837, 33, 207, 41);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search(textField_3.getText(),e);
				textField_3.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(86,86,211));
		btnNewButton.setBounds(1044, 33, 110, 41);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Challan Database");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 35));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(295, 33, 311, 48);
		panel.add(lblNewLabel_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back(e);
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		btnBack.setBackground(new Color(86, 86, 211));
		btnBack.setBounds(28, 33, 110, 41);
		panel.add(btnBack);
		
		JLabel lblNewLabel_3 = new JLabel("Note  :  Search by Vehicle number");
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(895, 10, 240, 24);
		panel.add(lblNewLabel_3);
		
		JCheckBox trafficviobox = new JCheckBox("Offense related to traffic Rule violation");
		trafficviobox.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		trafficviobox.setForeground(Color.WHITE);
		trafficviobox.setBackground(new Color(88,88,215));
		trafficviobox.setBounds(764, 160, 394, 21);
		contentPane.add(trafficviobox);
		
		JCheckBox docbox = new JCheckBox("Offense related to Documents");
		docbox.setForeground(Color.WHITE);
		docbox.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		docbox.setBackground(new Color(88, 88, 215));
		docbox.setBounds(764, 191, 394, 21);
		contentPane.add(docbox);
		
		JCheckBox drivebox = new JCheckBox("Offense related to Driving");
		drivebox.setForeground(Color.WHITE);
		drivebox.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		drivebox.setBackground(new Color(88, 88, 215));
		drivebox.setBounds(764, 222, 394, 27);
		
		contentPane.add(drivebox);
		
		JCheckBox pollutionbox = new JCheckBox("Offences Related to Pollution");
		pollutionbox.setForeground(Color.WHITE);
		pollutionbox.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		pollutionbox.setBackground(new Color(88, 88, 215));
		pollutionbox.setBounds(764, 255, 394, 21);
		contentPane.add(pollutionbox);
		
		JCheckBox signalbox = new JCheckBox("Offences Related to Traffic Signal");
		signalbox.setForeground(Color.WHITE);
		signalbox.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		signalbox.setBackground(new Color(88, 88, 215));
		signalbox.setBounds(764, 286, 394, 27);
		contentPane.add(signalbox);
		
		
		
		JButton btnBack_1_1 = new JButton("Apply Filter");
		btnBack_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				off.clear();
				if (trafficviobox.isSelected()) {
					ArrayList<OffenseModel> off1 = new ArrayList<OffenseModel>();
					off1 = fo.fettype(trafficviobox.getText());
					off.addAll(off1);
				}
				if (docbox.isSelected()) {
					ArrayList<OffenseModel> off1 = new ArrayList<OffenseModel>();
					off1 = fo.fettype(docbox.getText());
					off.addAll(off1);
					
				}
				if (pollutionbox.isSelected()) {
					ArrayList<OffenseModel> off1 = new ArrayList<OffenseModel>();
					off1 = fo.fettype(pollutionbox.getText());
					off.addAll(off1);
					
				}
				if (signalbox.isSelected()) {
					ArrayList<OffenseModel> off1 = new ArrayList<OffenseModel>();
					off1 = fo.fettype(signalbox.getText());
					off.addAll(off1);
					
				}
				if (drivebox.isSelected()) {
					ArrayList<OffenseModel> off1 = new ArrayList<OffenseModel>();
					off1 = fo.fettype(drivebox.getText());
					off.addAll(off1);
					
				}
				if (!trafficviobox.isSelected() && !docbox.isSelected() && !pollutionbox.isSelected() && !signalbox.isSelected() && !drivebox.isSelected()) {
					ArrayList<OffenseModel> off1 = new ArrayList<OffenseModel>();
					off1 = fo.fetchall();
					off.addAll(off1);
				}
				comboBox.removeAllItems();
				comboBox.addItem("Select the offense");
				for (int i = 0; i < off.size(); i++) {
					comboBox.addItem(off.get(i).getOffensename());
				}
			}
		});
		
		
		
		btnBack_1_1.setForeground(Color.WHITE);
		btnBack_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		btnBack_1_1.setBackground(new Color(37,37,118));
		btnBack_1_1.setBounds(764, 329, 306, 41);
		contentPane.add(btnBack_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 415, 1129, 240);
		
		contentPane.add(scrollPane);
		
		table = new JTable();
		DefaultTableModel model = new DefaultTableModel();
		Object [] column = {"Sno.","Date","Vehicle No.","Name","Phone","Offense","Fine"};
		model.setColumnIdentifiers(column);
		table.setModel(model);
		final Object[] row = new Object[7];
		ArrayList<ChallanModel> cmlist = new ArrayList<ChallanModel>();
		cmlist = cdb.fetchOffenders();
		int k =1;
		for (int i = cmlist.size()-1; i >=0; i--) {
			row[0] = k;
			row[1] = cmlist.get(i).getDate();
			row[2] = cmlist.get(i).getVehicleno();
			row[3] = cmlist.get(i).getName();
			row[4] = cmlist.get(i).getPhoneNumber();
			row[5] = cmlist.get(i).getOffense();
			row[6] = cmlist.get(i).getFine();
			model.addRow(row);
			k++;
		}
		
		scrollPane.setViewportView(table);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChallanModel challan = new ChallanModel();
				if (!Namefield.getText().isEmpty() && !Vehiclefiled.getText().isEmpty() && !phonefield.getText().isEmpty()) {
					if (!comboBox.getSelectedItem().toString().equals("Select the offense")) {
						challan.setName(Namefield.getText());
						challan.setVehicleno(Vehiclefiled.getText());
						challan.setOffense(comboBox.getSelectedItem().toString());
						challan.setFine(fo.getFine(comboBox.getSelectedItem().toString()));
						challan.setPhoneNumber(phonefield.getText());
						
						Date date = new Date();
						date = Calendar.getInstance().getTime();
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						
						add(e,challan);
						
						row[1] = sdf.format(date);
						row[2] = Vehiclefiled.getText();
						row[3] = Namefield.getText();
						row[4] = phonefield.getText();
						row[5] = comboBox.getSelectedItem().toString();
						row[6] = fo.getFine(comboBox.getSelectedItem().toString());
						model.addRow(row);
						
						
						Namefield.setText("");
						Vehiclefiled.setText("");
						comboBox.setSelectedIndex(0);
						phonefield.setText("");
					}
					else {
						JOptionPane.showMessageDialog(null, "Please Select the Offense");
					}
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please Enter the Details");
				}
				
				
				
			}

			
		});
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		btnAdd.setBackground(new Color(37,37,118));
		btnAdd.setBounds(137, 329, 306, 41);
		contentPane.add(btnAdd);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Note :   Filter the offence based on the offense type");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(702, 106, 529, 48);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Details of the offender");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel_1_1_1.setBounds(92, 106, 351, 48);
		contentPane.add(lblNewLabel_1_1_1);
		Image img = new ImageIcon(this.getClass().getResource("/traffic.png")).getImage();
	}

	protected void search(String text, ActionEvent e) {
		// TODO Auto-generated method stub
		ArrayList<ChallanModel> cmdd = new ArrayList<ChallanModel>();
		
		cmdd = cdb.fetchEach(text);
		if (cmdd.size() == 0) {
			JOptionPane.showMessageDialog(null, "No records Found");
			
			
		}
		else {
		SeachPage sp = new SeachPage(text);
		sp.setVisible(true);
		this.dispose();
		}
	}

	protected void add(ActionEvent e, ChallanModel challan) {
		// TODO Auto-generated method stub
		
		cdb.savedata(challan);
		
	}

	protected void back(ActionEvent e) {
		// TODO Auto-generated method stub
		WelcomeWindow ww = new WelcomeWindow();
		ww.setVisible(true);
		this.dispose();
		
	}
}
