package aula12;

public class Peixe extends Animal{
        private String corEscama;
        public void soltarBolhas() {
        	System.out.println("Soltando uma Bolha");
        }
		@Override
		public void locomover() {
			System.out.println("Nadando");
		}
		@Override
		public void alimentar() {
			System.out.println("Comendo subst�ncias");
		}
		@Override
		public void emitirSom() {
			System.out.println("Peixe n�o faz som");
		}
		
		//Get and Set
		public String getCorEscama() {
			return corEscama;
		}
		public void setCorEscama(String corEscama) {
			this.corEscama = corEscama;
		}
        
        
}
