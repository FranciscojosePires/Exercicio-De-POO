package Aula11;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//Classe visitante 
		Visitante v1 = new Visitante();
		v1.setNome("creid");
		v1.setIdade(45);
		v1.setSexo("F");
		System.out.println(v1.toString());
		System.out.println(".............................");

		//classe aluno 
		Aluno a1 = new Aluno ();
		a1.setNome("Claudio");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.setMatricula(1478);
		a1.setCurso("Mecatronica");
	    System.out.println(a1.toString());
		a1.pagarMensalidade();
		System.out.println("..............................");
		
		//classe bolsista
		Bolsista b1 = new Bolsista();
		b1.setNome("Jubileu");
		b1.setIdade(15);
		b1.setSexo("M");
		System.out.println(b1.toString());
		b1.setMatricula(2254);
		b1.setCurso("Matematica");
		b1.setBolsa(60);
		b1.pagarMensalidade();
		b1.renovarBolsa();
		System.out.println("..............................");
	
		//classe técnico
		Tecnico t1 = new Tecnico();
		t1.setNome("Flavia");
		t1.setIdade(20);
		t1.setSexo("F");
		System.out.println(t1.toString());
		t1.setMatricula(2654);
		t1.setCurso("Enfermagem");
		t1.setRegistroProfissional(1594);
		t1.praticar();
		System.out.println("Com Matricula "+ t1.getMatricula());
		System.out.println("..........................");
		
		
		
		
		//Classe professor 
	    Professor p1 = new Professor();
		p1.setNome("Pedro");
		p1.setIdade(50);
		p1.setSexo("M");
		System.out.println(p1.toString());
		p1.setEspecialidade("Mecatronica");
		p1.setSalario(3000);
		System.out.println("Professor: "+p1.getNome() +" especialidade em "
		+p1.getEspecialidade()+" com o Salario de "+ p1.getSalario());
		
	}

}
