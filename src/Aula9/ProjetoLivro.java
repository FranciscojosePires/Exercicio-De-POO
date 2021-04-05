package Aula9;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0]=new Pessoa ("Pedro",22,"M");
		p[1]=new Pessoa ("Maria",22,"F");
		
		l[0]= new Livro ("Aprendendo Java","Jose dos Santos", 300, p[0]);
		l[1]= new Livro ("Poo para iniciantes","Zé Paulo", 500, p[1]);
		l[2]= new Livro (" Java aAvançado","Maria carla", 800, p[0]);
		
		System.out.println(l[0].detalhes());

	}

}
