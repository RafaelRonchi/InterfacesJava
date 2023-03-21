package att3;

public class Aluno extends Pessoa{
	private Long matricula;
	

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "Nome: " + super.getNome() +" Matricula: "+
		this.getMatricula()+" Data nascimento: "+super.getDataNasc()+
		" CPF: "+ super.getCpf();
	}
}
