package Aula07;

public class UltraCombatt {

	public static void main(String[] args) {
		lutador l[] = new lutador[6];

		l[0] = new lutador("Pretty Boy", "Fran�a", 31, 1.75f,  68.9f, 11, 2, 1); 
		l[1] = new lutador("Putscript", "Brasil", 29 ,  1.68f,  57.8f, 14, 2, 3);
		l[2] = new lutador("Snapshadow", "EUA", 35 ,  1.65f,  80.9f, 12, 2, 1);
		l[3] = new lutador("Dead Code", "Australia",  28,  1.93f,  81.6f, 13, 0, 2);
		l[4] = new lutador("UFOCollbol", "Brasil", 37 ,  1.70f,  119.3f, 5, 4, 3);
		l[5] = new lutador("Nerdaart", "EUA", 30 ,  1.81f,  105.7f, 12, 2, 4);
	
		Luta uec01 = new Luta();
		uec01.marcarLuta(l[5], l[4]);
		uec01.lutar();
		l[5].Status();
		l[4].Status();
	}
	
      

}
