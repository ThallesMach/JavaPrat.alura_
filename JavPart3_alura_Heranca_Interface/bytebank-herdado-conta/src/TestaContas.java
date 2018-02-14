
public class TestaContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente( 111, 123 );
		cc.deposita( 100.00 );
		
		ContaPoupanca cp = new ContaPoupanca(111, 321 );
		cp.deposita( 200.00 );
		
		cc.transfere( 10.00, cp );
		
		
		System.out.println("CC " + cc.getSaldo() );
		System.out.println("---------------");
		System.out.println("CP " + cp.getSaldo() );
		

	}

}
