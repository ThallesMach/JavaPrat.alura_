import javax.swing.JOptionPane;

public class TestaFuncionario {

	public static void main(String[] args) {


		Gerente nico = new Gerente();
		nico.setNome( JOptionPane.showInputDialog(" Digita Nome" ) );
//				nico.setNome(" Nico Steppat ");
		nico.setCpf(" 123456789-11");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome() );
		System.out.println(nico.getBonificacao() );
		
		
		
	}

}
