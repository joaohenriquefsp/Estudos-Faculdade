package Aula04;

public class Funcionario extends Pessoa {
	//Atributos
	private float salario;
	
	//Construtor:
	public Funcionario(String nome, String email, float salario) {
		super(nome, email); //esta linha � obrigat�ria!!!
		this.salario = salario;
	}
	
	public Funcionario(String nome, String email, Integer idade, float salario) {
		super(nome, email, idade); //esta linha � obrigat�ria!!!
		this.salario = salario;
	}
	
	//M�todos
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "* Funcionario:\n"
				+ "Nome    = " + super.getNome()  + "\n" 
				+ "E-mail  = " + super.getEmail() + "\n" 
				+ "Idade   = " + super.getIdade() + "\n"
				+ "Sal�rio = " + salario;
	}
	
	
}
