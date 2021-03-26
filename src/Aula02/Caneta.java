package Aula02;

public class Caneta {
    
	//atributo 
	String modelo;
	String cor;
	float ponta;
	int carga; 
	boolean tampada;
	
   
	//metodos 
	
	void status() {
		System.out.println("Modelo "+ this.modelo);
		System.out.println("cor " + this.cor);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Carga "+ this.carga);
		System.out.println("A caneta esta tanpada ? " + this.tampada);
	}
	
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! Nao posso rabiscar,Pois estou tampada");
		} 
		else {System.out.println("estou rabiscando");
		}
	}
	void tampar() {
		this.tampada = true;
	}
	void destampar() {
		this.tampada = false;
	}

	
	
}
