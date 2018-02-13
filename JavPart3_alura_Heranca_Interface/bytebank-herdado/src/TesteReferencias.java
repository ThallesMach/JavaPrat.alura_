import javax.swing.JOptionPane;

public class TesteReferencias {

    public static void main(String[] args) {

        Gerente g01 = new Gerente();
        
        g01.setNome( JOptionPane.showInputDialog(" Digita Nome" ) );
        //	g1.setNome("Marcos");
        g01.setSalario(5000.0);

        Funcionario f = new Funcionario();
	 	f.setSalario( 2000.00 );

	 	EditorVideo ev = new EditorVideo();
	 	ev.setSalario( 2500.00 );
	 	
        Designer d = new Designer();
        d.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g01);
        controle.registra(f);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());
        
        System.out.println( g01.getNome() );

    }

}