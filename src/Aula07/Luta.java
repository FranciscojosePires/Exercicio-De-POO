package Aula07;

import java.util.Random;

public class Luta {
    // Atributos 
	private lutador desafiado;
	private lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	// Metodos publicos 
	public void marcarLuta(lutador l1, lutador l2) {if (l1.getCategoria().equals(l2.getCategoria())&& l1 !=l2) {
	    this.aprovada = true;
	    this.desafiado = l1;
	    this.desafiante = l2;
	}else {
		this.aprovada = false;
		this.desafiado = null;
		this.desafiante = null;
	}
	}
	public void lutar () {if(this.aprovada) {System.out.println("### Desafiado ###");
	                                         this.desafiado.apresentar();
	                                         System.out.println("### Desafiante ###");
	                                         this.desafiante.apresentar();
	                                        
	                                         Random aleatorio = new Random();
	                                         int vencedor = aleatorio.nextInt(3);// 0 1 2 
	                                         switch (vencedor) 
	                                         {case 0: System.out.println("Empatou");
	                                              this.desafiado.empatarLuta();
	                                              this.desafiante.empatarLuta();
	                                              break;
	                                         case 1: // Dasafiado vence
	                                        	 System.out.println("Vitoria do "+ this.desafiado.getNome());
	                                        	 this.desafiado.ganharLuta();
	                                        	 this.desafiante.perderLuta();
	                                        	 break;
	                                         case 2 :// Desafiante vence
	                                        	 System.out.println("Vitória do "+ this.desafiante.getNome());
	                                        	 this.desafiante.ganharLuta();
	                                        	 this.desafiado.perderLuta();
	                                        	 break;
	                                         }}
	                      else{System.out.println("A luta nao pode acontecer !");}}
	
	// Metodos Especiais 
	public lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(lutador desafiado) {
		this.desafiado = desafiado;
	}
	public lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiando(lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
}
