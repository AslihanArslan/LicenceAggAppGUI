package LicenseAggApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class LicenseAggApp {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LicenseAggApp window = new LicenseAggApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LicenseAggApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 24, 370, 142);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textLicense = new JTextArea();
		textLicense.setEditable(false);
		scrollPane.setViewportView(textLicense);
		
		JRadioButton rdbtnAccept = new JRadioButton("Accept");
		
		
		
		buttonGroup.add(rdbtnAccept);
		rdbtnAccept.setBounds(38, 189, 109, 23);
		frame.getContentPane().add(rdbtnAccept);
		
		JRadioButton rdbtnReject = new JRadioButton("Reject");
	
		rdbtnReject.setSelected(true);
		buttonGroup.add(rdbtnReject);
		rdbtnReject.setBounds(38, 231, 109, 23);
		frame.getContentPane().add(rdbtnReject);
		
		textLicense.setText("License Aggrement \n"
				+ "\n"
				+ "adfgdfhdfbhdhmfmgk \n");
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(211, 388, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setEnabled(false);
		btnContinue.setBounds(335, 388, 89, 23);
		frame.getContentPane().add(btnContinue);
		
		rdbtnAccept.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(rdbtnAccept.isSelected()){
				btnContinue.setEnabled(true);
				System.out.println("Accepttbttn itemStateChanged called");
			}
				}
		});
		

		rdbtnReject.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
		        if(rdbtnReject.isSelected()){
				btnContinue.setEnabled(false);
				System.out.println("Rejectbttn itemStateChanged called");
			}
				}
		});
		
	}
}
