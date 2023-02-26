package controle;

import java.util.ArrayList;

import modelo.Funcionario;
import modelo.IFuncionarioDAO;



public class FuncionarioDAO implements IFuncionarioDAO {
	private static FuncionarioDAO instanciaFuncionario;
	private static ArrayList<Funcionario> tabelaFuncionario;
	
	private FuncionarioDAO() {
	}
	
	public static FuncionarioDAO getInstanciaFuncionario() {

		if (instanciaFuncionario == null) {
			instanciaFuncionario = new FuncionarioDAO();
			tabelaFuncionario = new ArrayList<>();
		}

		return instanciaFuncionario;
	}

	@Override
	public boolean criarFuncionario(Funcionario f) {
			tabelaFuncionario.add(f);
			return true;
	}

	@Override
	public ArrayList<Funcionario> listarFuncionario() {
		// TODO Auto-generated method stub
		return tabelaFuncionario;
	}
	
	
}
