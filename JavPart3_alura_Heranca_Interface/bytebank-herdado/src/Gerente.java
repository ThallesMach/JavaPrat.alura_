
public class Gerente extends FuncionarioAutenticavel {

	
	
	public double getBonificacao() {
		System.out.println(" Chamando metodo Bonifica��o do Gerente ");
		return super.getSalario();
	}
	
	
}
