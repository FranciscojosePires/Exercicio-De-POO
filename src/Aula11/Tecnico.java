package Aula11;

public class Tecnico extends Aluno {
   private int registroProfissional;
   
   public void praticar() {
	   System.out.println("Presente na aria de atuação o aluno(a) técnico(a) "+this.getNome());
   }

   public int getRegistroProfissional() {
	return registroProfissional;
}
public void setRegistroProfissional(int registroProfissional) {
	this.registroProfissional = registroProfissional;
}
   
}
