
public class Gerente extends FuncionarioAutenticavel {

	
	
	public double getBonificacao() {
		System.out.println(" Chamando metodo Bonificação do Gerente ");
		return super.getSalario();
	}
	
	
}
