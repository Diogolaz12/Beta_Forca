import java.util.Random;

public class main {

	String[] listaPalavras = {"Software","Engenharia","Linux", "Processador","RAM","Penacova"};
	String palavra;
	Random gerarpalavra = new Random();
	String palavra1;
	public static void main(String[] args) {
		
		
	}
	
	public void Verificar(){
		
		if( palavra1.contains(palavra)){
			
			
			
			
		}
	}
	
	
	public String Gerar(){
				
		int palavragerada= gerarpalavra.nextInt(listaPalavras.length);
		palavra1=listaPalavras[palavragerada];
		return palavra1;
	}
	
}
