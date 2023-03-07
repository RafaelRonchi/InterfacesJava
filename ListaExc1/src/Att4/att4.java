package Att4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class att4 extends JFrame {

	private JPanel contentPane;
	private JTextField textN1;
	private JTextField textN2;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					att4 frame = new att4();
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
	public att4() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		txtN1 = new JTextField();
		txtN1.setBounds(100, 55, 86, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setColumns(10);
		txtN2.setBounds(253, 55, 86, 20);
		contentPane.add(txtN2);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSoma = new JButton("Soma");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double n1 = Double.parseDouble(txtN1.getText());
				Double n2 = Double.parseDouble(txtN2.getText());
				Double result = n1+n2;
				JOptionPane.showMessageDialog(null, "Resultado da soma: " + result);
				
			}
		});
		btnSoma.setBounds(95, 133, 104, 23);
		contentPane.add(btnSoma);
		
		JButton btnMulti = new JButton("Multiplicação");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double n1 = Double.parseDouble(txtN1.getText());
				Double n2 = Double.parseDouble(txtN2.getText());
				Double result = n1*n2;
				JOptionPane.showMessageDialog(null, "Resultado da multiplicação: " + result);

			}
		});
		btnMulti.setBounds(224, 133, 110, 23);
		contentPane.add(btnMulti);
		
		JButton btnSub = new JButton("Subtração");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double n1 = Double.parseDouble(txtN1.getText());
				Double n2 = Double.parseDouble(txtN2.getText());
				Double result = n1-n2;
				JOptionPane.showMessageDialog(null, "Resultado da subtração: " + result);

			}
		});
		btnSub.setBounds(95, 167, 104, 23);
		contentPane.add(btnSub);
		
		
		JButton btnDiv = new JButton("Divisão");
		btnDiv.setBounds(224, 167, 110, 23);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double n1 = Double.parseDouble(txtN1.getText());
				Double n2 = Double.parseDouble(txtN2.getText());
				Double result = n1/n2;
				JOptionPane.showMessageDialog(null, "Resultado da divisão: " + result);
			}
		});
		contentPane.add(btnDiv);
	}
}
