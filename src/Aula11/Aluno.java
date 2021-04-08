package Aula11;

public class Aluno extends Pessoa  {
	private int matricola;
	private String curso;
	
	public void pagarMensalidade() {
		System.out.println("pagando mensalidade do aluno "+ this.getNome());
	}

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

	@Override
	public String toString() { System.out.println(this.getNome());
		return "Aluno [matricola = " + matricola + ", curso = " + curso + "]";
			
	}

}
