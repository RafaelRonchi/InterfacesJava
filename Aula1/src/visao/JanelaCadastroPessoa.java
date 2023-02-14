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
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 457, 236);
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
		
		JButton btnSalvar = new JButton("Enviar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				Long cpf = Long.valueOf(txtCpf.getText());
				
				if (nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum nome preenchido!");
				}
				if (cpf == null) {
					JOptionPane.showMessageDialog(null, "Nenhum cpf preenchido!");
				}
				
				Funcionario func = new Funcionario();
				func.setNome(nome);
				func.setCpf(cpf);
				
				FuncionarioDAO listaFuncionarios = FuncionarioDAO.getInstancia();
				listaFuncionarios.inserir(func);
				
				
			}
	
		});
		btnSalvar.setBounds(176, 155, 89, 23);
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
		
	}
}
