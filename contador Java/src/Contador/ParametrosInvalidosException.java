package Contador;

public class ParametrosInvalidosException extends Exception {
	private static final long serialVersionUID = 1L;
	public ParametrosInvalidosException(String string ) {
		super("O segundo parâmetro deve ser maior que o primeiro");
	}
	public ParametrosInvalidosException(  ) {
		super("O segundo parâmetro deve ser maior que o primeiro");
	}
	

	

}
