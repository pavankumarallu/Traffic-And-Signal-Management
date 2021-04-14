package SignalPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import WelcomePages.SignalDisplay;
import densities.DensitiesCalc;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Density_Signal extends JFrame {

	private JPanel contentPane;
	JButton Lane_1btn = new JButton("");
    JButton Lane_2btn = new JButton("");
    JButton Lane_3btn = new JButton("");
    JButton Lane_4btn = new JButton("");
    JLabel Lane1_timer = new JLabel("0");
    JLabel Lane2_timer = new JLabel("0");
    JLabel Lane3_timer = new JLabel("0");
    JLabel Lane4_timer = new JLabel("0");
    double north;
    double south;
    double east;
    double west;
    DensitiesCalc dsc;
    RunSignals ob = new RunSignals();
    Thread thread = new Thread(ob, "T1");
	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
         UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Density_Signal frame = new Density_Signal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	void resetUI() {
        Lane_1btn.setBackground(Color.RED);
        Lane_2btn.setBackground(Color.RED);
        Lane_3btn.setBackground(Color.RED);
        Lane_4btn.setBackground(Color.RED);
        Lane1_timer.setText("0");
        Lane2_timer.setText("0");
        Lane3_timer.setText("0");
        Lane4_timer.setText("0");
    }

	/**
	 * Create the frame.
	 */
	public Density_Signal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1303, 761);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(81,81,215));
		panel.setBounds(920, 0, 369, 724);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Traffic Densities");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 26));
		lblNewLabel.setBounds(57, 49, 252, 42);
		panel.add(lblNewLabel);
		
		JSlider Northslider = new JSlider();
		Northslider.setForeground(Color.WHITE);
		Northslider.setMajorTickSpacing(20);
		Northslider.setBackground(new Color(81,81,215));
		Northslider.setValue(0);
		Northslider.setPaintTicks(true);
		Northslider.setPaintLabels(true);
		Northslider.setBounds(31, 157, 307, 64);
		panel.add(Northslider);
		
		JSlider Eastslider = new JSlider();
		Eastslider.setForeground(Color.WHITE);
		Eastslider.setValue(0);
		Eastslider.setPaintTicks(true);
		Eastslider.setMajorTickSpacing(20);
		Eastslider.setPaintLabels(true);
		Eastslider.setBackground(new Color(81,81,215));
		Eastslider.setBounds(31, 293, 307, 64);
		panel.add(Eastslider);
		
		JSlider Southslider = new JSlider();
		Southslider.setForeground(Color.WHITE);
		Southslider.setValue(0);
		Southslider.setPaintTicks(true);
		Southslider.setPaintLabels(true);
		Southslider.setMajorTickSpacing(20);
		Southslider.setBackground(new Color(81,81,215));
		Southslider.setBounds(31, 425, 307, 64);
		panel.add(Southslider);
		
		JSlider Westslider = new JSlider();
		Westslider.setForeground(Color.WHITE);
		Westslider.setValue(0);
		Westslider.setPaintTicks(true);
		Westslider.setMajorTickSpacing(20);
		Westslider.setPaintLabels(true);
		Westslider.setBackground(new Color(81,81,215));
		Westslider.setBounds(31, 577, 307, 64);
		panel.add(Westslider);
		
		JLabel lblNewLabel_1 = new JLabel("North Lane");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		lblNewLabel_1.setBounds(31, 110, 157, 29);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("East Lane");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(31, 241, 157, 29);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("South Lane");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(31, 386, 157, 29);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("West Lane");
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		lblNewLabel_1_1_2.setBounds(31, 538, 157, 29);
		panel.add(lblNewLabel_1_1_2);
		JButton btnStop = new JButton("Stop");
		btnStop.setForeground(Color.WHITE);
		JButton btnNewButton = new JButton("Set Densities");
		btnNewButton.setForeground(Color.WHITE);
		btnStop.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		btnStop.setBackground(new Color(37,37,113));
		btnStop.setBounds(31, 666, 135, 48);
		panel.add(btnStop);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				north = Northslider.getValue();
				south = Southslider.getValue();
				east = Eastslider.getValue();
				west = Westslider.getValue();
				
				dsc = new DensitiesCalc(north, south, west, east);
				btnStop.setEnabled(true);
                resetUI();
                thread = new Thread(ob);
                thread.start();
                btnNewButton.setEnabled(false);
			}
		});
		btnNewButton.setBackground(new Color(37,37,113));
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		btnNewButton.setBounds(224, 666, 135, 48);
		
		btnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetUI();
                if (thread != null) {
                    thread.interrupt();
                }
                btnStop.setEnabled(false);
                btnNewButton.setEnabled(true);
            }
        });
		panel.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back(e);
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		btnBack.setBackground(new Color(37, 37, 113));
		btnBack.setBounds(10, 10, 114, 29);
		panel.add(btnBack);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(46, 139, 87));
		panel_1.setBounds(0, 0, 310, 242);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(46, 139, 87));
		panel_1_1.setBounds(0, 482, 310, 242);
		contentPane.add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(46, 139, 87));
		panel_1_2.setBounds(609, 0, 310, 242);
		contentPane.add(panel_1_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(new Color(46, 139, 87));
		panel_1_3.setBounds(609, 482, 310, 242);
		contentPane.add(panel_1_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(450, 24, 10, 75);
		contentPane.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(450, 595, 10, 119);
		contentPane.add(panel_2_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 353, 65, 10);
		contentPane.add(panel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(115, 353, 78, 10);
		contentPane.add(panel_3_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBounds(854, 341, 65, 10);
		contentPane.add(panel_3_2);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBounds(723, 341, 78, 10);
		contentPane.add(panel_3_3);
		
		JLabel lblNewLabel_2 = new JLabel("North Lane");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		lblNewLabel_2.setBounds(395, 109, 172, 48);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("South Lane");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(395, 527, 172, 48);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("West Lane");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		lblNewLabel_2_2.setBounds(47, 395, 172, 48);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("East Lane");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		lblNewLabel_2_3.setBounds(707, 395, 172, 48);
		contentPane.add(lblNewLabel_2_3);
		
		
		Lane_1btn.setBackground(Color.RED);
		Lane_1btn.setBounds(414, 182, 96, 89);
		contentPane.add(Lane_1btn);
		
		
		Lane_4btn.setBackground(Color.RED);
		Lane_4btn.setBounds(250, 326, 96, 89);
		contentPane.add(Lane_4btn);
		
		
		Lane_3btn.setBackground(Color.RED);
		Lane_3btn.setBounds(414, 428, 96, 89);
		contentPane.add(Lane_3btn);
		
		
		Lane_2btn.setBackground(Color.RED);
		Lane_2btn.setBounds(556, 326, 96, 89);
		contentPane.add(Lane_2btn);
		
		
		Lane1_timer.setHorizontalAlignment(SwingConstants.CENTER);
		Lane1_timer.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		Lane1_timer.setForeground(Color.WHITE);
		Lane1_timer.setBounds(438, 292, 45, 22);
		contentPane.add(Lane1_timer);
		
		
		Lane4_timer.setHorizontalAlignment(SwingConstants.CENTER);
		Lane4_timer.setForeground(Color.WHITE);
		Lane4_timer.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		Lane4_timer.setBounds(358, 353, 45, 22);
		contentPane.add(Lane4_timer);
		
		
		Lane3_timer.setHorizontalAlignment(SwingConstants.CENTER);
		Lane3_timer.setForeground(Color.WHITE);
		Lane3_timer.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		Lane3_timer.setBounds(438, 395, 45, 22);
		contentPane.add(Lane3_timer);
		
		
		Lane2_timer.setHorizontalAlignment(SwingConstants.CENTER);
		Lane2_timer.setForeground(Color.WHITE);
		Lane2_timer.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		Lane2_timer.setBounds(501, 353, 45, 22);
		contentPane.add(Lane2_timer);
	}
	protected void back(ActionEvent e) {
		// TODO Auto-generated method stub
		SignalDisplay sd = new SignalDisplay();
		sd.setVisible(true);
		this.dispose();
		
	}
	private class RunSignals implements Runnable {
        private volatile boolean exit = false;


        @Override
        public void run() {
            try {
                while (!exit) {
                    int timing[] = dsc.getdensities();
                    JLabel jLabel[] = {Lane1_timer, Lane2_timer, Lane3_timer, Lane4_timer};
                    JButton buttonNumber[] = {Lane_1btn, Lane_2btn, Lane_3btn, Lane_4btn};
                    for (int i = 0; i < 4; i++) {

                        for (int j = 0; j < 4; j++) {
                            if (j == i) {
                                buttonNumber[j].setBackground(Color.GREEN);
                                jLabel[i].setText(timing[i] + "");
                            } else {
                                buttonNumber[j].setBackground(Color.RED);
                            }
                        }

                        for (int k = timing[i]; k >= 0; k--) {
                            jLabel[i].setText(k + "");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        }
                    }
                }

            } catch (InterruptedException e) {
                Lane1_timer.setText("0");
                Lane2_timer.setText("0");
                Lane3_timer.setText("0");
                Lane4_timer.setText("0");
                return;
            }
        }

        public void stop() {
            exit = true;
        }
    }
}
