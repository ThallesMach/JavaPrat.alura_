import javax.swing.JOptionPane;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome( JOptionPane.showInputDialog(" Digita Nome: ") );
		paulo.setCpf("222.222.222.-22");
		paulo.setProfissao("_Programador");

		Conta contaDoPaulo = new Conta(6646,969060);
		contaDoPaulo.deposita(100);

		contaDoPaulo.setTitular(paulo);
		System.out.println(contaDoPaulo.getTitular().getNome());
		System.out.println(contaDoPaulo.getTitular());

	}
}