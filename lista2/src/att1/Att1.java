package att1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Att1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;
	private JTextField txtExibir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Att1 frame = new Att1();
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
	public Att1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(95, 25, 86, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtExibir = new JTextField();
		txtExibir.setEditable(false);
		txtExibir.setBounds(175, 75, 86, 20);
		contentPane.add(txtExibir);
		txtExibir.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numero:");
		lblNewLabel.setBounds(23, 28, 62, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado: ");
		lblNewLabel_1.setBounds(95, 78, 70, 14);
		contentPane.add(lblNewLabel_1);
		
		ArrayList<Double> Numeros = new ArrayList<Double>(); 
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double $numero = Double.parseDouble(txtNumero.getText());
				Numeros.add($numero);
			}

		});
		btnCadastrar.setBounds(62, 134, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer total = 0;
				for (int i = 0; i < Numeros.size(); i++) {
					if((Numeros.get(i)%2) == 0 ) {
						total++;
					}
				}
				txtExibir.setText(""+total);
			}
		});
		btnExibir.setBounds(241, 134, 89, 23);
		contentPane.add(btnExibir);
	}
}
