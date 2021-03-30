package Aula05;

public class Aula05 {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
        p1.setNumconta(2514);
        p1.setDono("Zé");
        p1.sbrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumconta(2525);
        p2.setDono("Creuza");
        p2.sbrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        
	}

}
																					