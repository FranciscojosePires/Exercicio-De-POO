package Aula11;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//Classe vesitante 
		Vesitante v1 = new Vesitante();
		v1.setNome("creid");
		v1.setIdade(45);
		v1.setSexo("F");
		System.out.println(v1.toString());
		System.out.println(".............................");

		//classe aluno 
		Aluno a1 = new Aluno ();
		a1.setNome("Claudio");
		a1.setIdade(16);
		a1.setSexo("F");
		a1.setMatricola(1478);
		a1.setCurso("Mecatronica");
	    System.out.println(a1.toString());
		a1.pagarMensalidade();
		System.out.println("..............................");
		
		//classe bolsista
		Bolsista b1 =new Bolsista();
		b1.setNome("Jubileu");
		b1.setIdade(15);
		b1.setSexo("M");
		b1.setMatricola(2254);
		b1.pagarMensalidade();
		b1.setBolsa(60);
		System.out.println("..............................");
	}

}
