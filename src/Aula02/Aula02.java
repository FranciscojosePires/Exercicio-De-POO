package Aula02;
 public class Aula02 {
    public static void main(String[] args) {
		
    	Caneta c1 = new Caneta();
		
    	c1.modelo = "Bic cristal";
		c1.cor = "azul ";
		c1.ponta = 0.5f;
		c1.tampar();
        c1.status();
		c1.rabiscar();
		System.out.println("...........................");
		
		Caneta c2 = new Caneta();
		
		c2.modelo = "ster";
		c2.cor = "amarelo";
		c2.ponta = 0.9f;
		c2.destampar();
		c2.status();
		c2.rabiscar();
		
	}

}
