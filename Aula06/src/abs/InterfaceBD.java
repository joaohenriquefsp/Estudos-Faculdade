package abs;

/*
 * Esta � uma classe que cont�m apenas o 'CONTRATO' de cria��o de fun��es
 * que ser�o utilizadas por quem chamar esta. A classe que
 * utilizar esta interface estar� 'comprometida' a utilizar/implementar
 * os m�todos contidos nela.
 */
public interface InterfaceBD {
	public void conectar(String servidor);
	public void executar(String SQL);
	public void desconectar(String servidor);
}
