package att3;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtData;
	private JTextField txtCpf;
	private JTextField txtMatricula;
	private JTextField txtSiape;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(157, 36, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Dados Gerais");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(151, 11, 139, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(109, 39, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Data nascimento:");
		lblNewLabel_2.setBounds(69, 64, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		txtData = new JTextField();
		txtData.setBounds(157, 61, 86, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cpf:");
		lblNewLabel_3.setBounds(121, 89, 34, 14);
		contentPane.add(lblNewLabel_3);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(157, 86, 86, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(69, 157, 86, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Matricula:");
		lblNewLabel_5.setBounds(81, 141, 62, 14);
		contentPane.add(lblNewLabel_5);
		
		txtSiape = new JTextField();
		txtSiape.setBounds(271, 157, 86, 20);
		contentPane.add(txtSiape);
		txtSiape.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Siape:");
		lblNewLabel_6.setBounds(289, 141, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Escolha");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_7.setBounds(176, 117, 67, 14);
		contentPane.add(lblNewLabel_7);
		JButton btnAluno = new JButton("Cadastrar Aluno");
		
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		Professor professor = new Professor();
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date dataFormatada;
		
		btnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aluno aluno = new Aluno();
				 aluno.setNome(txtNome.getText());
				 aluno.setDataNasc(txtData.getText());
				 aluno.setMatricula(Long.parseLong(txtMatricula.getText()));
				 
				alunos.add(aluno);
				System.out.println(alunos);
				
			}
		});
		btnAluno.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAluno.setBounds(39, 188, 139, 23);
		contentPane.add(btnAluno);
		
		JButton btnProf = new JButton("Cadastrar Professor");
		btnProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnProf.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnProf.setBounds(245, 188, 146, 23);
		contentPane.add(btnProf);
	}
}
