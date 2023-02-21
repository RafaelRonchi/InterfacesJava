package modelo;
import java.util.ArrayList;

public interface IFuncionarioDAO {
	
	public boolean criarFuncionario(Funcionario u);

	public ArrayList<Funcionario> listarFuncionario();

}
