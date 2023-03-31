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
	private JTextField txtProfessor;
	private JTextField txtAluno;

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
		setBounds(100, 100, 525, 330);
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
		lblNewLabel_2.setBounds(49, 64, 106, 14);
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
		txtMatricula.setBounds(334, 36, 86, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Matricula:");
		lblNewLabel_5.setBounds(273, 39, 62, 14);
		contentPane.add(lblNewLabel_5);
		
		txtSiape = new JTextField();
		txtSiape.setBounds(334, 61, 86, 20);
		contentPane.add(txtSiape);
		txtSiape.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Siape:");
		lblNewLabel_6.setBounds(284, 64, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Escolha");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_7.setBounds(324, 12, 67, 14);
		contentPane.add(lblNewLabel_7);
		JButton btnAluno = new JButton("Cadastrar Aluno");
		
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		ArrayList<Professor> professores = new ArrayList<>();
		
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date dataFormatada;
		
		btnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aluno aluno = new Aluno();
				 aluno.setNome(txtNome.getText());
				 aluno.setDataNasc(txtData.getText());
				 aluno.setMatricula(Long.parseLong(txtMatricula.getText()));
				 aluno.setCpf(Long.parseLong(txtMatricula.getText()));
				 
				alunos.add(aluno);
				System.out.println(alunos);
				txtNome.setText(null);
				txtData.setText(null);
				txtMatricula.setText(null);
				txtCpf.setText(null);
				txtSiape.setText(null);
				
				
			}
		});
		btnAluno.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAluno.setBounds(104, 133, 139, 23);
		contentPane.add(btnAluno);
		
		JButton btnProf = new JButton("Cadastrar Professor");
		btnProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Professor professor = new Professor();
					professor.setNome(txtNome.getText());
					professor.setDataNasc(txtData.getText());
					professor.setCpf(Long.parseLong(txtCpf.getText()));
					professor.setSiape(Long.parseLong(txtSiape.getText()));
					
				
					professores.add(professor);
					txtNome.setText(null);
					txtData.setText(null);
					txtMatricula.setText(null);
					txtSiape.setText(null);
					txtCpf.setText(null);
					
					
			}
		});
		btnProf.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnProf.setBounds(284, 133, 146, 23);
		contentPane.add(btnProf);
		
		txtProfessor = new JTextField();
		txtProfessor.setEditable(false);
		txtProfessor.setBounds(76, 201, 423, 20);
		contentPane.add(txtProfessor);
		txtProfessor.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Aluno:");
		lblNewLabel_4.setBounds(20, 263, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		txtAluno = new JTextField();
		txtAluno.setEditable(false);
		txtAluno.setColumns(10);
		txtAluno.setBounds(76, 260, 423, 20);
		contentPane.add(txtAluno);
		
		JLabel lblNewLabel_4_1 = new JLabel("Professor:");
		lblNewLabel_4_1.setBounds(10, 204, 56, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JButton btnProfessores = new JButton("Listar Professores");
		btnProfessores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtProfessor.setText(""+professores);
			}
		});
		btnProfessores.setBounds(194, 167, 132, 23);
		contentPane.add(btnProfessores);
		
		JButton btnAlunos = new JButton("Listar Alunos");
		btnAlunos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAluno.setText(""+alunos);
			}
		});
		btnAlunos.setBounds(194, 232, 132, 23);
		contentPane.add(btnAlunos);
	}
}
