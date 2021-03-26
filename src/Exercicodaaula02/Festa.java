package Exercicodaaula02;

public class Festa {

	//atributos 
    float hora;
    int capacidadeDePessoas ;
    float valor;
    String tema;
    boolean acesso;
    
    //metodos
   void status () {
	   System.out.println("tema "+ this.tema);	 
	   System.out.println("Valor R$ "+ this.valor);
	   System.out.println("Horario "+ this.hora);
	   System.out.println("posso entrar na festa ? "+ this.acesso );
   }
   void quantidadeDepessoas () {
	   if (this.acesso == true) {
		   System.out.println("Nao pode entrar, Casa cheia ");
	   }
	   else {
		   System.out.println("Acesso permitido" );}
   }
   void entrar () {
	 this.acesso = true;
   }
   void sair() {
	   this.acesso = false;
   }
   
   
   
}
