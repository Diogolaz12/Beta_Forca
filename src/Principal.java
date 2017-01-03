import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLabel;

public class Principal {

	String[] listaPalavras = {"Software","Engenharia","Linux", "Processador","RAM","Penacova"};
	String letra;
	Random gerarpalavra = new Random();
	static String palavra1;
	static int lenght = palavra1.length();
	ArrayList<String> Errou = new ArrayList<>();


	public void Verificar(ActionEvent e){
		
		
		
		if( palavra1.contains(btnname)){
			//Label recebe a letra
		}
		else{
			//Vai aparecer cabeça e o caraças			
			Errou.add(btnname);
		}
	}
	
	
	public String Gerar(){
				
		int palavragerada= gerarpalavra.nextInt(listaPalavras.length);
		palavra1=listaPalavras[palavragerada];
		return palavra1;
	}

	public static void GerarGuess(JLabel lbl_Palavra) {
		for (int i=0;i<lenght ;i++){
			
			
			lbl_Palavra.setText(lbl_Palavra.getText()+" _ ");
			
		}
		
	}
}
