import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

public class main {

	String[] listaPalavras = {"Software","Engenharia","Linux", "Processador","RAM","Penacova"};
	String letra;
	Random gerarpalavra = new Random();
	String palavra1;
	ArrayList<String> Errou = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
	}
	
	public void Verificar(ActionEvent e){
		JButton obj = (JButton)e.getSource();
		String btnname = obj.getName();
		
		
		
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
	
}
