package WelcomePages_Admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SignalPackage.Density_Signal;
import SignalPackage.ManualSignal;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignalDisplay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignalDisplay frame = new SignalDisplay();
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
	public SignalDisplay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1230, 734);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(88,88,215));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/traffic.png")).getImage();
		contentPane.setLayout(null);
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(477, 59, 230, 225);
		contentPane.add(lblNewLabel);
		
		JButton btnManualSignal = new JButton("Manual Signal");
		btnManualSignal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mansig(e);
			}
		});
		btnManualSignal.setForeground(Color.WHITE);
		btnManualSignal.setFont(new Font("Tempus Sans ITC", Font.BOLD, 33));
		btnManualSignal.setBackground(new Color(37, 37, 113));
		btnManualSignal.setBounds(384, 376, 444, 70);
		contentPane.add(btnManualSignal);
		
		JButton btnDensitySignal = new JButton("Density Signal");
		btnDensitySignal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				densitycall(e);
				
			}
		});
		btnDensitySignal.setForeground(Color.WHITE);
		btnDensitySignal.setFont(new Font("Tempus Sans ITC", Font.BOLD, 33));
		btnDensitySignal.setBackground(new Color(37, 37, 113));
		btnDensitySignal.setBounds(384, 482, 444, 70);
		contentPane.add(btnDensitySignal);
		
		JLabel lblNewLabel_1 = new JLabel("Note : ");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(304, 635, 79, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Manual signals should be used only in the case of an emergency");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		lblNewLabel_1_1.setBounds(366, 635, 523, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back(e);
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		btnBack.setBackground(new Color(37, 37, 113));
		btnBack.setBounds(47, 23, 114, 29);
		contentPane.add(btnBack);
	}

	protected void mansig(ActionEvent e) {
		// TODO Auto-generated method stub
		ManualSignal ms = new ManualSignal();
		ms.setVisible(true);
		this.dispose();
		
	}

	protected void back(ActionEvent e) {
		// TODO Auto-generated method stub
		WelcomeWindow ww = new WelcomeWindow();
		ww.setVisible(true);
		this.dispose();
		
	}

	protected void densitycall(ActionEvent e) {
		// TODO Auto-generated method stub
		Density_Signal ds = new Density_Signal();
		ds.setVisible(true);
		this.dispose();
		
	}

}
