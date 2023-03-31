package att2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Att2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCadastro;
	private JTextField txtMaior;
	private JTextField txtMenor;
	private ArrayList<Double> Numeros;
	private double a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Att2 frame = new Att2();
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
	public Att2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtCadastro = new JTextField();
		txtCadastro.setBounds(45, 92, 92, 20);
		contentPane.add(txtCadastro);
		txtCadastro.setColumns(10);

		txtMaior = new JTextField();
		txtMaior.setEditable(false);
		txtMaior.setBounds(206, 57, 92, 31);
		contentPane.add(txtMaior);
		txtMaior.setColumns(10);

		txtMenor = new JTextField();
		txtMenor.setEditable(false);
		txtMenor.setBounds(206, 98, 92, 31);
		contentPane.add(txtMenor);
		txtMenor.setColumns(10);

		JLabel lblNewLabel = new JLabel("Numero");
		lblNewLabel.setBounds(64, 67, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Maior");
		lblNewLabel_1.setBounds(161, 65, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Menor");
		lblNewLabel_2.setBounds(161, 106, 46, 14);
		contentPane.add(lblNewLabel_2);

		Numeros = new ArrayList<Double>();
		

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double numero = Double.parseDouble(txtCadastro.getText());
				Numeros.add(numero);
				a = numero;
			}
		});
		btnNewButton.setBounds(80, 181, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Exibir");
		btnNewButton_1.addActionListener(new ActionListener() {

			double menor = Double.MAX_VALUE;
			double maior = Double.MIN_VALUE;

			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < Numeros.size(); i++) {
					if ((Numeros.get(i)) > maior) {
						maior = Numeros.get(i);
					} else if (Numeros.get(i) < menor) {
						menor = Numeros.get(i);
					}
				}
				txtMaior.setText("" + maior);
				txtMenor.setText("" + menor);
			}

		});
		btnNewButton_1.setBounds(206, 181, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
