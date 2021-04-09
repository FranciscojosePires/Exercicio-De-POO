package Aula11;

public class Bolsista extends Aluno {
	private int bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa do aluno(a) "+ this.getNome());
	}
	
	
	@Override
	public void pagarMensalidade(){
		System.out.println(this.getNome() + " é bolsista! Pagamento facilitado em "+ this.bolsa+"% de desconto ");
		
	}

	public int getBolsa() {
		return bolsa;
	}


	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
}
