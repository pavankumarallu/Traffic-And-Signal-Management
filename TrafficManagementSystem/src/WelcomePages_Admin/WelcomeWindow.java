package WelcomePages_Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeWindow frame = new WelcomeWindow();
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
	public WelcomeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1230, 734);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(88,88,215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/traffic.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(503, 62, 212, 172);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 37));
		lblNewLabel_1.setBounds(489, 10, 252, 60);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Signal and Traffic");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 37));
		lblNewLabel_1_2.setBounds(266, 228, 416, 60);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Management System");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 37));
		lblNewLabel_1_2_1.setBounds(587, 234, 416, 49);
		contentPane.add(lblNewLabel_1_2_1);
		
		JButton btnNewButton = new JButton("Manage Signals");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signalDis(e);
			}
		});
		btnNewButton.setBackground(new Color(37,37,113));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 33));
		btnNewButton.setBounds(417, 450, 444, 70);
		contentPane.add(btnNewButton);
		
		JButton btnFineManagement = new JButton("Challan Management");
		btnFineManagement.setForeground(Color.WHITE);
		btnFineManagement.setFont(new Font("Tempus Sans ITC", Font.BOLD, 33));
		btnFineManagement.setBackground(new Color(37, 37, 113));
		btnFineManagement.setBounds(417, 542, 444, 70);
		contentPane.add(btnFineManagement);
	
	}

	protected void signalDis(ActionEvent e) {
		// TODO Auto-generated method stub
		SignalDisplay sd = new SignalDisplay();
		sd.setVisible(true);
		this.dispose();
	}
}
