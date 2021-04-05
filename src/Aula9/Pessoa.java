package Aula9;

public class Pessoa {
	private String nome;
	private int idade;
	private String Sexo;
	
	public void fazerAniver() {this.idade++;}

	//Construtor 
	public Pessoa(String nome, int idade, String sexo) {
	
		this.nome = nome;
		this.idade = idade;
		this.Sexo = sexo;
	}

    //get and set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	
	
	
	

}
