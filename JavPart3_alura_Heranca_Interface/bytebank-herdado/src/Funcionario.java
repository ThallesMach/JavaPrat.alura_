

 // _N�o pode inst�ncia dessa Class Porq ela � Abstata
 // --->>> abstract  <<-----
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
//	protected double salario;
	
// metodo sem Corpo, N�o h� impplementa��o.
	public abstract double getBonificacao();
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	

}
