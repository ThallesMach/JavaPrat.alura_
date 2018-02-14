
public class TesteGerente {

	public static void main(String[] args) {
		
		
		// Autenticavel referencia = new Cliente();
		
		
		Gerente g01 = new Gerente();
		
		g01.setNome(" Gerente Marcos ");
		g01.setCpf(" 234567890-12");
		g01.setSalario( 5000.00 );
		
		System.out.println(g01.getNome() );
		System.out.println( g01.getCpf() );
		System.out.println( g01.getSalario() );
		
        g01.setSenha(2222);
           //        boolean autenticou = g01.autentica(555);
        boolean autenticou = g01.autentica(2222);

        System.out.println(autenticou);
        
        System.out.println("---------------");
		System.out.println(g01.getBonificacao() );
	}

}
