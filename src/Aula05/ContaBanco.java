package Aula05;

public class ContaBanco {
	
	//Atributos 
	public int numconta ;
	protected String ipo;
	private String dono;
	private float saldo;
	private boolean status;

	//Metodos 
	public void estadoAtual() {
		System.out.println("...................................");
		System.out.println("Conta "+this.getNumconta(dono));
		System.out.println("tipo "+this.getIpo());
		System.out.println("Dono "+ this.getDono());
		System.out.println("Saldo "+this.getSaldo());
		System.out.println("Status "+this.getStatus());
		System.out.println("..............................");
	}
	
	
	public void sbrirConta(String t) {
		this.setIpo(t);
		this.setStatus(true);
		if (t=="CC") {this.setSaldo(50);}
		else if (t=="CP") {this.setSaldo(150);}
		System.out.println("Conta aberta com sucesso ");
		}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) System.out.println("Conta com dinheiro ");
		else if (this.getSaldo() < 0) System.out.println("Conta em debito ");
		 else { this.setStatus(false);System.out.println("Conta fechada");}
		}
	
	public void depositar(float v) {
		if (this.getStatus()) {this.setSaldo(this.getSaldo() + v);
		System.out.println("Deposito realisado na conta  "+this.getDono());}
		else {System.out.println("impossivel depositar, conta fechada ");}
	}
	
	public void sacar(float v) {
		if (this.getStatus()) { if(this.getSaldo()>=v) {this.setSaldo(this.getSaldo()-v); 
		System.out.println("Saque realisado na conta de "+ this.getDono()); }
		else {System.out.println("Saldo insuficiente ");}
	}else {System.out.println("Conta fechada ");}
	}
	
	public void pagarMensal() {
		int v = 0;
		if(this.getIpo()=="CC") {v=12;}
		else if (this.getIpo()=="CP") {v=20;}
		if(this.getStatus()) {this.setSaldo(this.getSaldo() - v);System.out.println("Mensalidade paga por "+this.getDono());}
		else {System.out.println("Impossivel pagar, conta feichada" );}
	}
	
	// Metodo construtor
	//public ContaBanco(float saldo, boolean status) {
	//	super();
	////	this.setSaldo(0);
		//this.setStatus(false);
//	}
	
	// Metodos get e set 
	public int getNumconta(String t) {
		return numconta;
	}
	public void setNumconta(int numconta) {
		this.numconta = numconta;
	}
	public String getIpo() {
		return ipo;
	}
	public void setIpo(String ipo) {
		this.ipo = ipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
