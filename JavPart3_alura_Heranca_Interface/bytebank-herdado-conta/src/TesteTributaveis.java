
//	07 Praticando heran�a e interfaces

		// 03  Implementando tributaveis
			// 11 -->>Conclus�o
public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.00);
		
		SeguroDeVida seguro =new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registro(cc);
        calc.registro(seguro);

        System.out.println(calc.getTotalImposto());
	}

}