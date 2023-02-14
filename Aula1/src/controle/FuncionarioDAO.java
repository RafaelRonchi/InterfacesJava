package controle;

import java.util.ArrayList;

import modelo.Funcionario;

public class FuncionarioDAO {
	private static ArrayList<Funcionario> listaFuncionarios;
	private static FuncionarioDAO instanciaFuncionario;
	
	
	public boolean inserir(Funcionario func) {
		listaFuncionarios.add(func);
		return false;
		
	}
	public static FuncionarioDAO getInstancia() {
		return instanciaFuncionario;
	}
	public static void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		FuncionarioDAO.listaFuncionarios = listaFuncionarios;
	}
	public ArrayList<Funcionario> listar(){
		return listaFuncionarios;
	}
	public FuncionarioDAO() {
		listaFuncionarios = new ArrayList<>();
	}
	
}
