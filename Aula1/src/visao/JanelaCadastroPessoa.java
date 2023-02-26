package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.FuncionarioDAO;
import modelo.Funcionario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JList;

public class JanelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroPessoa frame = new JanelaCadastroPessoa();
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
	public JanelaCadastroPessoa() {
		setBackground(new Color(174, 167, 81));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 386);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(219, 219, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomedoFuncionario = new JLabel("Nome:");
		lblNomedoFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomedoFuncionario.setBounds(55, 70, 48, 14);
		contentPane.add(lblNomedoFuncionario);
		
		txtNome = new JTextField();
		txtNome.setBounds(105, 69, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(268, 69, 86, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblCPFFuncionario = new JLabel("CPF:");
		lblCPFFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCPFFuncionario.setBounds(233, 70, 39, 14);
		contentPane.add(lblCPFFuncionario);
		
		JLabel lblListar = new JLabel("");
		lblListar.setBackground(new Color(128, 128, 128));
		lblListar.setBounds(119, 227, 188, 84);
		contentPane.add(lblListar);
		
		
		
		
		

		FuncionarioDAO bancoFuncionario = FuncionarioDAO.getInstanciaFuncionario();
		ArrayList<Funcionario> lista = bancoFuncionario.listarFuncionario();
		Funcionario f = new Funcionario();
		
		
		JButton btnSalvar = new JButton("Enviar");
		btnSalvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf = txtCpf.getText();
				
				if (nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum nome preenchido!");
				} else {
					f.setNome(String.valueOf(nome));
				}
				if (cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum cpf preenchido!");
				} else {
					f.setCpf(String.valueOf(cpf));
				}
				
				
				bancoFuncionario.criarFuncionario(f);
			
			}
			
	
		});
		
		
		
		
		
		btnSalvar.setBounds(88, 156, 89, 23);
		contentPane.add(btnSalvar);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(176, 11, 96, 23);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {" ","Masculino", "Feminino", "Outros"}));
		comboBox.setBounds(102, 112, 89, 22);
		contentPane.add(comboBox);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSexo.setBounds(55, 114, 48, 14);
		contentPane.add(lblSexo);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for (Funcionario funcionario : bancoFuncionario.listarFuncionario()) {
					 
					 System.out.println(("Nome: " + funcionario.getNome() + "  Cpf: " + funcionario.getCpf()));
				}
				
			}
		});
		btnListar.setBounds(246, 156, 89, 23);
		contentPane.add(btnListar);
		
	
				
		
	}
}
