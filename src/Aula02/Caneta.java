package Aula02;

public class Caneta {
    
	//atributo 
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga; 
	private boolean tampada;
	
   
	//metodos 
	
	void status() {
		System.out.println("Modelo "+ this.modelo);
		System.out.println("cor " + this.cor);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Carga "+ this.carga);
		System.out.println("A caneta esta tanpada ? " + this.tampada);
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! Nao posso rabiscar,Pois estou tampada");
		} 
		else {System.out.println("estou rabiscando");
		}
	}
	protected void tampar() {
		this.tampada = true;
	}
	protected void destampar() {
		this.tampada = false;
	}

	
	
}
