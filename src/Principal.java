
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Principal {

	static String[] listaPalavras = {"Software","Engenharia","Linux", "Processador","RAM","Penacova"};
	String letra;
	static Random gerarpalavra = new Random();
	static String palavraGerada;
	
	
	int letrasErradas=0;
	int letrasCertas=0;
	
	
	ArrayList<String> TodasLetras = new ArrayList<>();
	

	public void Verificar(JTextField txtLetra,JLabel cabeca,JLabel tronco,JLabel pernas,JLabel palavra){
		String word = txtLetra.getText();
		
		if(!(TodasLetras.contains(txtLetra.getText())) && txtLetra.getText()!=""){
			
			//Se for palavra
			if(word.length()>1){
				if(word==palavraGerada){
					palavra.setText(palavraGerada);
					System.out.println("Parabens,ganhou!");
					//Palavras iguais, label fica com a palavra completa
					Ganhar(); // Verifica se perde
				}
				else{
					letrasErradas++;
					Vivo(cabeca,tronco,pernas);
					Ganhar(); // Verifica se ganha
				}
			}
			
			// Se for só uma letra
			else{
				if( palavraGerada.contains(txtLetra.getText())){
					TodasLetras.add(txtLetra.getText());
					/*
					 * 
					 * Mete aqui o codigo, para meter as letras para a label,tudo o resto, está bom I guess - David
					 * 
					 * 
					 * 
					 */
					letrasCertas++;
					Ganhar(); // Verifica se perde
					
				}
				else{
					TodasLetras.add(txtLetra.getText());
					letrasErradas++;
					Vivo(cabeca,tronco,pernas);
					Ganhar(); // Verifica se ganha
				}
			}
		}
	}
	
	
	public void Vivo(JLabel cabeca,JLabel tronco,JLabel pernas){
		if(letrasErradas==1){
			cabeca.setVisible(true);
		}
		else if(letrasErradas==2){
			tronco.setVisible(true);
		}
		else if(letrasErradas==3){
			pernas.setVisible(true);
		}
		/*
		 * Vai fazendo o corpo do boneco conforme os erros - David
		 * 
		 */
	}
	
	
	public void Ganhar(){
		
		//Para o Sérgio
		
		
		
		
	}
	public void Preencher()
	
	{

	}
	
	
	public static void Gerar(JLabel lbl_Palavra){
				
		//Vai gerar uma palavra do array.
		int palavragerada= gerarpalavra.nextInt(listaPalavras.length);
		palavraGerada=listaPalavras[palavragerada];
		System.out.println(palavraGerada);
		int lenght = palavraGerada.length();
		for (int i=0;i<lenght ;i++){
			
			lbl_Palavra.setText(lbl_Palavra.getText()+"_ ");
			
		}
		
	}

}
