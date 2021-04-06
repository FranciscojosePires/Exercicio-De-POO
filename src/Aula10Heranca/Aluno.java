package Aula10Heranca;

public class Aluno extends Pessoa {

	private int matricola;
	private String curso ;
	
	public void canselarMatricola() {System.out.println("Matricola será cancelada ");}

	
	//get and set
	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
