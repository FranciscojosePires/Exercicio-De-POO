package Aula11;

public class Tecnico extends Aluno {
   private int registroProfissional;
   
   public void praticar() {
	   System.out.println("Presente na aria de atua��o o aluno(a) t�cnico(a) "+this.getNome());
   }

   public int getRegistroProfissional() {
	return registroProfissional;
}
public void setRegistroProfissional(int registroProfissional) {
	this.registroProfissional = registroProfissional;
}
   
}
