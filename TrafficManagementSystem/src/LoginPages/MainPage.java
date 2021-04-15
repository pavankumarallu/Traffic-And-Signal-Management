package LoginPages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import WelcomePages_Admin.WelcomeWindow;
import WelcomePages_Civilians.CivilianDisplayPage;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	JLayeredPane layeredPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	
	public void switchPanels(JPanel jPanel)
	{
		layeredPane.removeAll();
		layeredPane.add(jPanel);
		layeredPane.repaint();
		layeredPane.revalidate();

	}
	
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1008, 734);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(88,88,215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/traffic.png")).getImage();
		contentPane.setLayout(null);
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(371, 23, 217, 175);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 37));
		lblNewLabel_1.setBounds(371, 171, 252, 85);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Have a safe drive !!!");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 21));
		lblNewLabel_1_1.setBounds(359, 241, 294, 37);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnAdmin = new JButton("Admin");
		
		btnAdmin.setForeground(Color.WHITE);
		btnAdmin.setFont(new Font("Tempus Sans ITC", Font.BOLD, 26));
		btnAdmin.setBackground(new Color(37, 37, 113));
		btnAdmin.setBounds(30, 94, 305, 46);
		contentPane.add(btnAdmin);
		
		JButton btnCivilian = new JButton("Civilian");
		
		btnCivilian.setForeground(Color.WHITE);
		btnCivilian.setFont(new Font("Tempus Sans ITC", Font.BOLD, 26));
		btnCivilian.setBackground(new Color(37, 37, 113));
		btnCivilian.setBounds(651, 94, 305, 46);
		contentPane.add(btnCivilian);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 342, 984, 324);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(88,88,215));
		layeredPane.add(panel, "name_31996699951900");
		panel.setLayout(null);
		
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel);
			}
		});
		
		JLabel lblNewLabel_1_2 = new JLabel("Admin");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 37));
		lblNewLabel_1_2.setBounds(372, 0, 266, 49);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Username");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(325, 84, 134, 37);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Password");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 27));
		lblNewLabel_1_1_1_1.setBounds(325, 146, 134, 37);
		panel.add(lblNewLabel_1_1_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 19));
		textField.setBounds(519, 88, 239, 37);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 21));
		passwordField.setBounds(519, 150, 239, 37);
		panel.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login(textField.getText(),passwordField.getText(),e);
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Tempus Sans ITC", Font.BOLD, 26));
		btnLogin.setBackground(new Color(37, 37, 113));
		btnLogin.setBounds(385, 239, 305, 46);
		panel.add(btnLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(88, 88, 215));
		layeredPane.add(panel_1, "name_32046019038100");
		btnCivilian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_1);
			}
		});
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Civilian");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 37));
		lblNewLabel_1_3.setBounds(371, 0, 266, 49);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Vehical Number");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		lblNewLabel_1_1_1_2.setBounds(249, 81, 223, 54);
		panel_1.add(lblNewLabel_1_1_1_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(533, 94, 282, 37);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnGetMyRecords = new JButton("Get my records");
		btnGetMyRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get(textField_1.getText(),e);
			}
			
		});
		btnGetMyRecords.setForeground(Color.WHITE);
		btnGetMyRecords.setFont(new Font("Tempus Sans ITC", Font.BOLD, 26));
		btnGetMyRecords.setBackground(new Color(37, 37, 113));
		btnGetMyRecords.setBounds(332, 202, 305, 46);
		panel_1.add(btnGetMyRecords);
	}

	protected void get(String text, ActionEvent e) {
		// TODO Auto-generated method stub
		CivilianDisplayPage cdp = new CivilianDisplayPage(text);
		cdp.setVisible(true);
		this.dispose();
		
	}

	protected void login(String text, String text2, ActionEvent e) {
		// TODO Auto-generated method stub
		if (text.equals("admin") && text2.equals("admin")) {
			WelcomeWindow ww = new WelcomeWindow();
			ww.setVisible(true);
			this.dispose();
		}
		
	}
}
