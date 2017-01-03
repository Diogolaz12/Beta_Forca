
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLabel;

public class Principal {

	static String[] listaPalavras = {"Software","Engenharia","Linux", "Processador","RAM","Penacova"};
	String letra;
	static Random gerarpalavra = new Random();
	static String palavra1;
	
	ArrayList<String> Errou = new ArrayList<>();


	/*public void Verificar(ActionEvent e){
		
		
		
		if( palavra1.contains(btnname)){
			//Label recebe a letra
		}
		else{
			//Vai aparecer cabeça e o caraças			
			Errou.add(btnname);
		}
	}*/
	
	
	public static void Gerar(JLabel lbl_Palavra){
				
		
		int palavragerada= gerarpalavra.nextInt(listaPalavras.length);
		palavra1=listaPalavras[palavragerada];
		System.out.println(palavra1);
		int lenght = palavra1.length();
		for (int i=0;i<lenght ;i++){
			
			
			lbl_Palavra.setText(lbl_Palavra.getText()+" _ ");
			
		}
		
	}

}
