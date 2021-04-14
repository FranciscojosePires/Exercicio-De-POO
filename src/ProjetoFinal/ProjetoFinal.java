package ProjetoFinal;

public class ProjetoFinal {

	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		Aluno a[] = new Aluno[2];
		
		v[0] = new Video("Aulas 2 de Mecatronica");
		v[1] = new Video("Aula 15 de Musica");
		v[2] = new Video("Aula 6 de Biologia");
		
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		System.out.println("\n.......................");
		
		a[0] = new Aluno("Roberto ",18,"M ","rob1818");
		a[1] = new Aluno("Flavia",21,"F ","Flavia@123");
		
		System.out.println(a[0].toString());
		System.out.println(a[1].toString());
		System.out.println("\n.......................");
		
		
		
		
		Visualizacao vis[] = new Visualizacao[5];
		
		vis[0] = new Visualizacao(a[0],v[2]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		System.out.println(".....................................................");
		
		vis[1] = new Visualizacao(a[0],v[1]);
		vis[0].avaliar(88.0f);
		System.out.println(vis[1].toString());
		

		

	}

}
