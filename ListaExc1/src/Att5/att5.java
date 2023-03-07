package Att5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class att5 extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JLabel lbl;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					att5 frame = new att5();
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
	public att5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(169, 66, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(169, 97, 86, 20);
		contentPane.add(txt2);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(169, 128, 86, 20);
		contentPane.add(txt3);
		
		lbl = new JLabel("Tipo de triangulo: ");
		lbl.setBounds(169, 219, 103, 14);
		contentPane.add(lbl);
		
		JButton btnVerifica = new JButton("Enviar");
		btnVerifica.setBackground(new Color(250, 128, 114));
		btnVerifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl.setText(null);
				double $txt1 = Double.parseDouble(txt1.getText());
				double $txt2 = Double.parseDouble(txt2.getText());
				double $txt3 = Double.parseDouble(txt3.getText());
				
				if($txt1 == $txt2 && $txt1 == $txt3 && $txt2 == $txt3 ) {
					lbl.setText("Equilátero");
				} else if($txt1 == $txt2 || $txt3 == $txt2 || $txt1 == $txt3) {
					lbl.setText("Isósceles");
				} else if ( $txt1 != $txt2 && $txt1 != $txt3 && $txt2 != $txt3){
					lbl.setText("Escaleno");
				}
			}
		});
		btnVerifica.setBounds(169, 168, 89, 23);
		contentPane.add(btnVerifica);
		
		lblNewLabel = new JLabel("Preencha com números");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(144, 30, 149, 14);
		contentPane.add(lblNewLabel);
		
		
	}

}
