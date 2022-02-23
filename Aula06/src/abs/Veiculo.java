package abs;

// Tipo gen�rico de classe
// todo m�todo que herdar e ve�culo vai ter modelo e placa. <==heran�a
public abstract class Veiculo {
	//Atributos
	private String modelo;
	private String placa;
	
	//Construtor
	public Veiculo(String modelo, String placa) {
		this.modelo = modelo;
		this.placa = placa;
	}

	//Gets Sets
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	//m�todo:
	/*
	 * Este m�todo n�o tem l�gica de programa��o:
	 *  - Toda a classe que colocar para herdar essa classe ser� obrigado
	 *  que tenha um m�todo chamado calcularAluguel com o par�metro
	 *  qteDias int e criar a l�gica (regra de neg�cio)
	 */
	public abstract float calcularAluguel(int qteDias);
	
}
